package org.modelio.module.variabilitydesigner.variabilitymodel;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;
import com.modeliosoft.modelio.javadesigner.annotations.objid;

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
@objid ("4ac36e77-56c4-4b23-b146-0680a6857ca9")
@XmlType(name = "variability-api-enum")
@XmlEnum
public enum VariabilityApiEnum {
    @XmlEnumValue("variationpoint-description")
    VARIATIONPOINT_DESCRIPTION ("variationpoint-description"),
    @XmlEnumValue("variationpoint-configuration")
    VARIATIONPOINT_CONFIGURATION ("variationpoint-configuration");

    @objid ("e567c46c-b301-4473-90b6-9fc9df433bab")
    private final String value;

    @objid ("4a1e4a44-1364-4c56-8ab1-b2c64fc4ceb2")
    VariabilityApiEnum(String v) {
        value = v;
    }

    @objid ("dcf47be6-d0af-46a9-838b-03ab4438c338")
    public String value() {
        return value;
    }

    @objid ("bababa87-f750-48a6-9819-10fb73dca6f9")
    public static VariabilityApiEnum fromValue(String v) {
        for (VariabilityApiEnum c: VariabilityApiEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
