package pl.atena.edu.akademia.PolisaWSClient;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the akademia.atena.edu.pl package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _WyszukajPoliseId_QNAME = new QName("http://pl.edu.atena.akademia", "WyszukajPoliseId");
    private final static QName _RejestracjaPolisy_QNAME = new QName("http://pl.edu.atena.akademia", "RejestracjaPolisy");
    private final static QName _Polisa_QNAME = new QName("http://pl.edu.atena.akademia", "polisa");
    private final static QName _RejestracjaPolisyResponse_QNAME = new QName("http://pl.edu.atena.akademia", "RejestracjaPolisyResponse");
    private final static QName _WyszukajPoliseResponse_QNAME = new QName("http://pl.edu.atena.akademia", "WyszukajPoliseResponse");
    private final static QName _WyszukajPolise_QNAME = new QName("http://pl.edu.atena.akademia", "WyszukajPolise");
    private final static QName _WyszukajPoliseIdResponse_QNAME = new QName("http://pl.edu.atena.akademia", "WyszukajPoliseIdResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: akademia.atena.edu.pl
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link WyszukajPoliseId }
     * 
     */
    public WyszukajPoliseId createWyszukajPoliseId() {
        return new WyszukajPoliseId();
    }

    /**
     * Create an instance of {@link RejestracjaPolisy }
     * 
     */
    public RejestracjaPolisy createRejestracjaPolisy() {
        return new RejestracjaPolisy();
    }

    /**
     * Create an instance of {@link Polisa }
     * 
     */
    public Polisa createPolisa() {
        return new Polisa();
    }

    /**
     * Create an instance of {@link WyszukajPolise }
     * 
     */
    public WyszukajPolise createWyszukajPolise() {
        return new WyszukajPolise();
    }

    /**
     * Create an instance of {@link WyszukajPoliseIdResponse }
     * 
     */
    public WyszukajPoliseIdResponse createWyszukajPoliseIdResponse() {
        return new WyszukajPoliseIdResponse();
    }

    /**
     * Create an instance of {@link WyszukajPoliseResponse }
     * 
     */
    public WyszukajPoliseResponse createWyszukajPoliseResponse() {
        return new WyszukajPoliseResponse();
    }

    /**
     * Create an instance of {@link RejestracjaPolisyResponse }
     * 
     */
    public RejestracjaPolisyResponse createRejestracjaPolisyResponse() {
        return new RejestracjaPolisyResponse();
    }

    /**
     * Create an instance of {@link Ryzyko }
     * 
     */
    public Ryzyko createRyzyko() {
        return new Ryzyko();
    }

    /**
     * Create an instance of {@link Agent }
     * 
     */
    public Agent createAgent() {
        return new Agent();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WyszukajPoliseId }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://pl.edu.atena.akademia", name = "WyszukajPoliseId")
    public JAXBElement<WyszukajPoliseId> createWyszukajPoliseId(WyszukajPoliseId value) {
        return new JAXBElement<WyszukajPoliseId>(_WyszukajPoliseId_QNAME, WyszukajPoliseId.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RejestracjaPolisy }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://pl.edu.atena.akademia", name = "RejestracjaPolisy")
    public JAXBElement<RejestracjaPolisy> createRejestracjaPolisy(RejestracjaPolisy value) {
        return new JAXBElement<RejestracjaPolisy>(_RejestracjaPolisy_QNAME, RejestracjaPolisy.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Polisa }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://pl.edu.atena.akademia", name = "polisa")
    public JAXBElement<Polisa> createPolisa(Polisa value) {
        return new JAXBElement<Polisa>(_Polisa_QNAME, Polisa.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RejestracjaPolisyResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://pl.edu.atena.akademia", name = "RejestracjaPolisyResponse")
    public JAXBElement<RejestracjaPolisyResponse> createRejestracjaPolisyResponse(RejestracjaPolisyResponse value) {
        return new JAXBElement<RejestracjaPolisyResponse>(_RejestracjaPolisyResponse_QNAME, RejestracjaPolisyResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WyszukajPoliseResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://pl.edu.atena.akademia", name = "WyszukajPoliseResponse")
    public JAXBElement<WyszukajPoliseResponse> createWyszukajPoliseResponse(WyszukajPoliseResponse value) {
        return new JAXBElement<WyszukajPoliseResponse>(_WyszukajPoliseResponse_QNAME, WyszukajPoliseResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WyszukajPolise }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://pl.edu.atena.akademia", name = "WyszukajPolise")
    public JAXBElement<WyszukajPolise> createWyszukajPolise(WyszukajPolise value) {
        return new JAXBElement<WyszukajPolise>(_WyszukajPolise_QNAME, WyszukajPolise.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WyszukajPoliseIdResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://pl.edu.atena.akademia", name = "WyszukajPoliseIdResponse")
    public JAXBElement<WyszukajPoliseIdResponse> createWyszukajPoliseIdResponse(WyszukajPoliseIdResponse value) {
        return new JAXBElement<WyszukajPoliseIdResponse>(_WyszukajPoliseIdResponse_QNAME, WyszukajPoliseIdResponse.class, null, value);
    }

}
