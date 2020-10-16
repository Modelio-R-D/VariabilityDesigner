package org.modelio.module.variabilitydesigner.utils.walkers;

import java.util.Collection;
import java.util.Deque;
import java.util.LinkedList;

public class Walker<T extends IWalkable> {
    private IProcess<T> _process;

    public void setProcess(IProcess<T> process) {
        _process = process;
    }

    /**
     * This is the default walking method, which call a specific way of browsing the model according to the Strategy defined in the process
     * Default Strategy is a depth first
     * 
     * @param element Walkable element to explore
     */
    public void walk(T element) {
        WalkingStrategy way = _process.getWalkingStrategy();
        switch (way) {
        case REVERSEDEPTH:
            reverseDepthWalk(element);
            break;
        case BREADTH:
            breadthWalk(element);
            break;
        case DEPTH:
        default:
            depthWalk(element);
            break;
        }
    }

    /**
     * This method should be used only if you want to force the depth first search
     * 
     * @param element Walkable element to explore
     */
    @SuppressWarnings("unchecked")
    public void depthWalk(T element) {
        _process.process(element);
        for (IWalkable child : element.getChildren()) {
            depthWalk((T) child);
        }
    }

    /**
     * This method should be used only if you want to force the breadth first search
     * 
     * @param element Walkable element to explore
     */
    @SuppressWarnings("unchecked")
    public void breadthWalk(T element) {
        Deque<T> queue = new LinkedList<>();
        queue.add(element);
        
        while (!queue.isEmpty()) {
            T current = queue.poll();
            queue.addAll((Collection<? extends T>) current.getChildren());
            _process.process(current);
        }
    }

    /**
     * This method should be used only if you want to force the reverse depth first search
     * 
     * @param element Walkable element to explore
     */
    @SuppressWarnings("unchecked")
    public void reverseDepthWalk(T element) {
        for (IWalkable child : element.getChildren()) {
            reverseDepthWalk((T) child);
        }
        _process.process(element);
    }

}
