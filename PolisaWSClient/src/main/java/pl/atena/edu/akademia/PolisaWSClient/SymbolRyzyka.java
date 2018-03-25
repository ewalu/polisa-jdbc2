package pl.atena.edu.akademia.PolisaWSClient;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for symbolRyzyka.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="symbolRyzyka">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="J07"/>
 *     &lt;enumeration value="C02"/>
 *     &lt;enumeration value="H04"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "symbolRyzyka")
@XmlEnum
public enum SymbolRyzyka {

    @XmlEnumValue("J07")
    J_07("J07"),
    @XmlEnumValue("C02")
    C_02("C02"),
    @XmlEnumValue("H04")
    H_04("H04");
    private final String value;

    SymbolRyzyka(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static SymbolRyzyka fromValue(String v) {
        for (SymbolRyzyka c: SymbolRyzyka.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
