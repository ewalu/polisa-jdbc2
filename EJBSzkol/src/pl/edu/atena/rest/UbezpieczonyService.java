package pl.edu.atena.rest;

import java.math.BigDecimal;

import javax.ejb.EJB;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import pl.edu.atena.dao.PolisaDao;
import pl.edu.atena.dao.UbezpieczonyDao;
import pl.edu.atena.entities.Polisa;
import pl.edu.atena.entities.Ubezpieczony;

@Path("/ubezpieczony")
public class UbezpieczonyService {
	
	//@Resource
	//private SessionContext context;
	
	@EJB UbezpieczonyDao ubezpDao;
	@EJB PolisaDao polisaDao;
	
	
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	@Path("/create")
	public Response create(Ubezpieczony ubezp) {
		ubezpDao.create(ubezp);
		return Response.status(200).entity(ubezp).build();
	}
	//http://localhost:8080/EJBSzkol/api/polisa/create
	@GET
	@Path("/create/{nazwa}/{polisa_id}")
	@Produces(MediaType.APPLICATION_JSON)
	public Ubezpieczony create2(@PathParam("nazwa") String nazwa, 
			@PathParam("polisa_id") Long polisa_id) {
				Ubezpieczony ubezp = new Ubezpieczony();
				ubezp.setNazwa(nazwa);
				ubezp.setPolisa(polisaDao.find(polisa_id));
				return ubezp;
	}
}