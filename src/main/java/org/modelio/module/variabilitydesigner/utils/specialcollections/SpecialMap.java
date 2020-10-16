package org.modelio.module.variabilitydesigner.utils.specialcollections;

import java.util.Collection;
import java.util.TreeMap;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.module.variabilitydesigner.vel.imports.MAttributeValue;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * This Map is used to retrieve an element with an MObject.
 * Matching MObject don't have to be exactly the same with same UUID but have to match condition specified in MObjectNameComparator
 * @author abeaufays
 */
@objid ("e9c185ed-35b0-4d17-8b0b-fd4bd3748ef0")
public class SpecialMap extends TreeMap<MObject,Collection<MAttributeValue>> {
    @objid ("f39a2b1d-5d3d-463d-8dfb-f5b584165b4c")
    public SpecialMap() {
        super(new MObjectNameComparator());
    }

}
