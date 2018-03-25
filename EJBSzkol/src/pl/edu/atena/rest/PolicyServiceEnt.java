package pl.edu.atena.rest;

import java.math.BigDecimal;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.Date;
import java.util.List;
import javax.ejb.Timer;
import javax.ejb.TimerService;


import javax.annotation.Resource;
import javax.ejb.EJB;
import javax.ejb.Schedule;
import javax.ejb.SessionContext;
import javax.enterprise.event.Event;
import javax.inject.Inject;
import javax.inject.Named;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import pl.edu.atena.biz.annotations.PolisaEvent;
import pl.edu.atena.biz.annotations.PolisaEvent.Typ;
import pl.edu.atena.biz.file.ZapiszDoJSON;
import pl.edu.atena.biz.file.ZapiszDoPliku;
import pl.edu.atena.biz.file.ZapiszDoXML;
import pl.edu.atena.biz.producers.PolicyNewProducer;
import pl.edu.atena.biz.producers.PolicyNewToTopicProducer;
import pl.edu.atena.biz.timers.PolicyCountTimer;
import pl.edu.atena.dao.AudytDao;
import pl.edu.atena.dao.PolisaDao;
import pl.edu.atena.dao.UbezpieczajacyDao;
import pl.edu.atena.entities.Polisa;
import pl.edu.atena.entities.StatusPolisy;
import pl.edu.atena.entities.Ubezpieczajacy;
import pl.edu.atena.entities.Audyt;

@Path("/polisa")
public class PolicyServiceEnt {
	
	//@Resource
	//private SessionContext context;
	
	@EJB PolisaDao polisaDao;
	@EJB UbezpieczajacyDao ubDao;
	
	@EJB
	private PolicyNewProducer policyNewProducer;
	@Inject
	private PolicyNewToTopicProducer policyNewToTopicProducer;
	@EJB
	private PolicyCountTimer policyCountTimer;
	@Inject
	private Event<Polisa> event;
	@Inject
	@PolisaEvent(Typ.ZATWIERDZ)
	private Event<Polisa> eventZatwierdz;
	@Inject
	@PolisaEvent(Typ.ZAWIESZ)
	private Event<Polisa> eventZawiesz;
	
	@Inject
	@Named
	private ZapiszDoPliku xml;
	//@Inject
	//@Named
	//private ZapiszDoPliku json;
	
	@GET
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	@Path("/create")
	public Response create(Polisa polisa) {
		polisaDao.create(polisa);
		return Response.status(200).entity(polisa).build();
	}
	//http://localhost:8080/EJBSzkol/api/polisa/create/Ewa001/EWA/666
	//http://localhost:8080/EJBSzkol/api/polisa/create
	
	@GET
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	@Path("/create/{numerPolisy}/{ubezpieczajacy}/{skladka}/{status}")
	public Polisa create2(@PathParam("numerPolisy") String numerPolisy, 
			@PathParam("ubezpieczajacy") String ubezpieczajacy, 
			@PathParam("skladka") BigDecimal skladka,
			@PathParam("status") StatusPolisy status) {
				Polisa polisa = new Polisa();
				polisa.setNumerPolisy(numerPolisy);
				polisa.setUbezpieczajacy(ubezpieczajacy);
				polisa.setSkladka(skladka);
				polisa.setStatus(status);
				polisaDao.create(polisa);
				xml.zapisz(polisa);
				//jsonn.zapisz(polisa);
				
				policyNewProducer.sendPolicy(polisa);
				
				policyNewToTopicProducer.sendPolicy(polisa);
				
				policyCountTimer.create();
				policyCountTimer.timery();
				
				Response.status(200).entity(polisa).build();
				
				Ubezpieczajacy ub = new Ubezpieczajacy();
				
				ub.setNazwa(ubezpieczajacy);
				ub.setPolisa(polisa);
				ubDao.create(ub);
				if (polisa.getStatus().equals(StatusPolisy.ZATWIERDZONA)) {
					eventZatwierdz.fire(polisa);
				}
				if (polisa.getStatus().equals(StatusPolisy.ZAWIESZONA)) {
					eventZawiesz.fire(polisa);
				}
				
				return polisa;
				//return Response.status(200).entity(polisa).build();
	}
	//http://localhost:8080/EJBSzkol/api/polisa/update
	//http://localhost:8080/EJBSzkol/index.html
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	@Path("/update")
	public Response update(Polisa polisa) {
		Polisa pol = polisaDao.update(polisa.getId(), polisa.getUbezpieczajacy());
		return Response.status(200).entity(pol).build();
	}
	
	@DELETE
	@Produces(MediaType.APPLICATION_JSON)
	@Path("/delete/{id}")
	public Response delete(@PathParam("id") Long id) {
		polisaDao.delete(id);
		return Response.status(200).build();
	}
	
	@GET
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	@Path("/find/numer/{numerPolisy}")
	public Polisa findByNumber(@PathParam("numerPolisy") String numerPolisy) {
				Polisa polisa = polisaDao.szukajPoNumerze(numerPolisy);
				Response.status(200).entity(polisa).build();
				return polisa;
	}
	
	@GET
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	@Path("/find/status/{statusPolisy}")
	public List<Polisa> findByStatus(@PathParam("statusPolisy") StatusPolisy statusPolisy) {
				List<Polisa> polisy = polisaDao.szukajPoStatusie(statusPolisy);
				Response.status(200).entity(polisy).build();
				return polisy;
	}

	
	
	

}
