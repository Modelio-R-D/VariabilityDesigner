package org.modelio.module.variabilitydesigner.utils.uml;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.module.variabilitydesigner.utils.walkers.IWalkable;
import org.modelio.vcore.smkernel.mapi.MObject;

@objid ("5008aa46-c130-453f-aac4-2dd25140b599")
public abstract class IUMLElement implements IWalkable {
    @objid ("2ce546aa-0971-4818-adc4-3f53bbfcf182")
    private MObject _element;

    @objid ("3f600da8-f6e3-48d8-bfbe-5af3f49badca")
    public IUMLElement(MObject element) {
        _element = element;
    }

    @objid ("56031de6-edb0-4748-be23-5e4c4f0bc9a3")
    public MObject getElement() {
        return _element;
    }

}
