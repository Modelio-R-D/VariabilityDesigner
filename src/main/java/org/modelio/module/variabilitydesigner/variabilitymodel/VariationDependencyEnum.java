package org.modelio.module.variabilitydesigner.variabilitymodel;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;
import com.modeliosoft.modelio.javadesigner.annotations.objid;

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
@objid ("1228aec2-a4be-4f2e-9193-6ed8c24b215e")
@XmlType(name = "variation-dependency-enum")
@XmlEnum
public enum VariationDependencyEnum {
    @XmlEnumValue("requires")
    REQUIRES ("requires"),
    @XmlEnumValue("conflicts")
    CONFLICTS ("conflicts");

    @objid ("0f5ac462-b00f-49fb-a6bb-fd914e711b28")
    private final String value;

    @objid ("41fc469b-c83c-4867-bff1-476d14b41d76")
    VariationDependencyEnum(String v) {
        value = v;
    }

    @objid ("35805de4-1470-42b7-801d-ee502796bbc9")
    public String value() {
        return value;
    }

    @objid ("35b5e6df-e718-4958-922f-65eaa5a18ff7")
    public static VariationDependencyEnum fromValue(String v) {
        for (VariationDependencyEnum c: VariationDependencyEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
