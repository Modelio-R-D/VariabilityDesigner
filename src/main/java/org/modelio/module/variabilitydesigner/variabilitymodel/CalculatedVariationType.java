package org.modelio.module.variabilitydesigner.variabilitymodel;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import com.modeliosoft.modelio.javadesigner.annotations.objid;

/**
 * <p>Classe Java pour calculated-variation-type complex type.
 * 
 * <p>Le fragment de sch�ma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="calculated-variation-type">
 * &lt;complexContent>
 * &lt;extension base="{}variation-type">
 * &lt;sequence>
 * &lt;element name="expression" type="{}expression-type" minOccurs="0"/>
 * &lt;/sequence>
 * &lt;/extension>
 * &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@objid ("8b8c001b-54a8-4d5d-93e2-7cc5c7b9a048")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "calculated-variation-type", propOrder = {
    "expression"
})
public class CalculatedVariationType extends VariationType {
    @objid ("f73f3d79-3a82-4a44-822a-84bbe2234c93")
    protected ExpressionType expression;

    /**
     * Obtient la valeur de la propri�t� expression.
     * @return
     * possible object is
     * {@link ExpressionType }
     */
    @objid ("be92c450-c123-4eb7-b481-d1a89f14b752")
    public ExpressionType getExpression() {
        return expression;
    }

    /**
     * D�finit la valeur de la propri�t� expression.
     * 
     * @param value allowed object is
     * {@link ExpressionType }
     */
    @objid ("70c05e52-ffdc-4ca9-a65b-096f9de56d29")
    public void setExpression(ExpressionType value) {
        this.expression = value;
    }

}
