package org.modelio.module.variabilitydesigner.variabilitymodel;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

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
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "calculated-variation-type", propOrder = {
    "expression"
})
public class CalculatedVariationType extends VariationType {
    protected ExpressionType expression;

    /**
     * Obtient la valeur de la propri�t� expression.
     * @return
     * possible object is
     * {@link ExpressionType }
     */
    public ExpressionType getExpression() {
        return expression;
    }

    /**
     * D�finit la valeur de la propri�t� expression.
     * 
     * @param value allowed object is
     * {@link ExpressionType }
     */
    public void setExpression(ExpressionType value) {
        this.expression = value;
    }

}
