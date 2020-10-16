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

/**
 * <p>Classe Java pour variationpoint-hierarchy-type complex type.
 * 
 * <p>Le fragment de sch�ma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="variationpoint-hierarchy-type">
 * &lt;complexContent>
 * &lt;extension base="{}identifiable-type">
 * &lt;sequence>
 * &lt;element name="variationpoint" maxOccurs="unbounded">
 * &lt;complexType>
 * &lt;complexContent>
 * &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 * &lt;attribute name="ref" use="required" type="{http://www.w3.org/2001/XMLSchema}IDREF" />
 * &lt;/restriction>
 * &lt;/complexContent>
 * &lt;/complexType>
 * &lt;/element>
 * &lt;/sequence>
 * &lt;/extension>
 * &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "variationpoint-hierarchy-type", propOrder = {
    "variationpoint"
})
public class VariationpointHierarchyType extends IdentifiableType {
    @XmlElement(required = true)
    protected List<org.modelio.module.variabilitydesigner.variabilitymodel.VariationpointHierarchyType.Variationpoint> variationpoint;

    /**
     * Gets the value of the variationpoint property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the variationpoint property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     * getVariationpoint().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link VariationpointHierarchyType.Variationpoint }
     */
    public List<org.modelio.module.variabilitydesigner.variabilitymodel.VariationpointHierarchyType.Variationpoint> getVariationpoint() {
        if (variationpoint == null) {
            variationpoint = new ArrayList<VariationpointHierarchyType.Variationpoint>();
        }
        return this.variationpoint;
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
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class Variationpoint {
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
        public Object getRef() {
            return ref;
        }

        /**
         * D�finit la valeur de la propri�t� ref.
         * 
         * @param value allowed object is
         * {@link Object }
         */
        public void setRef(Object value) {
            this.ref = value;
        }

    }

}
