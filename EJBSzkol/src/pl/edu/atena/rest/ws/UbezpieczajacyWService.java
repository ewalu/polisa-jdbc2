package pl.edu.atena.rest.ws;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebParam.Mode;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.ws.Holder;

import pl.edu.atena.entities.Polisa;
import pl.edu.atena.entities.Ubezpieczajacy;

@WebService(serviceName = "Akademia", targetNamespace = "http://pl.edu.atena.akademia")
public class UbezpieczajacyWService {
	@WebResult(name = "result", targetNamespace = "http://pl.edu.atena.akademia")
	@WebMethod(operationName = "insurer")
	public Ubezpieczajacy Ubezp(
			@WebParam(name = "name", targetNamespace = "http://pl.edu.atena.akademia") String nazwa,
			@WebParam(name = "test", targetNamespace = "http://pl.edu.atena.akademia", mode = Mode.INOUT) Holder<Integer> test
			/*, Polisa polisa*/) {
		Ubezpieczajacy ubezp = new Ubezpieczajacy();
		ubezp.setNazwa(nazwa);
		ubezp.setId(Long.valueOf(1));
		//ubezp.setPolisa(polisa);
		
		test.value +=10;
		
		//test = new Holder<Integer>(test.value+10);
		return ubezp;
	}

}
