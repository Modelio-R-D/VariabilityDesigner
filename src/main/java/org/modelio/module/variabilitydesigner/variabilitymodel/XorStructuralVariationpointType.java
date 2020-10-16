package org.modelio.module.variabilitydesigner.variabilitymodel;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.modeliosoft.modelio.javadesigner.annotations.objid;

/**
 * <p>Classe Java pour xor-structural-variationpoint-type complex type.
 * 
 * <p>Le fragment de sch�ma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="xor-structural-variationpoint-type">
 * &lt;complexContent>
 * &lt;extension base="{}variationpoint-type">
 * &lt;sequence>
 * &lt;element name="variation" type="{}xor-variation-type" maxOccurs="unbounded"/>
 * &lt;/sequence>
 * &lt;/extension>
 * &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@objid ("68399df0-ceb8-4b75-9d68-99cfe45f8aa7")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "xor-structural-variationpoint-type", propOrder = {
    "variation"
})
public class XorStructuralVariationpointType extends VariationpointType {
    @objid ("d9aed60c-5800-4f3d-b9cd-a8b49967a6bc")
    @XmlElement(required = true)
    protected List<XorVariationType> variation;

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
     * {@link XorVariationType }
     */
    @objid ("338ea3b8-c0d4-44fc-9bf4-352d7f5988f9")
    public List<XorVariationType> getVariation() {
        if (variation == null) {
            variation = new ArrayList<XorVariationType>();
        }
        return this.variation;
    }

    @objid ("81cf339b-26b8-4d83-84fc-9730956c6f32")
    @Override
    public List<VariationType> getVariations() {
        return new ArrayList<VariationType>(getVariation());
    }

}
