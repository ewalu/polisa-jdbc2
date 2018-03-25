package pl.atena.edu.akademia.PolisaWSClient;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ryzyko complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ryzyko">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="polisa" type="{http://pl.edu.atena.akademia}polisa" minOccurs="0"/>
 *         &lt;element name="skladka" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="symbol" type="{http://pl.edu.atena.akademia}symbolRyzyka" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ryzyko", propOrder = {
    "id",
    "polisa",
    "skladka",
    "symbol"
})
public class Ryzyko {

    protected Long id;
    protected Polisa polisa;
    protected BigDecimal skladka;
    @XmlSchemaType(name = "string")
    protected SymbolRyzyka symbol;

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
     * Gets the value of the symbol property.
     * 
     * @return
     *     possible object is
     *     {@link SymbolRyzyka }
     *     
     */
    public SymbolRyzyka getSymbol() {
        return symbol;
    }

    /**
     * Sets the value of the symbol property.
     * 
     * @param value
     *     allowed object is
     *     {@link SymbolRyzyka }
     *     
     */
    public void setSymbol(SymbolRyzyka value) {
        this.symbol = value;
    }

}
