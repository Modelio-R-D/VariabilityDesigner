package org.modelio.module.variabilitydesigner.utils.uml;

import java.util.ArrayList;
import java.util.List;
import org.modelio.vcore.smkernel.mapi.MObject;

public class CompositionUMLElement extends IUMLElement {
    public CompositionUMLElement(MObject element) {
        super(element);
    }

    @Override
    public CompositionUMLElement getParent() {
        return new CompositionUMLElement(getElement().getCompositionOwner());
    }

    @Override
    public List<CompositionUMLElement> getChildren() {
        List<CompositionUMLElement> res = new ArrayList<>();
        for(MObject child : getElement().getCompositionChildren()) {
            res.add(new CompositionUMLElement(child));
        }
        return res;
    }

}
