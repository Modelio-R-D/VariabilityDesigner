package org.modelio.module.variabilitydesigner.variabilitymodel;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAnyElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.w3c.dom.Element;

/**
 * <p>Classe Java pour artifact-element-type complex type.
 * 
 * <p>Le fragment de sch�ma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="artifact-element-type">
 * &lt;complexContent>
 * &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 * &lt;sequence>
 * &lt;any processContents='lax' maxOccurs="unbounded" minOccurs="0"/>
 * &lt;/sequence>
 * &lt;attribute name="type" type="{http://www.w3.org/2001/XMLSchema}string" />
 * &lt;attribute name="uri" type="{http://www.w3.org/2001/XMLSchema}anyURI" />
 * &lt;/restriction>
 * &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@objid ("0433579f-4903-4a84-b3e9-2f09cb0bbcfe")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "artifact-element-type", propOrder = {
    "any"
})
@XmlSeeAlso(Uuid.class)
public class ArtifactElementType {
    @objid ("df017e41-8461-4828-838e-fd6df7efd386")
    @XmlAttribute(name = "type")
    protected String type;

    @objid ("27fe99bf-1fb7-4293-a7fc-1a76fe642c2f")
    @XmlAttribute(name = "uri")
    @XmlSchemaType(name = "anyURI")
    protected String uri;

    @objid ("d9c4ee43-de44-44a6-aa39-145a1b809824")
    @XmlAnyElement(lax = true)
    protected List<Object> any;

    /**
     * Gets the value of the any property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the any property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     * getAny().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Element }
     * {@link Object }
     */
    @objid ("64975bf2-22fe-40a7-b78b-b1b8d1967fae")
    public List<Object> getAny() {
        if (any == null) {
            any = new ArrayList<Object>();
        }
        return this.any;
    }

    /**
     * Obtient la valeur de la propri�t� type.
     * @return
     * possible object is
     * {@link String }
     */
    @objid ("80e1f0bd-165d-45e7-9021-09d017ef4aa6")
    public String getType() {
        return type;
    }

    /**
     * D�finit la valeur de la propri�t� type.
     * 
     * @param value allowed object is
     * {@link String }
     */
    @objid ("99e62484-a97f-4363-931e-6972265f840e")
    public void setType(String value) {
        this.type = value;
    }

    /**
     * Obtient la valeur de la propri�t� uri.
     * @return
     * possible object is
     * {@link String }
     */
    @objid ("15162955-74df-42b4-839f-424a6c99a801")
    public String getUri() {
        return uri;
    }

    /**
     * D�finit la valeur de la propri�t� uri.
     * 
     * @param value allowed object is
     * {@link String }
     */
    @objid ("0ff79c71-8748-47c8-a860-5008e4f64c71")
    public void setUri(String value) {
        this.uri = value;
    }

}
