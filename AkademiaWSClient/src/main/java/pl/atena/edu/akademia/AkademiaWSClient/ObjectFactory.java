
package pl.atena.edu.akademia.AkademiaWSClient;

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

    private final static QName _Polisa_QNAME = new QName("http://pl.edu.atena.akademia", "polisa");
    private final static QName _Insurer_QNAME = new QName("http://pl.edu.atena.akademia", "insurer");
    private final static QName _InsurerResponse_QNAME = new QName("http://pl.edu.atena.akademia", "insurerResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: akademia.atena.edu.pl
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Insurer }
     * 
     */
    public Insurer createInsurer() {
        return new Insurer();
    }

    /**
     * Create an instance of {@link Polisa }
     * 
     */
    public Polisa createPolisa() {
        return new Polisa();
    }

    /**
     * Create an instance of {@link InsurerResponse }
     * 
     */
    public InsurerResponse createInsurerResponse() {
        return new InsurerResponse();
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
     * Create an instance of {@link Ubezpieczajacy }
     * 
     */
    public Ubezpieczajacy createUbezpieczajacy() {
        return new Ubezpieczajacy();
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
     * Create an instance of {@link JAXBElement }{@code <}{@link Insurer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://pl.edu.atena.akademia", name = "insurer")
    public JAXBElement<Insurer> createInsurer(Insurer value) {
        return new JAXBElement<Insurer>(_Insurer_QNAME, Insurer.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InsurerResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://pl.edu.atena.akademia", name = "insurerResponse")
    public JAXBElement<InsurerResponse> createInsurerResponse(InsurerResponse value) {
        return new JAXBElement<InsurerResponse>(_InsurerResponse_QNAME, InsurerResponse.class, null, value);
    }

}
