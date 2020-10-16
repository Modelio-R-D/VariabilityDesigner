package org.modelio.module.variabilitydesigner.variabilitymodel;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>Classe Java pour xor-parameter-variationpoint-type complex type.
 * 
 * <p>Le fragment de sch�ma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="xor-parameter-variationpoint-type">
 * &lt;complexContent>
 * &lt;extension base="{}variationpoint-type">
 * &lt;sequence>
 * &lt;element name="variation" type="{}value-variation-type" maxOccurs="unbounded"/>
 * &lt;/sequence>
 * &lt;/extension>
 * &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "xor-parameter-variationpoint-type", propOrder = {
    "variation"
})
public class XorParameterVariationpointType extends VariationpointType {
    @XmlElement(required = true)
    protected List<ValueVariationType> variation;

    /**
     * Gets the value of the variation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the variation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     * getVariation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ValueVariationType }
     */
    public List<ValueVariationType> getVariation() {
        if (variation == null) {
            variation = new ArrayList<ValueVariationType>();
        }
        return this.variation;
    }

    @Override
    public List<VariationType> getVariations() {
        return new ArrayList<VariationType>(getVariation());
    }

}
