
package pl.atena.edu.akademia.AkademiaWSClient;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for insurerResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="insurerResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="result" type="{http://pl.edu.atena.akademia}ubezpieczajacy" minOccurs="0" form="qualified"/>
 *         &lt;element name="test" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0" form="qualified"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "insurerResponse", propOrder = {
    "result",
    "test"
})
public class InsurerResponse {

    @XmlElement(namespace = "http://pl.edu.atena.akademia")
    protected Ubezpieczajacy result;
    @XmlElement(namespace = "http://pl.edu.atena.akademia")
    protected Integer test;

    /**
     * Gets the value of the result property.
     * 
     * @return
     *     possible object is
     *     {@link Ubezpieczajacy }
     *     
     */
    public Ubezpieczajacy getResult() {
        return result;
    }

    /**
     * Sets the value of the result property.
     * 
     * @param value
     *     allowed object is
     *     {@link Ubezpieczajacy }
     *     
     */
    public void setResult(Ubezpieczajacy value) {
        this.result = value;
    }

    /**
     * Gets the value of the test property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getTest() {
        return test;
    }

    /**
     * Sets the value of the test property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setTest(Integer value) {
        this.test = value;
    }

}
