package org.modelio.module.variabilitydesigner.variabilitymodel;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import com.modeliosoft.modelio.javadesigner.annotations.objid;

/**
 * <p>Classe Java pour xor-variation-type complex type.
 * 
 * <p>Le fragment de sch�ma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="xor-variation-type">
 * &lt;complexContent>
 * &lt;extension base="{}variation-type">
 * &lt;sequence>
 * &lt;element name="condition" type="{}expression-type" minOccurs="0"/>
 * &lt;/sequence>
 * &lt;/extension>
 * &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@objid ("2872ef4b-5b26-49a1-b274-39afea95bb95")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "xor-variation-type", propOrder = {
    "condition"
})
public class XorVariationType extends VariationType {
    @objid ("c8d9e74b-c323-4b24-8dec-0018f4085ce6")
    protected ExpressionType condition;

    /**
     * Obtient la valeur de la propri�t� condition.
     * @return
     * possible object is
     * {@link ExpressionType }
     */
    @objid ("872a3b3a-4e4c-4740-a982-246001d10fa4")
    public ExpressionType getCondition() {
        return condition;
    }

    /**
     * D�finit la valeur de la propri�t� condition.
     * 
     * @param value allowed object is
     * {@link ExpressionType }
     */
    @objid ("41b89ea2-806f-4fa1-9382-b1d6a8076ab6")
    public void setCondition(ExpressionType value) {
        this.condition = value;
    }

}
