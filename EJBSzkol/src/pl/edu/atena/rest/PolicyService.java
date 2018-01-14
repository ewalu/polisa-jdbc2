package pl.edu.atena.rest;

import javax.ejb.EJB;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

//import pl.edu.atena.biz.polisa.PolisaBean;
import pl.edu.atena.biz.polisa.PolisaLocal;
import pl.edu.atena.biz.polisa.PolisaRemote;

@Path("/polisa")
public class PolicyService {
	
	@EJB
	private PolisaLocal polisaLBean;
	
	@EJB
	private PolisaRemote polisaRBean;
	
	@GET
	@Path("/{param1}/{param2}")
	@Produces(MediaType.APPLICATION_JSON)
	public Response dodaj(@PathParam("param1") int param1, @PathParam("param2") int param2) {
		int wynik = polisaRBean.dodaj(param1, param2);
		return Response.status(200).entity(wynik).build();
	}

}
