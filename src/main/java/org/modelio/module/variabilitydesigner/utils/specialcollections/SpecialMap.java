package org.modelio.module.variabilitydesigner.utils.specialcollections;

import java.util.Collection;
import java.util.TreeMap;
import org.modelio.module.variabilitydesigner.vel.imports.MAttributeValue;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * This Map is used to retrieve an element with an MObject.
 * Matching MObject don't have to be exactly the same with same UUID but have to match condition specified in MObjectNameComparator
 * @author abeaufays
 */
public class SpecialMap extends TreeMap<MObject,Collection<MAttributeValue>> {
    public SpecialMap() {
        super(new MObjectNameComparator());
    }

}
