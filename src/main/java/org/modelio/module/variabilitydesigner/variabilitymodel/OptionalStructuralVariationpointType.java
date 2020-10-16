package org.modelio.module.variabilitydesigner.variabilitymodel;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.modeliosoft.modelio.javadesigner.annotations.objid;

/**
 * <p>Classe Java pour optional-structural-variationpoint-type complex type.
 * 
 * <p>Le fragment de sch�ma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="optional-structural-variationpoint-type">
 * &lt;complexContent>
 * &lt;extension base="{}variationpoint-type">
 * &lt;sequence>
 * &lt;element name="variation" type="{}optional-variation-type" maxOccurs="unbounded"/>
 * &lt;/sequence>
 * &lt;/extension>
 * &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@objid ("eb4aaa68-36fb-4c5b-b9a8-9352371ead59")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "optional-structural-variationpoint-type", propOrder = {
    "variation"
})
public class OptionalStructuralVariationpointType extends VariationpointType {
    @objid ("3cd8b00d-7ee6-4af9-baa2-866cf8466269")
    @XmlElement(required = true)
    protected List<OptionalVariationType> variation;

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
     * {@link OptionalVariationType }
     */
    @objid ("46362f14-28ef-4728-8e40-f4e494e8497a")
    public List<OptionalVariationType> getVariation() {
        if (variation == null) {
            variation = new ArrayList<OptionalVariationType>();
        }
        return this.variation;
    }

    @objid ("a085afa5-4048-456a-82e9-2e4dbc5061ec")
    @Override
    public List<VariationType> getVariations() {
        return new ArrayList<VariationType>(getVariation());
    }

}
