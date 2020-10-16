package org.modelio.module.variabilitydesigner.utils.specialcollections;

import java.util.Comparator;
import org.modelio.vcore.smkernel.mapi.MObject;

public class MObjectNameComparator implements Comparator<MObject> {
    @Override
    public int compare(MObject o1, MObject o2) {
        int res = o1.getName().compareTo(o2.getName());
        if(res == 0) {
            res = o1.getCompositionOwner().getName().compareTo(o2.getCompositionOwner().getName());
            if(res == 0) {
                if(o1.getClass().isInstance(o2)) {
                    return 0;
                } else {
                    return 1;
                }
            }
        }
        return res;
    }

}
