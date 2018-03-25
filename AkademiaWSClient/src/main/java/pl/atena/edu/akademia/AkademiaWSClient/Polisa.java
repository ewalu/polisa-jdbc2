
package pl.atena.edu.akademia.AkademiaWSClient;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for polisa complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="polisa">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="agenci" type="{http://pl.edu.atena.akademia}agent" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="idTemp" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="numerPolisy" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ryzyka" type="{http://pl.edu.atena.akademia}ryzyko" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="signDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="skladka" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="status" type="{http://pl.edu.atena.akademia}statusPolisy" minOccurs="0"/>
 *         &lt;element name="ubezpieczajacy" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="wr" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}long" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "polisa", propOrder = {
    "agenci",
    "idTemp",
    "numerPolisy",
    "ryzyka",
    "signDate",
    "skladka",
    "status",
    "ubezpieczajacy",
    "wr"
})
public class Polisa {

    @XmlElement(nillable = true)
    protected List<Agent> agenci;
    protected Long idTemp;
    protected String numerPolisy;
    @XmlElement(nillable = true)
    protected List<Ryzyko> ryzyka;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar signDate;
    protected BigDecimal skladka;
    @XmlSchemaType(name = "string")
    protected StatusPolisy status;
    protected String ubezpieczajacy;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar wr;
    @XmlAttribute(name = "id")
    protected Long id;

    /**
     * Gets the value of the agenci property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the agenci property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAgenci().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Agent }
     * 
     * 
     */
    public List<Agent> getAgenci() {
        if (agenci == null) {
            agenci = new ArrayList<Agent>();
        }
        return this.agenci;
    }

    /**
     * Gets the value of the idTemp property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getIdTemp() {
        return idTemp;
    }

    /**
     * Sets the value of the idTemp property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setIdTemp(Long value) {
        this.idTemp = value;
    }

    /**
     * Gets the value of the numerPolisy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumerPolisy() {
        return numerPolisy;
    }

    /**
     * Sets the value of the numerPolisy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumerPolisy(String value) {
        this.numerPolisy = value;
    }

    /**
     * Gets the value of the ryzyka property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the ryzyka property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRyzyka().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Ryzyko }
     * 
     * 
     */
    public List<Ryzyko> getRyzyka() {
        if (ryzyka == null) {
            ryzyka = new ArrayList<Ryzyko>();
        }
        return this.ryzyka;
    }

    /**
     * Gets the value of the signDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getSignDate() {
        return signDate;
    }

    /**
     * Sets the value of the signDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setSignDate(XMLGregorianCalendar value) {
        this.signDate = value;
    }

    /**
     * Gets the value of the skladka property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getSkladka() {
        return skladka;
    }

    /**
     * Sets the value of the skladka property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setSkladka(BigDecimal value) {
        this.skladka = value;
    }

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link StatusPolisy }
     *     
     */
    public StatusPolisy getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link StatusPolisy }
     *     
     */
    public void setStatus(StatusPolisy value) {
        this.status = value;
    }

    /**
     * Gets the value of the ubezpieczajacy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUbezpieczajacy() {
        return ubezpieczajacy;
    }

    /**
     * Sets the value of the ubezpieczajacy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUbezpieczajacy(String value) {
        this.ubezpieczajacy = value;
    }

    /**
     * Gets the value of the wr property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getWr() {
        return wr;
    }

    /**
     * Sets the value of the wr property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setWr(XMLGregorianCalendar value) {
        this.wr = value;
    }

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

}
