package pl.edu.atena.biz.polisa;

import javax.ejb.Stateless;

@Stateless
public class PolisaBean {
	
	public int dodaj(int param1, int param2) {
		return param1+param2;
	}

}
