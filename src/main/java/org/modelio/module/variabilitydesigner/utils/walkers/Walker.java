package org.modelio.module.variabilitydesigner.utils.walkers;

import java.util.Collection;
import java.util.Deque;
import java.util.LinkedList;
import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("2c898896-5418-40c9-832f-aa6b7d40a815")
public class Walker<T extends IWalkable> {
    @objid ("12dc7435-1ddf-4d94-88ff-2b198c8eb88b")
    private IProcess<T> _process;

    @objid ("b6ddf94a-dbbe-4b20-b92c-c09d413fa912")
    public void setProcess(IProcess<T> process) {
        _process = process;
    }

    /**
     * This is the default walking method, which call a specific way of browsing the model according to the Strategy defined in the process
     * Default Strategy is a depth first
     * 
     * @param element Walkable element to explore
     */
    @objid ("8289ec1b-097f-494c-aa24-07e7419b5353")
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
    @objid ("8adbcce5-7066-40df-a176-c3fe7ba99fa8")
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
    @objid ("1b1436a4-bda1-4de0-9aa6-b66609c41b88")
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
    @objid ("0d0be713-7e5f-43ae-8e0a-d9c927daa622")
    @SuppressWarnings("unchecked")
    public void reverseDepthWalk(T element) {
        for (IWalkable child : element.getChildren()) {
            reverseDepthWalk((T) child);
        }
        _process.process(element);
    }

}
