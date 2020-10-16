package org.modelio.module.variabilitydesigner.utils.uml;

import org.modelio.module.variabilitydesigner.utils.walkers.IProcess;
import org.modelio.vcore.smkernel.mapi.MObject;

public abstract class UMLProcess implements IProcess<IUMLElement> {
    @Override
    public final void process(IUMLElement element) {
        process(element.getElement());
    }

    public abstract void process(MObject element);

}
