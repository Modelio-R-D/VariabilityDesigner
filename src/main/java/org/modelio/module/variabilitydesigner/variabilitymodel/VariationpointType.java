package org.modelio.module.variabilitydesigner.variabilitymodel;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import com.modeliosoft.modelio.javadesigner.annotations.objid;

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
@objid ("b1e8bfc7-5fcd-4899-ae04-d3dfe62caf31")
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
    @objid ("2d721b34-f29e-448a-a615-bc4613c9d6dd")
    protected List<BindingtimeType> bindingtime;

    @objid ("92c363bd-a502-401f-a372-fb180ce09c92")
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
    @objid ("2e5fbbc7-5066-42e7-ad10-57f58a38b8d9")
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
    @objid ("0f91755c-9f29-42f5-83e0-1ddff2f2e6d9")
    public List<ArtifactElementType> getCorrespondingVariableArtifactElement() {
        if (correspondingVariableArtifactElement == null) {
            correspondingVariableArtifactElement = new ArrayList<ArtifactElementType>();
        }
        return this.correspondingVariableArtifactElement;
    }

    @objid ("a07f0c3e-5249-4f3c-a8eb-7774ecc87ee7")
    public abstract List<VariationType> getVariations();

}
