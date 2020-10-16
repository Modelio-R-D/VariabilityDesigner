package org.modelio.module.variabilitydesigner.vel.imports;

import org.modelio.vcore.smkernel.mapi.MAttribute;

public class MAttributeValue {
    private String _value;

    private MAttribute _mAttribute;

    public String getValue() {
        return _value;
    }

    public void setValue(String value) {
        _value = value;
    }

    public MAttribute getmAttribute() {
        return _mAttribute;
    }

    public void setmAttribute(MAttribute mAttribute) {
        _mAttribute = mAttribute;
    }

}
