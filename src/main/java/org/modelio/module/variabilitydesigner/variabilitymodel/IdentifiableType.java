package org.modelio.module.variabilitydesigner.variabilitymodel;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlID;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * <p>Classe Java pour identifiable-type complex type.
 * 
 * <p>Le fragment de sch�ma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="identifiable-type">
 * &lt;complexContent>
 * &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 * &lt;sequence>
 * &lt;element name="special-data" type="{}special-data-type" maxOccurs="unbounded" minOccurs="0"/>
 * &lt;/sequence>
 * &lt;attribute name="name">
 * &lt;simpleType>
 * &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 * &lt;minLength value="1"/>
 * &lt;/restriction>
 * &lt;/simpleType>
 * &lt;/attribute>
 * &lt;attribute name="id" use="required" type="{http://www.w3.org/2001/XMLSchema}ID" />
 * &lt;/restriction>
 * &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "identifiable-type", propOrder = {
    "specialData"
})
@XmlSeeAlso({
    VariabilityExchangeModelsType.class,
    VariabilityExchangeModelType.class,
    VariationpointHierarchyType.class,
    VariationDependencyType.class,
    VariationpointType.class,
    VariationType.class
})
public abstract class IdentifiableType {
    @XmlAttribute(name = "name")
    protected String name;

    @XmlAttribute(name = "id", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    @XmlSchemaType(name = "ID")
    protected String id;

    @XmlElement(name = "special-data")
    protected List<SpecialDataType> specialData;

    /**
     * Gets the value of the specialData property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the specialData property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     * getSpecialData().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SpecialDataType }
     */
    public List<SpecialDataType> getSpecialData() {
        if (specialData == null) {
            specialData = new ArrayList<SpecialDataType>();
        }
        return this.specialData;
    }

    /**
     * Obtient la valeur de la propri�t� name.
     * @return
     * possible object is
     * {@link String }
     */
    public String getName() {
        return name;
    }

    /**
     * D�finit la valeur de la propri�t� name.
     * 
     * @param value allowed object is
     * {@link String }
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Obtient la valeur de la propri�t� id.
     * @return
     * possible object is
     * {@link String }
     */
    public String getId() {
        return id;
    }

    /**
     * D�finit la valeur de la propri�t� id.
     * 
     * @param value allowed object is
     * {@link String }
     */
    public void setId(String value) {
        this.id = value;
    }

}
