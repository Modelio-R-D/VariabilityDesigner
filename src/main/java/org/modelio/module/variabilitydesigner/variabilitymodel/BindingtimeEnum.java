package org.modelio.module.variabilitydesigner.variabilitymodel;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>Classe Java pour bindingtime-enum.
 * 
 * <p>Le fragment de sch�ma suivant indique le contenu attendu figurant dans cette classe.
 * <p>
 * <pre>
 * &lt;simpleType name="bindingtime-enum">
 * &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 * &lt;enumeration value="requirements-time"/>
 * &lt;enumeration value="blueprint-derivation-time"/>
 * &lt;enumeration value="model-construction-time"/>
 * &lt;enumeration value="model-simulation-time"/>
 * &lt;enumeration value="code-generation-time"/>
 * &lt;enumeration value="preprocessor-time"/>
 * &lt;enumeration value="compile-time"/>
 * &lt;enumeration value="link-time"/>
 * &lt;enumeration value="flash-time"/>
 * &lt;enumeration value="post-build"/>
 * &lt;enumeration value="post-build-loadable-time"/>
 * &lt;enumeration value="post-build-selectable-time"/>
 * &lt;enumeration value="run-time"/>
 * &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 */
@XmlType(name = "bindingtime-enum")
@XmlEnum
public enum BindingtimeEnum {
    @XmlEnumValue("requirements-time")
    REQUIREMENTS_TIME ("requirements-time"),
    @XmlEnumValue("blueprint-derivation-time")
    BLUEPRINT_DERIVATION_TIME ("blueprint-derivation-time"),
    @XmlEnumValue("model-construction-time")
    MODEL_CONSTRUCTION_TIME ("model-construction-time"),
    @XmlEnumValue("model-simulation-time")
    MODEL_SIMULATION_TIME ("model-simulation-time"),
    @XmlEnumValue("code-generation-time")
    CODE_GENERATION_TIME ("code-generation-time"),
    @XmlEnumValue("preprocessor-time")
    PREPROCESSOR_TIME ("preprocessor-time"),
    @XmlEnumValue("compile-time")
    COMPILE_TIME ("compile-time"),
    @XmlEnumValue("link-time")
    LINK_TIME ("link-time"),
    @XmlEnumValue("flash-time")
    FLASH_TIME ("flash-time"),
    @XmlEnumValue("post-build")
    POST_BUILD ("post-build"),
    @XmlEnumValue("post-build-loadable-time")
    POST_BUILD_LOADABLE_TIME ("post-build-loadable-time"),
    @XmlEnumValue("post-build-selectable-time")
    POST_BUILD_SELECTABLE_TIME ("post-build-selectable-time"),
    @XmlEnumValue("run-time")
    RUN_TIME ("run-time");

    private final String value;

    BindingtimeEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static BindingtimeEnum fromValue(String v) {
        for (BindingtimeEnum c: BindingtimeEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
