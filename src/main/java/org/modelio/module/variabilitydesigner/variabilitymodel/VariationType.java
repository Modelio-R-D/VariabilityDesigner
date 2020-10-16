package org.modelio.module.variabilitydesigner.variabilitymodel;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import com.modeliosoft.modelio.javadesigner.annotations.objid;

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
@objid ("17ffaed7-ec79-4bba-a0a3-251da1922e09")
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
    @objid ("35fb03f9-d11c-4dc8-b42a-13726bff571a")
    @XmlAttribute(name = "selected")
    protected Boolean selected;

    @objid ("59741bc7-c3f8-4d92-a04e-d8a4000a486c")
    protected VariationpointHierarchyType hierarchy;

    @objid ("83919641-249f-4746-ab2a-734693b9cd62")
    protected List<VariationDependencyType> depencency;

    @objid ("b197d672-7d74-421a-9c8d-a8407c4b5377")
    @XmlElement(name = "corresponding-variable-artifact-element")
    protected List<ArtifactElementType> correspondingVariableArtifactElement;

    /**
     * Obtient la valeur de la propri�t� hierarchy.
     * @return
     * possible object is
     * {@link VariationpointHierarchyType }
     */
    @objid ("1753b6d9-8b48-41a9-af6d-e161464e2168")
    public VariationpointHierarchyType getHierarchy() {
        return hierarchy;
    }

    /**
     * D�finit la valeur de la propri�t� hierarchy.
     * 
     * @param value allowed object is
     * {@link VariationpointHierarchyType }
     */
    @objid ("6133a9b4-5a5c-4700-b8f5-0745a51dd52d")
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
    @objid ("02bac9dd-8814-434d-8fdc-42c8ed3fffbb")
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
    @objid ("f473a4d0-bbf5-4481-b6ec-04ac0b1303fc")
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
    @objid ("5fbbac13-985b-46dd-a04f-d9f3f9f750a7")
    public Boolean isSelected() {
        return selected;
    }

    /**
     * D�finit la valeur de la propri�t� selected.
     * 
     * @param value allowed object is
     * {@link Boolean }
     */
    @objid ("f055ec85-db5b-4b27-b80f-63f34946ab3b")
    public void setSelected(Boolean value) {
        this.selected = value;
    }

}
