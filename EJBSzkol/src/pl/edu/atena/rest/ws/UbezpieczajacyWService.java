package pl.edu.atena.rest.ws;

import javax.jws.WebService;

import pl.edu.atena.entities.Polisa;
import pl.edu.atena.entities.Ubezpieczajacy;

@WebService(serviceName = "Akademia", targetNamespace = "http://pl.edu.atena.akademia")
public class UbezpieczajacyWService {
	public Ubezpieczajacy Ubezp(String nazwa/*, Polisa polisa*/) {
		Ubezpieczajacy ubezp = new Ubezpieczajacy();
		ubezp.setNazwa(nazwa);
		//ubezp.setPolisa(polisa);
		return ubezp;
	}

}
