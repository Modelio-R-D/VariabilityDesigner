package org.modelio.module.variabilitydesigner.variabilitymodel;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>Classe Java pour variationpoint-type complex type.
 * 
 * <p>Le fragment de sch�ma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="variationpoint-type">
 * &lt;complexContent>
 * &lt;extension base="{}identifiable-type">
 * &lt;sequence>
 * &lt;element name="bindingtime" type="{}bindingtime-type" maxOccurs="unbounded" minOccurs="0"/>
 * &lt;element name="corresponding-variable-artifact-element" type="{}artifact-element-type" maxOccurs="unbounded" minOccurs="0"/>
 * &lt;/sequence>
 * &lt;/extension>
 * &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "variationpoint-type", propOrder = {
    "bindingtime",
    "correspondingVariableArtifactElement"
})
@XmlSeeAlso({
    XorParameterVariationpointType.class,
    CalculatedParameterVariationpointType.class,
    OptionalStructuralVariationpointType.class,
    XorStructuralVariationpointType.class
})
public abstract class VariationpointType extends IdentifiableType {
    protected List<BindingtimeType> bindingtime;

    @XmlElement(name = "corresponding-variable-artifact-element")
    protected List<ArtifactElementType> correspondingVariableArtifactElement;

    /**
     * Gets the value of the bindingtime property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the bindingtime property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     * getBindingtime().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BindingtimeType }
     */
    public List<BindingtimeType> getBindingtime() {
        if (bindingtime == null) {
            bindingtime = new ArrayList<BindingtimeType>();
        }
        return this.bindingtime;
    }

    /**
     * Gets the value of the correspondingVariableArtifactElement property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the correspondingVariableArtifactElement property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     * getCorrespondingVariableArtifactElement().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ArtifactElementType }
     */
    public List<ArtifactElementType> getCorrespondingVariableArtifactElement() {
        if (correspondingVariableArtifactElement == null) {
            correspondingVariableArtifactElement = new ArrayList<ArtifactElementType>();
        }
        return this.correspondingVariableArtifactElement;
    }

    public abstract List<VariationType> getVariations();

}
