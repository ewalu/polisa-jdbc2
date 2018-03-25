package pl.atena.edu.akademia.PolisaWSClient;

import javax.xml.ws.BindingProvider;

/**
 * Hello world!
 *
 */
public class App 
{
	private static Polisa_Service poli = new Polisa_Service();
    public static void main( String[] args )
    {
    	PolisaWService ps = poli.getPolisaWServicePort();
    	
    	((BindingProvider) ps).getRequestContext().put(BindingProvider.ENDPOINT_ADDRESS_PROPERTY, "http://localhost:8081/EJBSzkol/Polisa");
    	
    	String numer = "ewa001";
    	ps.wyszukajPolise(numer);
    }
}
