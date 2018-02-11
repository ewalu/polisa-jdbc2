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
import pl.edu.atena.dao.UbezpieczajacyDao;
import pl.edu.atena.entities.Polisa;
import pl.edu.atena.entities.Ubezpieczajacy;

@Path("/ubezpieczajacy")
public class UbezpieczajacyService {
	
	//@Resource
	//private SessionContext context;
	
	@EJB UbezpieczajacyDao ubezpDao;
	@EJB PolisaDao polisaDao;
	
	
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	@Path("/create")
	public Response create(Ubezpieczajacy ubezp) {
		ubezpDao.create(ubezp);
		return Response.status(200).entity(ubezp).build();
	}
	//http://localhost:8080/EJBSzkol/api/ubezpieczony/create
	@GET
	@Path("/create/{nazwa}")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public Ubezpieczajacy create2(@PathParam("nazwa") String nazwa) {
				Ubezpieczajacy ubezp = new Ubezpieczajacy();
				ubezp.setNazwa(nazwa);
				ubezpDao.create(ubezp);
				return ubezp;
	}
	
	@GET
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	@Path("/update/{id_pol}/{id_ubezp}")
	public Response update(@PathParam("id_pol") Long id_pol, @PathParam("id_ubezp") Long id_ub) {
		Polisa polisa = polisaDao.find(id_pol);
		Ubezpieczajacy ubezp = ubezpDao.dodajPolise(id_ub, polisa);
		return Response.status(200).entity(ubezp).build();
	}
}