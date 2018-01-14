package pl.edu.atena.rest;

import java.time.LocalDate;

import javax.annotation.Resource;
import javax.ejb.EJB;
import javax.ejb.SessionContext;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import pl.edu.atena.biz.polisa.PolisaBean;
//import pl.edu.atena.biz.polisa.PolisaBean;
import pl.edu.atena.biz.polisa.PolisaLocal;
import pl.edu.atena.biz.polisa.PolisaRemote;
import pl.edu.atena.biz.polisa.RyzykoBean;

@Path("/polisa")
public class PolicyService {
	
	//@Resource
	//private SessionContext context;
	
	@EJB (beanName = "PolisaDobra")
	private PolisaLocal polisaLBean;
	
	@EJB (beanName = "PolisaZla")
	private PolisaRemote polisaRBean;
	
	@EJB (mappedName = "java:module/PolisaZla!pl.edu.atena.biz.polisa.PolisaZleBean")
	private PolisaRemote polisaRRBean;
	
	@EJB
	private PolisaBean polisaBean;
	@EJB
	private RyzykoBean ryzykoBean;

	
	@GET
	@Path("/{param1}/{param2}")
	@Produces(MediaType.APPLICATION_JSON)
	public Response dodaj(@PathParam("param1") int param1, @PathParam("param2") int param2) {
		int wynik1 = polisaLBean.dodaj(param1, param2);
		int wynik2 = polisaRRBean.dodaj(param1, param2);
		
		polisaBean.dzialaj();
		ryzykoBean.dzialaj();
		
		
		Result result = new Result();
		result.setWynik1(wynik1);
		result.setWynik2(wynik2);
		result.setWynik3(ryzykoBean.dodajRyzyko(param1, param2));
		result.setData(LocalDate.now());
		
		return Response.status(200).entity(result).build();
	}

}
