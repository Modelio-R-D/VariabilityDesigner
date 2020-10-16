package org.modelio.module.variabilitydesigner.variabilitymodel;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElements;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import com.modeliosoft.modelio.javadesigner.annotations.objid;

/**
 * <p>Classe Java pour variability-exchange-model-type complex type.
 * 
 * <p>Le fragment de sch�ma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="variability-exchange-model-type">
 * &lt;complexContent>
 * &lt;extension base="{}identifiable-type">
 * &lt;sequence>
 * &lt;group ref="{}variationpoint-group" maxOccurs="unbounded" minOccurs="0"/>
 * &lt;/sequence>
 * &lt;attribute name="type" use="required" type="{}variability-api-enum" />
 * &lt;attribute name="uri" type="{http://www.w3.org/2001/XMLSchema}anyURI" />
 * &lt;/extension>
 * &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@objid ("c4fbf428-32d3-4efd-a088-9f6ffae2b06e")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "variability-exchange-model-type", propOrder = {
    "variationpointGroup"
})
public class VariabilityExchangeModelType extends IdentifiableType {
    @objid ("2dd943b6-8b8c-470f-8315-dc9f09ace5a9")
    @XmlAttribute(name = "type", required = true)
    protected VariabilityApiEnum type;

    @objid ("2bc15e7b-09f1-436a-a8e2-402ccaa88a02")
    @XmlAttribute(name = "uri")
    @XmlSchemaType(name = "anyURI")
    protected String uri;

    @objid ("e5bb9aea-3507-4b78-94e0-d76b130ccbee")
    @XmlElements({
        @XmlElement(name = "optional-structural-variationpoint", type = OptionalStructuralVariationpointType.class),
        @XmlElement(name = "xor-structural-variationpoint", type = XorStructuralVariationpointType.class),
        @XmlElement(name = "calculated-parameter-variationpoint", type = CalculatedParameterVariationpointType.class),
        @XmlElement(name = "xor-parameter-variationpoint", type = XorParameterVariationpointType.class)
    })
    protected List<VariationpointType> variationpointGroup;

    /**
     * Gets the value of the variationpointGroup property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the variationpointGroup property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     * getVariationpointGroup().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OptionalStructuralVariationpointType }
     * {@link XorStructuralVariationpointType }
     * {@link CalculatedParameterVariationpointType }
     * {@link XorParameterVariationpointType }
     */
    @objid ("17830f99-cba4-4c99-ace0-4552433b0642")
    public List<VariationpointType> getVariationpointGroup() {
        if (variationpointGroup == null) {
            variationpointGroup = new ArrayList<VariationpointType>();
        }
        return this.variationpointGroup;
    }

    /**
     * Obtient la valeur de la propri�t� type.
     * @return
     * possible object is
     * {@link VariabilityApiEnum }
     */
    @objid ("c56b1d99-b9e4-41a8-a7ba-af7cafb44a4f")
    public VariabilityApiEnum getType() {
        return type;
    }

    /**
     * D�finit la valeur de la propri�t� type.
     * 
     * @param value allowed object is
     * {@link VariabilityApiEnum }
     */
    @objid ("4f50478d-8b9f-415f-bc9b-3acaa5f5bfd7")
    public void setType(VariabilityApiEnum value) {
        this.type = value;
    }

    /**
     * Obtient la valeur de la propri�t� uri.
     * @return
     * possible object is
     * {@link String }
     */
    @objid ("7153e3af-7657-4962-8758-3b2560d573bc")
    public String getUri() {
        return uri;
    }

    /**
     * D�finit la valeur de la propri�t� uri.
     * 
     * @param value allowed object is
     * {@link String }
     */
    @objid ("b6c138c1-854d-49d1-93b8-2ef97365f09c")
    public void setUri(String value) {
        this.uri = value;
    }

}
