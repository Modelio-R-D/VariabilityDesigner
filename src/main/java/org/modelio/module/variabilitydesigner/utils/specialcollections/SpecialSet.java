package org.modelio.module.variabilitydesigner.utils.specialcollections;

import java.util.TreeSet;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * This Set is used to store MObject.
 * Matching MObject don't have to be exactly the same with same UUID but have to match condition specified in MObjectNameComparator
 * @author abeaufays
 */
public class SpecialSet extends TreeSet<MObject> {
    public SpecialSet() {
        super(new MObjectNameComparator());
    }

}
