package pl.atena.edu.akademia.AkademiaWSClient;

import javax.xml.ws.Holder;
import javax.xml.ws.BindingProvider;

/**
 * Hello world!
 *
 */
public class App 
{
	private static Akademia akademia = new Akademia();
    public static void main( String[] args )
    {
    	UbezpieczajacyWService ws = akademia.getUbezpieczajacyWServicePort();
    	
    	((BindingProvider) ws).getRequestContext().put(BindingProvider.ENDPOINT_ADDRESS_PROPERTY, "http://localhost:8081/EJBSzkol/Akademia");
    	
    	Holder<Ubezpieczajacy> ubezpieczajacy= new Holder<Ubezpieczajacy>();
    	Holder<Integer> test = new Holder<Integer>();
    	test.value = 1;
    	//ubezpieczajacy.value.setNAME("Ewa");
    	ws.insurer("Ewa", test, ubezpieczajacy);
        System.out.println("Ubezpieczajacy " +ubezpieczajacy.value.getNAME());
    }
}
