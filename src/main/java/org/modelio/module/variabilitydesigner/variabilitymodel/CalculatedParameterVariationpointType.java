package org.modelio.module.variabilitydesigner.variabilitymodel;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.modeliosoft.modelio.javadesigner.annotations.objid;

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
@objid ("fe696476-f9ef-4a2e-b883-5e12444301ff")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "calculated-parameter-variationpoint-type", propOrder = {
    "variation"
})
public class CalculatedParameterVariationpointType extends VariationpointType {
    @objid ("57b20eb2-3b30-40e2-9af7-afbd987a49d4")
    @XmlElement(required = true)
    protected CalculatedVariationType variation;

    /**
     * Obtient la valeur de la propri�t� variation.
     * @return
     * possible object is
     * {@link CalculatedVariationType }
     */
    @objid ("223935b9-43d8-4302-8a3b-962c426dadce")
    public CalculatedVariationType getVariation() {
        return variation;
    }

    /**
     * D�finit la valeur de la propri�t� variation.
     * 
     * @param value allowed object is
     * {@link CalculatedVariationType }
     */
    @objid ("0e6ccea1-77ad-4ac4-9648-9e630ac19874")
    public void setVariation(CalculatedVariationType value) {
        this.variation = value;
    }

    @objid ("aba4a8ec-3282-4a29-ab1b-b9b0817897a0")
    @Override
    public List<VariationType> getVariations() {
        List<VariationType> res = new ArrayList<>();
        res.add(variation);
        return res;
    }

}
