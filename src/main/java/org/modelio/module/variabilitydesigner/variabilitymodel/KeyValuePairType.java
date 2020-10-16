package org.modelio.module.variabilitydesigner.variabilitymodel;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;
import com.modeliosoft.modelio.javadesigner.annotations.objid;

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
@objid ("7fb73817-255f-4b24-9297-2c880afb4b2c")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "key-value-pair-type", propOrder = {
    "key",
    "value"
})
public class KeyValuePairType {
    @objid ("96e86e4d-a057-442c-bd1c-fbd29049dde3")
    @XmlElement(required = true)
    protected String key;

    @objid ("e77d39e5-218c-4287-87dd-807527198de1")
    @XmlElement(required = true)
    protected org.modelio.module.variabilitydesigner.variabilitymodel.KeyValuePairType.Value value;

    /**
     * Obtient la valeur de la propri�t� key.
     * @return
     * possible object is
     * {@link String }
     */
    @objid ("f26c5765-ecfb-4f45-af2f-3866ca568f97")
    public String getKey() {
        return key;
    }

    /**
     * D�finit la valeur de la propri�t� key.
     * 
     * @param value allowed object is
     * {@link String }
     */
    @objid ("11a22681-0a62-428c-84be-b7ebc174b1c5")
    public void setKey(String value) {
        this.key = value;
    }

    /**
     * Obtient la valeur de la propri�t� value.
     * @return
     * possible object is
     * {@link KeyValuePairType.Value }
     */
    @objid ("0a3f60e8-9dc0-4554-9697-49a5ebd9372d")
    public org.modelio.module.variabilitydesigner.variabilitymodel.KeyValuePairType.Value getValue() {
        return value;
    }

    /**
     * D�finit la valeur de la propri�t� value.
     * 
     * @param value allowed object is
     * {@link KeyValuePairType.Value }
     */
    @objid ("b1103917-81be-4785-8a87-8c84fcaaa778")
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
    @objid ("78b31c07-cdb2-4cf1-9f07-ee0a7e48f03b")
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "value"
    })
    public static class Value {
        @objid ("1ca70834-659d-4f85-b3ba-138e349fb6f1")
        @XmlValue
        protected String value;

        @objid ("6a2a66b3-efee-4e44-9f99-4728d4b1efaf")
        @XmlAttribute(name = "type")
        protected String type;

        /**
         * Obtient la valeur de la propri�t� value.
         * @return
         * possible object is
         * {@link String }
         */
        @objid ("936fc071-aa4e-4cdd-af21-1b0e383d7c78")
        public String getValue() {
            return value;
        }

        /**
         * D�finit la valeur de la propri�t� value.
         * 
         * @param value allowed object is
         * {@link String }
         */
        @objid ("8225e4fc-7742-4a2a-b1c7-c72754499861")
        public void setValue(String value) {
            this.value = value;
        }

        /**
         * Obtient la valeur de la propri�t� type.
         * @return
         * possible object is
         * {@link String }
         */
        @objid ("529cc763-e3fa-4410-8f30-a79d52aaa3c5")
        public String getType() {
            return type;
        }

        /**
         * D�finit la valeur de la propri�t� type.
         * 
         * @param value allowed object is
         * {@link String }
         */
        @objid ("790e039a-7fd2-42a5-98a7-6a767e0d05f4")
        public void setType(String value) {
            this.type = value;
        }

    }

}
