package pl.edu.atena.rest.ws;

import javax.jws.WebService;

@WebService
public class TestWService {
	
	public String PrzywitajSie(String name) {
		return "Jak siê masz "+name+"?";
	}

}
