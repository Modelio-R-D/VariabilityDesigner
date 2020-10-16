package org.modelio.module.variabilitydesigner.variabilitymodel;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import com.modeliosoft.modelio.javadesigner.annotations.objid;

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
@objid ("dc34672d-9e6e-4760-8b04-0ef1c923f2d8")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "bindingtime-type", propOrder = {
    "name",
    "condition"
})
public class BindingtimeType {
    @objid ("7253588b-54c8-4e2d-b0a7-3cfb1b327f19")
    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected BindingtimeEnum name;

    @objid ("acf0b4f1-d2eb-447f-ae6d-562f5d5c2267")
    @XmlAttribute(name = "selected")
    protected Boolean selected;

    @objid ("ca7da9dc-9899-4ca2-92a4-69cdb88ee02e")
    protected ExpressionType condition;

    /**
     * Obtient la valeur de la propri�t� name.
     * @return
     * possible object is
     * {@link BindingtimeEnum }
     */
    @objid ("7f3e5643-7f32-43fb-aea4-e556df8ab1b0")
    public BindingtimeEnum getName() {
        return name;
    }

    /**
     * D�finit la valeur de la propri�t� name.
     * 
     * @param value allowed object is
     * {@link BindingtimeEnum }
     */
    @objid ("f8c54b7f-94be-4728-b60d-09796d9ca913")
    public void setName(BindingtimeEnum value) {
        this.name = value;
    }

    /**
     * Obtient la valeur de la propri�t� condition.
     * @return
     * possible object is
     * {@link ExpressionType }
     */
    @objid ("6de34714-20ab-4f55-ae61-dfafa2d74495")
    public ExpressionType getCondition() {
        return condition;
    }

    /**
     * D�finit la valeur de la propri�t� condition.
     * 
     * @param value allowed object is
     * {@link ExpressionType }
     */
    @objid ("4e071058-9fdb-453b-a006-390ce5a9e365")
    public void setCondition(ExpressionType value) {
        this.condition = value;
    }

    /**
     * Obtient la valeur de la propri�t� selected.
     * @return
     * possible object is
     * {@link Boolean }
     */
    @objid ("e05ec56e-2867-46ae-8775-39c806a2133e")
    public Boolean isSelected() {
        return selected;
    }

    /**
     * D�finit la valeur de la propri�t� selected.
     * 
     * @param value allowed object is
     * {@link Boolean }
     */
    @objid ("0c076dd4-be04-46af-9df8-19cb8743581b")
    public void setSelected(Boolean value) {
        this.selected = value;
    }

}
