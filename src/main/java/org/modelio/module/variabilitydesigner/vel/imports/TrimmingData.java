package org.modelio.module.variabilitydesigner.vel.imports;

import java.util.Set;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.module.variabilitydesigner.utils.specialcollections.SpecialSet;
import org.modelio.vcore.smkernel.mapi.MObject;

@objid ("7a5b62d4-d966-4049-a068-e0540635e949")
public class TrimmingData {
    @objid ("5224d94a-335d-4aa8-8024-86a00b551fe1")
    private Set<MObject> _elementsToKeep = new SpecialSet();

//    @objid ("adf7f1e4-8d32-4eb0-b365-13053e84fcae")
//    private Map<MObject, Collection<MAttributeValue>> _parameterToSet = new HashMap();
    @objid ("9a6bd932-8d17-4faa-8ed0-b18dc72f0d8e")
    public Set<MObject> getElementsToKeep() {
        return this._elementsToKeep;
    }

    @objid ("49ec0928-a655-40bc-b4bf-c54c64cffca1")
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
