package org.modelio.module.variabilitydesigner.variabilitymodel;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>Classe Java pour expression-enum.
 * 
 * <p>Le fragment de sch�ma suivant indique le contenu attendu figurant dans cette classe.
 * <p>
 * <pre>
 * &lt;simpleType name="expression-enum">
 * &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 * &lt;enumeration value="single-feature-condition"/>
 * &lt;enumeration value="and-feature-condition"/>
 * &lt;enumeration value="or-feature-condition"/>
 * &lt;enumeration value="pvscl-expression"/>
 * &lt;enumeration value="ocl-expression"/>
 * &lt;enumeration value="autosar-expression"/>
 * &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 */
@XmlType(name = "expression-enum")
@XmlEnum
public enum ExpressionEnum {
    @XmlEnumValue("single-feature-condition")
    SINGLE_FEATURE_CONDITION ("single-feature-condition"),
    @XmlEnumValue("and-feature-condition")
    AND_FEATURE_CONDITION ("and-feature-condition"),
    @XmlEnumValue("or-feature-condition")
    OR_FEATURE_CONDITION ("or-feature-condition"),
    @XmlEnumValue("pvscl-expression")
    PVSCL_EXPRESSION ("pvscl-expression"),
    @XmlEnumValue("ocl-expression")
    OCL_EXPRESSION ("ocl-expression"),
    @XmlEnumValue("autosar-expression")
    AUTOSAR_EXPRESSION ("autosar-expression");

    private final String value;

    ExpressionEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ExpressionEnum fromValue(String v) {
        for (ExpressionEnum c: ExpressionEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
