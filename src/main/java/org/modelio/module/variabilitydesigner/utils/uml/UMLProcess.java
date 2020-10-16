package org.modelio.module.variabilitydesigner.utils.uml;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.module.variabilitydesigner.utils.walkers.IProcess;
import org.modelio.vcore.smkernel.mapi.MObject;

@objid ("9bc0b2cb-ccae-45f2-bc04-5f13a82ae10b")
public abstract class UMLProcess implements IProcess<IUMLElement> {
    @objid ("6798290c-d216-4848-a4cd-a2cfd16cb6ce")
    @Override
    public final void process(IUMLElement element) {
        process(element.getElement());
    }

    @objid ("84de187e-ab15-4e72-9975-82a6b0a24458")
    public abstract void process(MObject element);

}
