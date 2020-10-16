package org.modelio.module.variabilitydesigner.variabilitymodel;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.modeliosoft.modelio.javadesigner.annotations.objid;

/**
 * <p>Classe Java pour value-variation-type complex type.
 * 
 * <p>Le fragment de sch�ma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="value-variation-type">
 * &lt;complexContent>
 * &lt;extension base="{}variation-type">
 * &lt;sequence>
 * &lt;element name="condition" type="{}expression-type" minOccurs="0"/>
 * &lt;element name="value" type="{http://www.w3.org/2001/XMLSchema}string"/>
 * &lt;/sequence>
 * &lt;/extension>
 * &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@objid ("46762043-df72-4414-beaa-10cf6dfef2e0")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "value-variation-type", propOrder = {
    "condition",
    "value"
})
public class ValueVariationType extends VariationType {
    @objid ("cacc1057-657e-4f48-b495-75913f73a843")
    @XmlElement(required = true)
    protected String value;

    @objid ("accc82db-4bfc-45a5-a4d6-21e1de8f68d9")
    protected ExpressionType condition;

    /**
     * Obtient la valeur de la propri�t� condition.
     * @return
     * possible object is
     * {@link ExpressionType }
     */
    @objid ("d3fbd768-3b6f-45f7-b790-aebd99231d97")
    public ExpressionType getCondition() {
        return condition;
    }

    /**
     * D�finit la valeur de la propri�t� condition.
     * 
     * @param value allowed object is
     * {@link ExpressionType }
     */
    @objid ("3f837d8f-98d8-44a2-b3ef-7ee72d95e4a6")
    public void setCondition(ExpressionType value) {
        this.condition = value;
    }

    /**
     * Obtient la valeur de la propri�t� value.
     * @return
     * possible object is
     * {@link String }
     */
    @objid ("3bd29404-fd53-4906-b410-431bd8624822")
    public String getValue() {
        return value;
    }

    /**
     * D�finit la valeur de la propri�t� value.
     * 
     * @param value allowed object is
     * {@link String }
     */
    @objid ("9c27bd31-af29-4312-98e0-94270a795c75")
    public void setValue(String value) {
        this.value = value;
    }

}
