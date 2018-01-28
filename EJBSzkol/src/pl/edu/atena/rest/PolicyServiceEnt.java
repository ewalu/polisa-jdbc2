package pl.edu.atena.rest;

import java.time.LocalDate;

import javax.annotation.Resource;
import javax.ejb.EJB;
import javax.ejb.SessionContext;
import javax.ws.rs.Consumes;
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
	
	
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	@Path("/create")
	public Response create(Polisa polisa) {
		polisaDao.create(polisa);
		return Response.status(200).entity(polisa).build();
	}
	
	
	
	

}
