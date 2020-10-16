package org.modelio.module.variabilitydesigner.utils.walkers;

import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("c5d5bc64-6089-43a0-b32d-1be4f99a6205")
public interface IProcess<T extends IWalkable> {
    @objid ("73d136be-bc74-4ec8-85e5-6c5c3410a601")
    void process(T element);

    @objid ("3cd14378-2375-417c-8c27-ffdc583cd381")
    default WalkingStrategy getWalkingStrategy() {
        return WalkingStrategy.DEPTH;
    }

}
