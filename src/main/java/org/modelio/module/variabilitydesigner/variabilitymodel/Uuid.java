package org.modelio.module.variabilitydesigner.variabilitymodel;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlValue;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name="uuid")
public class Uuid {
    @XmlValue
    private String value;

    @XmlAttribute
    private String mAttribute;

    public Uuid() {
        super();
    }

    public Uuid(String value) {
        super();
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public String getMAttribute() {
        return mAttribute;
    }

    public void setMAttribute(String value) {
        mAttribute = value;
    }

}
