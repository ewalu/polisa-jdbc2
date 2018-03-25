package pl.atena.edu.akademia.PolisaWSClient;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for WyszukajPolise complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="WyszukajPolise">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="numer" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="qualified"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WwyszukajPolise", propOrder = {
    "numer"
})
public class WyszukajPolise {

    @XmlElement(namespace = "http://pl.edu.atena.akademia")
    protected String numer;

    /**
     * Gets the value of the numer property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumer() {
        return numer;
    }

    /**
     * Sets the value of the numer property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumer(String value) {
        this.numer = value;
    }

}
