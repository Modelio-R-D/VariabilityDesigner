package org.modelio.module.variabilitydesigner.utils.walkers;

import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("d98bda49-2d80-43cb-a58c-f766eefb4aa6")
public interface IWalkable {
    @objid ("10bf2011-a77e-4f3a-b61e-1df0c9edf58d")
    IWalkable getParent();

    @objid ("d202d41b-7131-497f-80c2-7de212f4ce0c")
    List<? extends IWalkable> getChildren();

}
