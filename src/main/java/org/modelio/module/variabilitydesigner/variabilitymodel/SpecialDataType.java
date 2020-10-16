package org.modelio.module.variabilitydesigner.variabilitymodel;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;
import com.modeliosoft.modelio.javadesigner.annotations.objid;

/**
 * <p>Classe Java pour special-data-type complex type.
 * 
 * <p>Le fragment de sch�ma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="special-data-type">
 * &lt;complexContent>
 * &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 * &lt;sequence>
 * &lt;element name="data" type="{}key-value-pair-type" maxOccurs="unbounded" minOccurs="0"/>
 * &lt;/sequence>
 * &lt;attribute name="name" type="{http://www.w3.org/2001/XMLSchema}string" />
 * &lt;/restriction>
 * &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@objid ("ec6902d3-a157-4e07-ad2a-2563684e97df")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "special-data-type", propOrder = {
    "data"
})
public class SpecialDataType {
    @objid ("77d1cd13-4001-4b57-a153-d9e1885d373e")
    @XmlAttribute(name = "name")
    protected String name;

    @objid ("f627fea2-0666-47ed-9859-93f6f4ebfa3c")
    protected List<KeyValuePairType> data;

    /**
     * Gets the value of the data property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the data property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     * getData().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link KeyValuePairType }
     */
    @objid ("90d831d5-a5e3-4a26-a5b3-e3b85800eda9")
    public List<KeyValuePairType> getData() {
        if (data == null) {
            data = new ArrayList<KeyValuePairType>();
        }
        return this.data;
    }

    /**
     * Obtient la valeur de la propri�t� name.
     * @return
     * possible object is
     * {@link String }
     */
    @objid ("7e1eb522-8bbc-4702-83d9-6c9b6b02bedc")
    public String getName() {
        return name;
    }

    /**
     * D�finit la valeur de la propri�t� name.
     * 
     * @param value allowed object is
     * {@link String }
     */
    @objid ("0eabb0d3-b8a1-47e2-84d4-a0330f4dc902")
    public void setName(String value) {
        this.name = value;
    }

}
