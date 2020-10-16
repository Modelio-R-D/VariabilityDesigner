package org.modelio.module.variabilitydesigner.utils.uml;

import java.util.ArrayList;
import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.vcore.smkernel.mapi.MObject;

@objid ("5a59ac6c-7767-4454-a594-c6251469f838")
public class CompositionUMLElement extends IUMLElement {
    @objid ("35383b26-e9b7-4db3-a1b8-ab40d485becc")
    public CompositionUMLElement(MObject element) {
        super(element);
    }

    @objid ("15b15fe4-a27a-4c87-92c1-f02f5d80dbb1")
    @Override
    public CompositionUMLElement getParent() {
        return new CompositionUMLElement(getElement().getCompositionOwner());
    }

    @objid ("07ee4428-a94a-480e-8523-a0009f5c5570")
    @Override
    public List<CompositionUMLElement> getChildren() {
        List<CompositionUMLElement> res = new ArrayList<>();
        for(MObject child : getElement().getCompositionChildren()) {
            res.add(new CompositionUMLElement(child));
        }
        return res;
    }

}
