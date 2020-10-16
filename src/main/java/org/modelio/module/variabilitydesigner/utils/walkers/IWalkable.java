package org.modelio.module.variabilitydesigner.utils.walkers;

import java.util.List;

public interface IWalkable {
    IWalkable getParent();

    List<? extends IWalkable> getChildren();

}
