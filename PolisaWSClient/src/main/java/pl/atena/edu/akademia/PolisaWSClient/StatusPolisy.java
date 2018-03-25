package pl.atena.edu.akademia.PolisaWSClient;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for statusPolisy.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="statusPolisy">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="ZATWIERDZONA"/>
 *     &lt;enumeration value="ZAWIESZONA"/>
 *     &lt;enumeration value="ROZWIAZANA"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "statusPolisy")
@XmlEnum
public enum StatusPolisy {

    ZATWIERDZONA,
    ZAWIESZONA,
    ROZWIAZANA;

    public String value() {
        return name();
    }

    public static StatusPolisy fromValue(String v) {
        return valueOf(v);
    }

}
