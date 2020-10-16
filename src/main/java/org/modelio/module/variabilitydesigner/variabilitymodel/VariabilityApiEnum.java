package org.modelio.module.variabilitydesigner.variabilitymodel;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>Classe Java pour variability-api-enum.
 * 
 * <p>Le fragment de sch�ma suivant indique le contenu attendu figurant dans cette classe.
 * <p>
 * <pre>
 * &lt;simpleType name="variability-api-enum">
 * &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 * &lt;enumeration value="variationpoint-description"/>
 * &lt;enumeration value="variationpoint-configuration"/>
 * &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 */
@XmlType(name = "variability-api-enum")
@XmlEnum
public enum VariabilityApiEnum {
    @XmlEnumValue("variationpoint-description")
    VARIATIONPOINT_DESCRIPTION ("variationpoint-description"),
    @XmlEnumValue("variationpoint-configuration")
    VARIATIONPOINT_CONFIGURATION ("variationpoint-configuration");

    private final String value;

    VariabilityApiEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static VariabilityApiEnum fromValue(String v) {
        for (VariabilityApiEnum c: VariabilityApiEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
