package pl.edu.atena.rest;

import java.time.LocalDate;

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
	
	@EJB (beanName = "PolisaDobra")
	private PolisaLocal polisaLBean;
	
	@EJB (beanName = "PolisaZla")
	private PolisaRemote polisaRBean;
	
	@GET
	@Path("/{param1}/{param2}")
	@Produces(MediaType.APPLICATION_JSON)
	public Response dodaj(@PathParam("param1") int param1, @PathParam("param2") int param2) {
		int wynik1 = polisaLBean.dodaj(param1, param2);
		int wynik2 = polisaRBean.dodaj(param1, param2);
		
		Result result = new Result();
		result.setWynik1(wynik1);
		result.setWynik2(wynik2);
		result.setData(LocalDate.now());
		
		return Response.status(200).entity(result).build();
	}

}
