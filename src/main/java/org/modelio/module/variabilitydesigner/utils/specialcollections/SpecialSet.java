package org.modelio.module.variabilitydesigner.utils.specialcollections;

import java.util.TreeSet;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * This Set is used to store MObject.
 * Matching MObject don't have to be exactly the same with same UUID but have to match condition specified in MObjectNameComparator
 * @author abeaufays
 */
@objid ("73500699-8bd1-4d53-991d-719d3b78c338")
public class SpecialSet extends TreeSet<MObject> {
    @objid ("f23c1893-b718-47fa-844a-5fdac62364b1")
    public SpecialSet() {
        super(new MObjectNameComparator());
    }

}
