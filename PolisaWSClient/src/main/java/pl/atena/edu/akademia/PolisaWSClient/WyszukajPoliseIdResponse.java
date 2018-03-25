package pl.atena.edu.akademia.PolisaWSClient;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for WyszukajPoliseIdResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="WyszukajPoliseIdResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://pl.edu.atena.akademia}polisa" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ResponseWyszukajPoliseId", propOrder = {
    "polisa"
})
public class WyszukajPoliseIdResponse {

    @XmlElement(namespace = "http://pl.edu.atena.akademia")
    protected Polisa polisa;

    /**
     * Gets the value of the polisa property.
     * 
     * @return
     *     possible object is
     *     {@link Polisa }
     *     
     */
    public Polisa getPolisa() {
        return polisa;
    }

    /**
     * Sets the value of the polisa property.
     * 
     * @param value
     *     allowed object is
     *     {@link Polisa }
     *     
     */
    public void setPolisa(Polisa value) {
        this.polisa = value;
    }

}
