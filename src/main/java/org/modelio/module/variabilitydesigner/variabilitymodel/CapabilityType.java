package org.modelio.module.variabilitydesigner.variabilitymodel;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>Classe Java pour capability-type complex type.
 * 
 * <p>Le fragment de sch�ma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="capability-type">
 * &lt;complexContent>
 * &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 * &lt;sequence>
 * &lt;element name="import-variability-exchange-model" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 * &lt;element name="export-variability-exchange-model" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 * &lt;element name="get-configuration" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 * &lt;element name="set-configuration" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 * &lt;/sequence>
 * &lt;/restriction>
 * &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "capability-type", propOrder = {
    "importVariabilityExchangeModel",
    "exportVariabilityExchangeModel",
    "getConfiguration",
    "setConfiguration"
})
public class CapabilityType {
    @XmlElement(name = "import-variability-exchange-model")
    protected boolean importVariabilityExchangeModel;

    @XmlElement(name = "export-variability-exchange-model")
    protected boolean exportVariabilityExchangeModel;

    @XmlElement(name = "get-configuration")
    protected boolean getConfiguration;

    @XmlElement(name = "set-configuration")
    protected boolean setConfiguration;

    /**
     * Obtient la valeur de la propri�t� importVariabilityExchangeModel.
     */
    public boolean isImportVariabilityExchangeModel() {
        return importVariabilityExchangeModel;
    }

    /**
     * D�finit la valeur de la propri�t� importVariabilityExchangeModel.
     */
    public void setImportVariabilityExchangeModel(boolean value) {
        this.importVariabilityExchangeModel = value;
    }

    /**
     * Obtient la valeur de la propri�t� exportVariabilityExchangeModel.
     */
    public boolean isExportVariabilityExchangeModel() {
        return exportVariabilityExchangeModel;
    }

    /**
     * D�finit la valeur de la propri�t� exportVariabilityExchangeModel.
     */
    public void setExportVariabilityExchangeModel(boolean value) {
        this.exportVariabilityExchangeModel = value;
    }

    /**
     * Obtient la valeur de la propri�t� getConfiguration.
     */
    public boolean isGetConfiguration() {
        return getConfiguration;
    }

    /**
     * D�finit la valeur de la propri�t� getConfiguration.
     */
    public void setGetConfiguration(boolean value) {
        this.getConfiguration = value;
    }

    /**
     * Obtient la valeur de la propri�t� setConfiguration.
     */
    public boolean isSetConfiguration() {
        return setConfiguration;
    }

    /**
     * D�finit la valeur de la propri�t� setConfiguration.
     */
    public void setSetConfiguration(boolean value) {
        this.setConfiguration = value;
    }

}
