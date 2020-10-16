package org.modelio.module.variabilitydesigner.variabilitymodel;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>Classe Java pour variation-type complex type.
 * 
 * <p>Le fragment de sch�ma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="variation-type">
 * &lt;complexContent>
 * &lt;extension base="{}identifiable-type">
 * &lt;sequence>
 * &lt;element name="hierarchy" type="{}variationpoint-hierarchy-type" minOccurs="0"/>
 * &lt;element name="depencency" type="{}variation-dependency-type" maxOccurs="unbounded" minOccurs="0"/>
 * &lt;element name="corresponding-variable-artifact-element" type="{}artifact-element-type" maxOccurs="unbounded" minOccurs="0"/>
 * &lt;/sequence>
 * &lt;attribute name="selected" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 * &lt;/extension>
 * &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "variation-type", propOrder = {
    "hierarchy",
    "depencency",
    "correspondingVariableArtifactElement"
})
@XmlSeeAlso({
    XorVariationType.class,
    CalculatedVariationType.class,
    OptionalVariationType.class,
    ValueVariationType.class
})
public abstract class VariationType extends IdentifiableType {
    @XmlAttribute(name = "selected")
    protected Boolean selected;

    protected VariationpointHierarchyType hierarchy;

    protected List<VariationDependencyType> depencency;

    @XmlElement(name = "corresponding-variable-artifact-element")
    protected List<ArtifactElementType> correspondingVariableArtifactElement;

    /**
     * Obtient la valeur de la propri�t� hierarchy.
     * @return
     * possible object is
     * {@link VariationpointHierarchyType }
     */
    public VariationpointHierarchyType getHierarchy() {
        return hierarchy;
    }

    /**
     * D�finit la valeur de la propri�t� hierarchy.
     * 
     * @param value allowed object is
     * {@link VariationpointHierarchyType }
     */
    public void setHierarchy(VariationpointHierarchyType value) {
        this.hierarchy = value;
    }

    /**
     * Gets the value of the depencency property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the depencency property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     * getDepencency().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link VariationDependencyType }
     */
    public List<VariationDependencyType> getDepencency() {
        if (depencency == null) {
            depencency = new ArrayList<VariationDependencyType>();
        }
        return this.depencency;
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

    /**
     * Obtient la valeur de la propri�t� selected.
     * @return
     * possible object is
     * {@link Boolean }
     */
    public Boolean isSelected() {
        return selected;
    }

    /**
     * D�finit la valeur de la propri�t� selected.
     * 
     * @param value allowed object is
     * {@link Boolean }
     */
    public void setSelected(Boolean value) {
        this.selected = value;
    }

}
