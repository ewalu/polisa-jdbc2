package pl.atena.edu.akademia.PolisaWSClient;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for agent complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="agent">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="nazwa" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="polisy" type="{http://pl.edu.atena.akademia}polisa" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "agent", propOrder = {
    "id",
    "nazwa",
    "polisy"
})
public class Agent {

    protected Long id;
    protected String nazwa;
    @XmlElement(nillable = true)
    protected List<Polisa> polisy;

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setId(Long value) {
        this.id = value;
    }

    /**
     * Gets the value of the nazwa property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNazwa() {
        return nazwa;
    }

    /**
     * Sets the value of the nazwa property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNazwa(String value) {
        this.nazwa = value;
    }

    /**
     * Gets the value of the polisy property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the polisy property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPolisy().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Polisa }
     * 
     * 
     */
    public List<Polisa> getPolisy() {
        if (polisy == null) {
            polisy = new ArrayList<Polisa>();
        }
        return this.polisy;
    }

}
