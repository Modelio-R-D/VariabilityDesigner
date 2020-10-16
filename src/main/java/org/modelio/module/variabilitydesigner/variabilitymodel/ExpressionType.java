package org.modelio.module.variabilitydesigner.variabilitymodel;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;
import com.modeliosoft.modelio.javadesigner.annotations.objid;

/**
 * <p>Classe Java pour expression-type complex type.
 * 
 * <p>Le fragment de sch�ma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="expression-type">
 * &lt;simpleContent>
 * &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
 * &lt;attribute name="type" use="required" type="{}expression-enum" />
 * &lt;attribute name="datatype" type="{http://www.w3.org/2001/XMLSchema}string" />
 * &lt;/extension>
 * &lt;/simpleContent>
 * &lt;/complexType>
 * </pre>
 */
@objid ("44811609-e0bc-4f63-be99-c7a3599fe1f1")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "expression-type", propOrder = {
    "value"
})
public class ExpressionType {
    @objid ("0def4f65-9e0d-4e04-9736-a65a9e47408f")
    @XmlValue
    protected String value;

    @objid ("f67528f9-dfa0-44d6-b819-a80abc9bfd56")
    @XmlAttribute(name = "type", required = true)
    protected ExpressionEnum type;

    @objid ("1c810731-9c87-4528-bfd7-e40cab304a53")
    @XmlAttribute(name = "datatype")
    protected String datatype;

    /**
     * Obtient la valeur de la propri�t� value.
     * @return
     * possible object is
     * {@link String }
     */
    @objid ("09948cc9-3107-432c-8730-5b7886a8f341")
    public String getValue() {
        return value;
    }

    /**
     * D�finit la valeur de la propri�t� value.
     * 
     * @param value allowed object is
     * {@link String }
     */
    @objid ("8691019f-0f89-4e84-b545-aed00bd05ec4")
    public void setValue(String value) {
        this.value = value;
    }

    /**
     * Obtient la valeur de la propri�t� type.
     * @return
     * possible object is
     * {@link ExpressionEnum }
     */
    @objid ("76d894de-e4ac-44a0-b571-8ea558823908")
    public ExpressionEnum getType() {
        return type;
    }

    /**
     * D�finit la valeur de la propri�t� type.
     * 
     * @param value allowed object is
     * {@link ExpressionEnum }
     */
    @objid ("a6a262d4-eaef-4cc3-99da-32ea407b0f6b")
    public void setType(ExpressionEnum value) {
        this.type = value;
    }

    /**
     * Obtient la valeur de la propri�t� datatype.
     * @return
     * possible object is
     * {@link String }
     */
    @objid ("eeb553ea-edf0-425a-9c1c-ceacd45b7e9f")
    public String getDatatype() {
        return datatype;
    }

    /**
     * D�finit la valeur de la propri�t� datatype.
     * 
     * @param value allowed object is
     * {@link String }
     */
    @objid ("a69a5479-27af-44a5-b36b-caca32e36ee9")
    public void setDatatype(String value) {
        this.datatype = value;
    }

}
