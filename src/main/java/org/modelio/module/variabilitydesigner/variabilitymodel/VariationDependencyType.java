package org.modelio.module.variabilitydesigner.variabilitymodel;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlIDREF;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import com.modeliosoft.modelio.javadesigner.annotations.objid;

/**
 * <p>Classe Java pour variation-dependency-type complex type.
 * 
 * <p>Le fragment de sch�ma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="variation-dependency-type">
 * &lt;complexContent>
 * &lt;extension base="{}identifiable-type">
 * &lt;sequence>
 * &lt;element name="variation" maxOccurs="unbounded">
 * &lt;complexType>
 * &lt;complexContent>
 * &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 * &lt;attribute name="ref" use="required" type="{http://www.w3.org/2001/XMLSchema}IDREF" />
 * &lt;/restriction>
 * &lt;/complexContent>
 * &lt;/complexType>
 * &lt;/element>
 * &lt;element name="condition" type="{}expression-type" minOccurs="0"/>
 * &lt;/sequence>
 * &lt;attribute name="type" use="required" type="{}variation-dependency-enum" />
 * &lt;/extension>
 * &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@objid ("0823b222-9f81-480f-b902-509a2966d43a")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "variation-dependency-type", propOrder = {
    "variation",
    "condition"
})
public class VariationDependencyType extends IdentifiableType {
    @objid ("253e6380-521c-4ffc-a17e-4a8af1e675b2")
    @XmlAttribute(name = "type", required = true)
    protected VariationDependencyEnum type;

    @objid ("9384a550-3f9d-4bf7-be47-4ef4147294d9")
    @XmlElement(required = true)
    protected List<org.modelio.module.variabilitydesigner.variabilitymodel.VariationDependencyType.Variation> variation;

    @objid ("c2234c4d-be21-4821-bf42-e27afb495835")
    protected ExpressionType condition;

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
     * {@link VariationDependencyType.Variation }
     */
    @objid ("feffe7ed-c988-4e0f-b269-cc94e93c255d")
    public List<org.modelio.module.variabilitydesigner.variabilitymodel.VariationDependencyType.Variation> getVariation() {
        if (variation == null) {
            variation = new ArrayList<VariationDependencyType.Variation>();
        }
        return this.variation;
    }

    /**
     * Obtient la valeur de la propri�t� condition.
     * @return
     * possible object is
     * {@link ExpressionType }
     */
    @objid ("409ec421-8032-420b-aa79-fc904dee73ca")
    public ExpressionType getCondition() {
        return condition;
    }

    /**
     * D�finit la valeur de la propri�t� condition.
     * 
     * @param value allowed object is
     * {@link ExpressionType }
     */
    @objid ("11f8baf4-4fab-45e8-b186-8cb664c58453")
    public void setCondition(ExpressionType value) {
        this.condition = value;
    }

    /**
     * Obtient la valeur de la propri�t� type.
     * @return
     * possible object is
     * {@link VariationDependencyEnum }
     */
    @objid ("ce4b7832-b36e-46f5-947b-508d5a17f5b5")
    public VariationDependencyEnum getType() {
        return type;
    }

    /**
     * D�finit la valeur de la propri�t� type.
     * 
     * @param value allowed object is
     * {@link VariationDependencyEnum }
     */
    @objid ("6f12cd1f-cd35-4ab3-9d3b-893c21dfbebc")
    public void setType(VariationDependencyEnum value) {
        this.type = value;
    }

    /**
     * <p>Classe Java pour anonymous complex type.
     * 
     * <p>Le fragment de sch�ma suivant indique le contenu attendu figurant dans cette classe.
     * 
     * <pre>
     * &lt;complexType>
     * &lt;complexContent>
     * &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     * &lt;attribute name="ref" use="required" type="{http://www.w3.org/2001/XMLSchema}IDREF" />
     * &lt;/restriction>
     * &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     */
    @objid ("c632337d-606e-4611-9c55-1d438caf45ae")
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class Variation {
        @objid ("5c0f709a-4013-479f-b4c9-e96b660e61af")
        @XmlAttribute(name = "ref", required = true)
        @XmlIDREF
        @XmlSchemaType(name = "IDREF")
        protected Object ref;

        /**
         * Obtient la valeur de la propri�t� ref.
         * @return
         * possible object is
         * {@link Object }
         */
        @objid ("76983f00-82a7-47b8-9218-e0bad0009910")
        public Object getRef() {
            return ref;
        }

        /**
         * D�finit la valeur de la propri�t� ref.
         * 
         * @param value allowed object is
         * {@link Object }
         */
        @objid ("a1ce836b-13c9-410e-bf8c-68343d770c60")
        public void setRef(Object value) {
            this.ref = value;
        }

    }

}
