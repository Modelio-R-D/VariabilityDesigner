package org.modelio.module.variabilitydesigner.vel.imports;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.vcore.smkernel.mapi.MAttribute;

@objid ("a6c98579-55f8-4c8e-89e2-0e3d754c8d90")
public class MAttributeValue {
    @objid ("55a345d8-9ce9-417d-88a2-f181c7f1b4e0")
    private String _value;

    @objid ("94221444-b44c-4706-9124-732edd1abcd8")
    private MAttribute _mAttribute;

    @objid ("06ec688c-4da8-477c-9d59-0baf8ffc6390")
    public String getValue() {
        return _value;
    }

    @objid ("ec88382a-90dd-450d-bbce-2fbef0e7ecb5")
    public void setValue(String value) {
        _value = value;
    }

    @objid ("e542b074-4c4d-4cd3-9b84-a4b7b102a753")
    public MAttribute getmAttribute() {
        return _mAttribute;
    }

    @objid ("6fb604a5-c7c2-4e16-a5cb-a49981facd6f")
    public void setmAttribute(MAttribute mAttribute) {
        _mAttribute = mAttribute;
    }

}
