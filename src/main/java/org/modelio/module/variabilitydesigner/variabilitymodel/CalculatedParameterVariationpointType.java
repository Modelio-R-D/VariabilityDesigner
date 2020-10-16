package org.modelio.module.variabilitydesigner.variabilitymodel;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>Classe Java pour calculated-parameter-variationpoint-type complex type.
 * 
 * <p>Le fragment de sch�ma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="calculated-parameter-variationpoint-type">
 * &lt;complexContent>
 * &lt;extension base="{}variationpoint-type">
 * &lt;sequence>
 * &lt;element name="variation" type="{}calculated-variation-type"/>
 * &lt;/sequence>
 * &lt;/extension>
 * &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "calculated-parameter-variationpoint-type", propOrder = {
    "variation"
})
public class CalculatedParameterVariationpointType extends VariationpointType {
    @XmlElement(required = true)
    protected CalculatedVariationType variation;

    /**
     * Obtient la valeur de la propri�t� variation.
     * @return
     * possible object is
     * {@link CalculatedVariationType }
     */
    public CalculatedVariationType getVariation() {
        return variation;
    }

    /**
     * D�finit la valeur de la propri�t� variation.
     * 
     * @param value allowed object is
     * {@link CalculatedVariationType }
     */
    public void setVariation(CalculatedVariationType value) {
        this.variation = value;
    }

    @Override
    public List<VariationType> getVariations() {
        List<VariationType> res = new ArrayList<>();
        res.add(variation);
        return res;
    }

}
