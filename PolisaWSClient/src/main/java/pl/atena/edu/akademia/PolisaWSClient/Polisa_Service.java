package pl.atena.edu.akademia.PolisaWSClient;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.WebServiceFeature;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "Polisa", targetNamespace = "http://pl.edu.atena.akademia", wsdlLocation = "http://localhost:8080/EJBSzkol/Polisa?wsdl")
public class Polisa_Service
    extends Service
{

    private final static URL POLISA_WSDL_LOCATION;
    private final static WebServiceException POLISA_EXCEPTION;
    private final static QName POLISA_QNAME = new QName("http://pl.edu.atena.akademia", "Polisa");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://localhost:8080/EJBSzkol/Polisa?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        POLISA_WSDL_LOCATION = url;
        POLISA_EXCEPTION = e;
    }

    public Polisa_Service() {
        super(__getWsdlLocation(), POLISA_QNAME);
    }

    public Polisa_Service(WebServiceFeature... features) {
        super(__getWsdlLocation(), POLISA_QNAME, features);
    }

    public Polisa_Service(URL wsdlLocation) {
        super(wsdlLocation, POLISA_QNAME);
    }

    public Polisa_Service(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, POLISA_QNAME, features);
    }

    public Polisa_Service(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public Polisa_Service(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns PolisaWService
     */
    @WebEndpoint(name = "PolisaWServicePort")
    public PolisaWService getPolisaWServicePort() {
        return super.getPort(new QName("http://pl.edu.atena.akademia", "PolisaWServicePort"), PolisaWService.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns PolisaWService
     */
    @WebEndpoint(name = "PolisaWServicePort")
    public PolisaWService getPolisaWServicePort(WebServiceFeature... features) {
        return super.getPort(new QName("http://pl.edu.atena.akademia", "PolisaWServicePort"), PolisaWService.class, features);
    }

    private static URL __getWsdlLocation() {
        if (POLISA_EXCEPTION!= null) {
            throw POLISA_EXCEPTION;
        }
        return POLISA_WSDL_LOCATION;
    }

}
