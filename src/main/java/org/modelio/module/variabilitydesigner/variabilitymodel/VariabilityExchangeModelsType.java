package org.modelio.module.variabilitydesigner.variabilitymodel;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;

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
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "variability-exchange-models-type", propOrder = {
    "version",
    "capability",
    "variabilityExchangeModel"
})
public class VariabilityExchangeModelsType extends IdentifiableType {
    @XmlSchemaType(name = "unsignedInt")
    protected long version;

    @XmlElement(required = true)
    protected CapabilityType capability;

    @XmlElement(name = "variability-exchange-model")
    protected List<VariabilityExchangeModelType> variabilityExchangeModel;

    /**
     * Obtient la valeur de la propri�t� version.
     */
    public long getVersion() {
        return version;
    }

    /**
     * D�finit la valeur de la propri�t� version.
     */
    public void setVersion(long value) {
        this.version = value;
    }

    /**
     * Obtient la valeur de la propri�t� capability.
     * @return
     * possible object is
     * {@link CapabilityType }
     */
    public CapabilityType getCapability() {
        return capability;
    }

    /**
     * D�finit la valeur de la propri�t� capability.
     * 
     * @param value allowed object is
     * {@link CapabilityType }
     */
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
    public List<VariabilityExchangeModelType> getVariabilityExchangeModel() {
        if (variabilityExchangeModel == null) {
            variabilityExchangeModel = new ArrayList<VariabilityExchangeModelType>();
        }
        return this.variabilityExchangeModel;
    }

}
