package org.modelio.module.variabilitydesigner.variabilitymodel;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.modeliosoft.modelio.javadesigner.annotations.objid;

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
@objid ("43a913fc-caca-4d58-977e-a76ee77d14d9")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "capability-type", propOrder = {
    "importVariabilityExchangeModel",
    "exportVariabilityExchangeModel",
    "getConfiguration",
    "setConfiguration"
})
public class CapabilityType {
    @objid ("527e4089-adf8-4c9c-9f75-87197f21afb1")
    @XmlElement(name = "import-variability-exchange-model")
    protected boolean importVariabilityExchangeModel;

    @objid ("2106cc51-ea54-4b71-b306-ad358250dfc9")
    @XmlElement(name = "export-variability-exchange-model")
    protected boolean exportVariabilityExchangeModel;

    @objid ("2fcf4bb2-e01a-42db-a9ec-120b702545c8")
    @XmlElement(name = "get-configuration")
    protected boolean getConfiguration;

    @objid ("b05c61c9-4957-4946-80d3-b645eedc07a9")
    @XmlElement(name = "set-configuration")
    protected boolean setConfiguration;

    /**
     * Obtient la valeur de la propri�t� importVariabilityExchangeModel.
     */
    @objid ("a0324094-e76e-49ca-8a2e-23ceba17def2")
    public boolean isImportVariabilityExchangeModel() {
        return importVariabilityExchangeModel;
    }

    /**
     * D�finit la valeur de la propri�t� importVariabilityExchangeModel.
     */
    @objid ("21ccaa77-6c06-4c7e-86ce-75f61835f509")
    public void setImportVariabilityExchangeModel(boolean value) {
        this.importVariabilityExchangeModel = value;
    }

    /**
     * Obtient la valeur de la propri�t� exportVariabilityExchangeModel.
     */
    @objid ("08c065d3-8d67-497a-90fa-ec7481218e00")
    public boolean isExportVariabilityExchangeModel() {
        return exportVariabilityExchangeModel;
    }

    /**
     * D�finit la valeur de la propri�t� exportVariabilityExchangeModel.
     */
    @objid ("27d2154d-760e-404d-97b9-ea1dbe826eba")
    public void setExportVariabilityExchangeModel(boolean value) {
        this.exportVariabilityExchangeModel = value;
    }

    /**
     * Obtient la valeur de la propri�t� getConfiguration.
     */
    @objid ("3bc2ffb6-ca5f-430e-a94e-e38ca4aca5d6")
    public boolean isGetConfiguration() {
        return getConfiguration;
    }

    /**
     * D�finit la valeur de la propri�t� getConfiguration.
     */
    @objid ("23a81275-0d33-4b28-ab04-42958f9881b3")
    public void setGetConfiguration(boolean value) {
        this.getConfiguration = value;
    }

    /**
     * Obtient la valeur de la propri�t� setConfiguration.
     */
    @objid ("975bdf51-01a7-4bb5-8df7-a99d5f6c736d")
    public boolean isSetConfiguration() {
        return setConfiguration;
    }

    /**
     * D�finit la valeur de la propri�t� setConfiguration.
     */
    @objid ("a7cab7c4-b3e2-4000-a312-24a8cf8817d5")
    public void setSetConfiguration(boolean value) {
        this.setConfiguration = value;
    }

}
