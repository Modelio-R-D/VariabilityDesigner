package org.modelio.module.variabilitydesigner.variabilitymodel;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;

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
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "expression-type", propOrder = {
    "value"
})
public class ExpressionType {
    @XmlValue
    protected String value;

    @XmlAttribute(name = "type", required = true)
    protected ExpressionEnum type;

    @XmlAttribute(name = "datatype")
    protected String datatype;

    /**
     * Obtient la valeur de la propri�t� value.
     * @return
     * possible object is
     * {@link String }
     */
    public String getValue() {
        return value;
    }

    /**
     * D�finit la valeur de la propri�t� value.
     * 
     * @param value allowed object is
     * {@link String }
     */
    public void setValue(String value) {
        this.value = value;
    }

    /**
     * Obtient la valeur de la propri�t� type.
     * @return
     * possible object is
     * {@link ExpressionEnum }
     */
    public ExpressionEnum getType() {
        return type;
    }

    /**
     * D�finit la valeur de la propri�t� type.
     * 
     * @param value allowed object is
     * {@link ExpressionEnum }
     */
    public void setType(ExpressionEnum value) {
        this.type = value;
    }

    /**
     * Obtient la valeur de la propri�t� datatype.
     * @return
     * possible object is
     * {@link String }
     */
    public String getDatatype() {
        return datatype;
    }

    /**
     * D�finit la valeur de la propri�t� datatype.
     * 
     * @param value allowed object is
     * {@link String }
     */
    public void setDatatype(String value) {
        this.datatype = value;
    }

}
