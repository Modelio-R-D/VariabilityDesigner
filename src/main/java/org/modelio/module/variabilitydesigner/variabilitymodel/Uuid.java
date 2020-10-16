package org.modelio.module.variabilitydesigner.variabilitymodel;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlValue;
import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("5f1b0c8f-bb73-40a5-91c5-db4d477223fa")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name="uuid")
public class Uuid {
    @objid ("aa4bbbd1-65e7-4043-b6c5-10c1dfb9310e")
    @XmlValue
    private String value;

    @objid ("84f71414-cd1f-4291-94b4-e352dd4fa6c1")
    @XmlAttribute
    private String mAttribute;

    @objid ("15b98811-b20e-47ff-9a41-3501d105792b")
    public Uuid() {
        super();
    }

    @objid ("50a0074c-8a4c-49e5-824c-98d430dc6dc8")
    public Uuid(String value) {
        super();
        this.value = value;
    }

    @objid ("6f9a62d9-56b3-4038-a069-d2eba5105df9")
    public String getValue() {
        return value;
    }

    @objid ("8336cad4-4921-4c67-91af-5e05fbe316ca")
    public void setValue(String value) {
        this.value = value;
    }

    @objid ("1b4ba1e9-d8ec-4ec6-9681-4b0ffacc3c36")
    public String getMAttribute() {
        return mAttribute;
    }

    @objid ("1d4c89d7-8e12-4c7e-9fc7-e908987708ff")
    public void setMAttribute(String value) {
        mAttribute = value;
    }

}
