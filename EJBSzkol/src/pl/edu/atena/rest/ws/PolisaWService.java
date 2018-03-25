package pl.edu.atena.rest.ws;

import java.math.BigDecimal;

import javax.ejb.EJB;
import javax.inject.Inject;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;

import pl.edu.atena.dao.PolisaDao;
import pl.edu.atena.entities.Polisa;
import pl.edu.atena.entities.StatusPolisy;

@WebService(serviceName = "Polisa", targetNamespace = "http://pl.edu.atena.akademia")
public class PolisaWService {
	
	@Inject
	private PolisaDao polisaDao;
	
	@WebResult(name = "polisa", targetNamespace = "http://pl.edu.atena.akademia")
	@WebMethod
	public Polisa RejestracjaPolisy(Polisa polisa) {
		polisaDao.create(polisa);
		return polisa;
	}
	@WebResult(name = "polisa", targetNamespace = "http://pl.edu.atena.akademia")
	@WebMethod
	public Polisa WyszukajPolise(@WebParam(name = "numer", targetNamespace = "http://pl.edu.atena.akademia")String numer) {
		Polisa pol = polisaDao.szukajPoNumerze(numer);
		return pol;
	}
	@WebResult(name = "polisa", targetNamespace = "http://pl.edu.atena.akademia")
	@WebMethod
	public Polisa WyszukajPoliseId(@WebParam(name = "id", targetNamespace = "http://pl.edu.atena.akademia")Long id) {
		Polisa pol = polisaDao.find(id);
		return pol;
	}

}
