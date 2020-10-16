package org.modelio.module.variabilitydesigner.vel.imports;

import java.util.Set;
import org.modelio.module.variabilitydesigner.utils.specialcollections.SpecialSet;
import org.modelio.vcore.smkernel.mapi.MObject;

public class TrimmingData {
    private Set<MObject> _elementsToKeep = new SpecialSet();

//    @objid ("adf7f1e4-8d32-4eb0-b365-13053e84fcae")
//    private Map<MObject, Collection<MAttributeValue>> _parameterToSet = new HashMap();
    public Set<MObject> getElementsToKeep() {
        return this._elementsToKeep;
    }

    public void setElementsToKeep(Set<MObject> elementsToKeep) {
        this._elementsToKeep = elementsToKeep;
    }


//    @objid ("274aca90-547d-46fa-a46c-26da6227d4e3")
//    public Map<MObject, Collection<MAttributeValue>> getParameterToSet() {
//        return _parameterToSet;
//    }
//
//    @objid ("08d92034-24e0-430f-90dc-974163bb6ab3")
//    public void setParameterToSet(Map<MObject, Collection<MAttributeValue>> parameterToSet) {
//        _parameterToSet = parameterToSet;
//    }
}
