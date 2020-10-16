package org.modelio.module.variabilitydesigner.variabilitymodel;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;

/**
 * <p>Classe Java pour key-value-pair-type complex type.
 * 
 * <p>Le fragment de sch�ma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="key-value-pair-type">
 * &lt;complexContent>
 * &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 * &lt;sequence>
 * &lt;element name="key">
 * &lt;simpleType>
 * &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 * &lt;minLength value="1"/>
 * &lt;/restriction>
 * &lt;/simpleType>
 * &lt;/element>
 * &lt;element name="value">
 * &lt;complexType>
 * &lt;simpleContent>
 * &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
 * &lt;attribute name="type" type="{http://www.w3.org/2001/XMLSchema}string" />
 * &lt;/extension>
 * &lt;/simpleContent>
 * &lt;/complexType>
 * &lt;/element>
 * &lt;/sequence>
 * &lt;/restriction>
 * &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "key-value-pair-type", propOrder = {
    "key",
    "value"
})
public class KeyValuePairType {
    @XmlElement(required = true)
    protected String key;

    @XmlElement(required = true)
    protected org.modelio.module.variabilitydesigner.variabilitymodel.KeyValuePairType.Value value;

    /**
     * Obtient la valeur de la propri�t� key.
     * @return
     * possible object is
     * {@link String }
     */
    public String getKey() {
        return key;
    }

    /**
     * D�finit la valeur de la propri�t� key.
     * 
     * @param value allowed object is
     * {@link String }
     */
    public void setKey(String value) {
        this.key = value;
    }

    /**
     * Obtient la valeur de la propri�t� value.
     * @return
     * possible object is
     * {@link KeyValuePairType.Value }
     */
    public org.modelio.module.variabilitydesigner.variabilitymodel.KeyValuePairType.Value getValue() {
        return value;
    }

    /**
     * D�finit la valeur de la propri�t� value.
     * 
     * @param value allowed object is
     * {@link KeyValuePairType.Value }
     */
    public void setValue(org.modelio.module.variabilitydesigner.variabilitymodel.KeyValuePairType.Value value) {
        this.value = value;
    }

    /**
     * <p>Classe Java pour anonymous complex type.
     * 
     * <p>Le fragment de sch�ma suivant indique le contenu attendu figurant dans cette classe.
     * 
     * <pre>
     * &lt;complexType>
     * &lt;simpleContent>
     * &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
     * &lt;attribute name="type" type="{http://www.w3.org/2001/XMLSchema}string" />
     * &lt;/extension>
     * &lt;/simpleContent>
     * &lt;/complexType>
     * </pre>
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "value"
    })
    public static class Value {
        @XmlValue
        protected String value;

        @XmlAttribute(name = "type")
        protected String type;

        /**
         * Obtient la valeur de la propri�t� value.
         * @return
         * possible object is
         * {@link String }
         */
        public String getValue() {
            return value;
        }

        /**
         * D�finit la valeur de la propri�t� value.
         * 
         * @param value allowed object is
         * {@link String }
         */
        public void setValue(String value) {
            this.value = value;
        }

        /**
         * Obtient la valeur de la propri�t� type.
         * @return
         * possible object is
         * {@link String }
         */
        public String getType() {
            return type;
        }

        /**
         * D�finit la valeur de la propri�t� type.
         * 
         * @param value allowed object is
         * {@link String }
         */
        public void setType(String value) {
            this.type = value;
        }

    }

}
