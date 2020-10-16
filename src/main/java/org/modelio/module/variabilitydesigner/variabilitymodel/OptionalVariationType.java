package org.modelio.module.variabilitydesigner.variabilitymodel;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import com.modeliosoft.modelio.javadesigner.annotations.objid;

/**
 * <p>Classe Java pour optional-variation-type complex type.
 * 
 * <p>Le fragment de sch�ma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="optional-variation-type">
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
@objid ("bbcb7420-558e-4669-b2e3-a73792f4d97e")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "optional-variation-type", propOrder = {
    "condition"
})
public class OptionalVariationType extends VariationType {
    @objid ("f187e83d-e25f-4fe8-a263-ec4d0af919e5")
    protected ExpressionType condition;

    /**
     * Obtient la valeur de la propri�t� condition.
     * @return
     * possible object is
     * {@link ExpressionType }
     */
    @objid ("c45df4e4-b367-4a3d-bc39-c54f39ba6115")
    public ExpressionType getCondition() {
        return condition;
    }

    /**
     * D�finit la valeur de la propri�t� condition.
     * 
     * @param value allowed object is
     * {@link ExpressionType }
     */
    @objid ("36d3af69-583e-4cd0-a1c8-05bb75c4fbd4")
    public void setCondition(ExpressionType value) {
        this.condition = value;
    }

}
