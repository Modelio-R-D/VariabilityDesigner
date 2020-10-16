package org.modelio.module.variabilitydesigner.utils.specialcollections;

import java.util.Comparator;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.vcore.smkernel.mapi.MObject;

@objid ("0c743ada-3dbb-4ef3-959a-1335d19367ee")
public class MObjectNameComparator implements Comparator<MObject> {
    @objid ("5062f907-a967-44a6-b828-b9143a8c217f")
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
