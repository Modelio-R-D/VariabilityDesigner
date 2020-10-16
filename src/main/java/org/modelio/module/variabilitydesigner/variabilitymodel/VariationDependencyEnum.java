package org.modelio.module.variabilitydesigner.variabilitymodel;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>Classe Java pour variation-dependency-enum.
 * 
 * <p>Le fragment de sch�ma suivant indique le contenu attendu figurant dans cette classe.
 * <p>
 * <pre>
 * &lt;simpleType name="variation-dependency-enum">
 * &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 * &lt;enumeration value="requires"/>
 * &lt;enumeration value="conflicts"/>
 * &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 */
@XmlType(name = "variation-dependency-enum")
@XmlEnum
public enum VariationDependencyEnum {
    @XmlEnumValue("requires")
    REQUIRES ("requires"),
    @XmlEnumValue("conflicts")
    CONFLICTS ("conflicts");

    private final String value;

    VariationDependencyEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static VariationDependencyEnum fromValue(String v) {
        for (VariationDependencyEnum c: VariationDependencyEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
