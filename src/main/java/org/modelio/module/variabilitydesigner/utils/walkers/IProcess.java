package org.modelio.module.variabilitydesigner.utils.walkers;


public interface IProcess<T extends IWalkable> {
    void process(T element);

    default WalkingStrategy getWalkingStrategy() {
        return WalkingStrategy.DEPTH;
    }

}
