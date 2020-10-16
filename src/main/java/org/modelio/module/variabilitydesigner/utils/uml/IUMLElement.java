package org.modelio.module.variabilitydesigner.utils.uml;

import org.modelio.module.variabilitydesigner.utils.walkers.IWalkable;
import org.modelio.vcore.smkernel.mapi.MObject;

public abstract class IUMLElement implements IWalkable {
    private MObject _element;

    public IUMLElement(MObject element) {
        _element = element;
    }

    public MObject getElement() {
        return _element;
    }

}
