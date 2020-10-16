package org.modelio.module.variabilitydesigner.variabilitymodel;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.modeliosoft.modelio.javadesigner.annotations.objid;

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
@objid ("27520518-de90-4908-8121-4f9c44784524")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "xor-parameter-variationpoint-type", propOrder = {
    "variation"
})
public class XorParameterVariationpointType extends VariationpointType {
    @objid ("d4ae4548-ebb9-4ee0-85f3-440e269bf152")
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
    @objid ("5ea6f1cd-612f-4c44-9237-cf230f8436d4")
    public List<ValueVariationType> getVariation() {
        if (variation == null) {
            variation = new ArrayList<ValueVariationType>();
        }
        return this.variation;
    }

    @objid ("8f462aec-7467-4d61-ab53-7f6658bce583")
    @Override
    public List<VariationType> getVariations() {
        return new ArrayList<VariationType>(getVariation());
    }

}
