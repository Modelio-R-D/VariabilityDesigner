package org.modelio.module.variabilitydesigner.variabilitymodel;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>Classe Java pour bindingtime-type complex type.
 * 
 * <p>Le fragment de sch�ma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="bindingtime-type">
 * &lt;complexContent>
 * &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 * &lt;sequence>
 * &lt;element name="name" type="{}bindingtime-enum"/>
 * &lt;element name="condition" type="{}expression-type" minOccurs="0"/>
 * &lt;/sequence>
 * &lt;attribute name="selected" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 * &lt;/restriction>
 * &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "bindingtime-type", propOrder = {
    "name",
    "condition"
})
public class BindingtimeType {
    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected BindingtimeEnum name;

    @XmlAttribute(name = "selected")
    protected Boolean selected;

    protected ExpressionType condition;

    /**
     * Obtient la valeur de la propri�t� name.
     * @return
     * possible object is
     * {@link BindingtimeEnum }
     */
    public BindingtimeEnum getName() {
        return name;
    }

    /**
     * D�finit la valeur de la propri�t� name.
     * 
     * @param value allowed object is
     * {@link BindingtimeEnum }
     */
    public void setName(BindingtimeEnum value) {
        this.name = value;
    }

    /**
     * Obtient la valeur de la propri�t� condition.
     * @return
     * possible object is
     * {@link ExpressionType }
     */
    public ExpressionType getCondition() {
        return condition;
    }

    /**
     * D�finit la valeur de la propri�t� condition.
     * 
     * @param value allowed object is
     * {@link ExpressionType }
     */
    public void setCondition(ExpressionType value) {
        this.condition = value;
    }

    /**
     * Obtient la valeur de la propri�t� selected.
     * @return
     * possible object is
     * {@link Boolean }
     */
    public Boolean isSelected() {
        return selected;
    }

    /**
     * D�finit la valeur de la propri�t� selected.
     * 
     * @param value allowed object is
     * {@link Boolean }
     */
    public void setSelected(Boolean value) {
        this.selected = value;
    }

}
