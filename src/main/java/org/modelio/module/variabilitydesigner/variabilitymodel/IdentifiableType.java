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
import com.modeliosoft.modelio.javadesigner.annotations.objid;

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
@objid ("e08df8b4-15d9-461b-8850-0ec36719f9b5")
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
    @objid ("bca5151c-4103-4c7f-8bad-68034b4ab09c")
    @XmlAttribute(name = "name")
    protected String name;

    @objid ("68912e75-32b5-42a8-91c6-afc9c794ebbf")
    @XmlAttribute(name = "id", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    @XmlSchemaType(name = "ID")
    protected String id;

    @objid ("3083152a-d75c-44f2-bb8c-273db1ad2146")
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
    @objid ("60e72573-1fb7-4b01-acbc-08e94586aa29")
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
    @objid ("a576ea3a-3879-46ec-8933-4f6f809ec7df")
    public String getName() {
        return name;
    }

    /**
     * D�finit la valeur de la propri�t� name.
     * 
     * @param value allowed object is
     * {@link String }
     */
    @objid ("cbdf0895-e09f-4224-b518-03f20d5a9fbb")
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Obtient la valeur de la propri�t� id.
     * @return
     * possible object is
     * {@link String }
     */
    @objid ("b6695dfe-da29-48bb-9bf3-d09748f4e260")
    public String getId() {
        return id;
    }

    /**
     * D�finit la valeur de la propri�t� id.
     * 
     * @param value allowed object is
     * {@link String }
     */
    @objid ("64e31cc0-c515-46d6-87c0-fcae7b7dec8c")
    public void setId(String value) {
        this.id = value;
    }

}
