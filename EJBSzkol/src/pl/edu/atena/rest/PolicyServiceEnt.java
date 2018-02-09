package pl.edu.atena.rest;

import java.math.BigDecimal;
import java.time.LocalDate;

import javax.annotation.Resource;
import javax.ejb.EJB;
import javax.ejb.SessionContext;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import pl.edu.atena.dao.PolisaDao;
import pl.edu.atena.entities.Polisa;

@Path("/polisa")
public class PolicyServiceEnt {
	
	//@Resource
	//private SessionContext context;
	
	@EJB PolisaDao polisaDao;
	
	
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
	@Path("/create/{numerPolisy}/{ubezpieczajacy}/{skladka}")
	public Response create2(@PathParam("numerPolisy") String numerPolisy, 
			@PathParam("ubezpieczajacy") String ubezpieczajacy, 
			@PathParam("skladka") BigDecimal skladka) {
				Polisa polisa = new Polisa();
				polisa.setNumerPolisy(numerPolisy);
				polisa.setUbezpieczajacy(ubezpieczajacy);
				polisa.setSkladka(skladka);
				polisaDao.create(polisa);
				//Response.status(200).entity(polisa).build();
				//return polisa;
				return Response.status(200).entity(polisa).build();
	}
	//http://localhost:8080/EJBSzkol/api/polisa/update
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

	
	
	

}
