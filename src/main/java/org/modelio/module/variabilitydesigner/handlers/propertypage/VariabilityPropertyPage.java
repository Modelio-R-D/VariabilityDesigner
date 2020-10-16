package org.modelio.module.variabilitydesigner.handlers.propertypage;

import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.api.module.IModule;
import org.modelio.api.module.propertiesPage.AbstractModulePropertyPage;
import org.modelio.api.module.propertiesPage.IModulePropertyTable;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * @author kchaabouni
 */
@objid ("d73af64a-0b9a-4430-adf8-3545cd8709d1")
public class VariabilityPropertyPage extends AbstractModulePropertyPage {
    @objid ("25d90fc8-495f-4e38-bad4-539a3cae53df")
    public VariabilityPropertyPage(IModule module, String name, String label, String bitmap) {
        super(module, name, label, bitmap);
    }

    @objid ("031bd44d-be96-4fec-8b04-916634c3621c")
    @Override
    public void changeProperty(List<MObject> selectedElements, int row, String value) {
        if ((selectedElements != null) && (selectedElements.size() > 0) && (selectedElements.get(0) instanceof ModelElement)){
            
            ModelElement element = ((ModelElement) selectedElements.get (0));
        
            VariabilityPropertyManager variabilityPage = new VariabilityPropertyManager();
            variabilityPage.changeProperty(element, row, value);
            
        }
    }

    @objid ("19815ef7-f4f7-4fa6-bfe7-98fdcc2debb9")
    @Override
    public void update(List<MObject> selectedElements, IModulePropertyTable table) {
        if ((selectedElements != null) && (selectedElements.size() > 0)
                && (selectedElements.get(0) != null)
                && (selectedElements.get(0) instanceof ModelElement)){
        
            ModelElement element = ((ModelElement) selectedElements.get(0));
            
            VariabilityPropertyManager variabilityPage = new VariabilityPropertyManager();
            variabilityPage.update(element, table);
        
        }
    }

}
