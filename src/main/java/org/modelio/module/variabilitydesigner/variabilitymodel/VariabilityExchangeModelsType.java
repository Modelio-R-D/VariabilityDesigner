package org.modelio.module.variabilitydesigner.variabilitymodel;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import com.modeliosoft.modelio.javadesigner.annotations.objid;

/**
 * <p>Classe Java pour variability-exchange-models-type complex type.
 * 
 * <p>Le fragment de sch�ma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="variability-exchange-models-type">
 * &lt;complexContent>
 * &lt;extension base="{}identifiable-type">
 * &lt;sequence>
 * &lt;element name="version" type="{http://www.w3.org/2001/XMLSchema}unsignedInt"/>
 * &lt;element name="capability" type="{}capability-type"/>
 * &lt;element name="variability-exchange-model" type="{}variability-exchange-model-type" maxOccurs="unbounded" minOccurs="0"/>
 * &lt;/sequence>
 * &lt;/extension>
 * &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@objid ("50525815-b8be-400b-a51d-0640f2f8c233")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "variability-exchange-models-type", propOrder = {
    "version",
    "capability",
    "variabilityExchangeModel"
})
public class VariabilityExchangeModelsType extends IdentifiableType {
    @objid ("15844cb3-7624-4d54-bfe1-8f5be2f13632")
    @XmlSchemaType(name = "unsignedInt")
    protected long version;

    @objid ("89bdb914-8eda-4358-83fb-0a01e4f35749")
    @XmlElement(required = true)
    protected CapabilityType capability;

    @objid ("823d707e-b16e-41a7-a5dd-5d6f4458c756")
    @XmlElement(name = "variability-exchange-model")
    protected List<VariabilityExchangeModelType> variabilityExchangeModel;

    /**
     * Obtient la valeur de la propri�t� version.
     */
    @objid ("246d1cba-127b-45f7-af7f-8dfab101a2d0")
    public long getVersion() {
        return version;
    }

    /**
     * D�finit la valeur de la propri�t� version.
     */
    @objid ("42f75fa2-61c1-4006-8d68-daba0ecd2933")
    public void setVersion(long value) {
        this.version = value;
    }

    /**
     * Obtient la valeur de la propri�t� capability.
     * @return
     * possible object is
     * {@link CapabilityType }
     */
    @objid ("e0929095-02c3-44ff-9837-f00b0e0f5b00")
    public CapabilityType getCapability() {
        return capability;
    }

    /**
     * D�finit la valeur de la propri�t� capability.
     * 
     * @param value allowed object is
     * {@link CapabilityType }
     */
    @objid ("32d41d33-a6c2-488e-b026-615e4b6929c6")
    public void setCapability(CapabilityType value) {
        this.capability = value;
    }

    /**
     * Gets the value of the variabilityExchangeModel property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the variabilityExchangeModel property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     * getVariabilityExchangeModel().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link VariabilityExchangeModelType }
     */
    @objid ("93b63e47-0fc0-4cf7-96f6-9fe7dcbf02bc")
    public List<VariabilityExchangeModelType> getVariabilityExchangeModel() {
        if (variabilityExchangeModel == null) {
            variabilityExchangeModel = new ArrayList<VariabilityExchangeModelType>();
        }
        return this.variabilityExchangeModel;
    }

}
