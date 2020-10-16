package org.modelio.module.variabilitydesigner.handlers.propertypage;

import java.util.List;
import org.modelio.api.module.IModule;
import org.modelio.api.module.propertiesPage.AbstractModulePropertyPage;
import org.modelio.api.module.propertiesPage.IModulePropertyTable;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * @author kchaabouni
 */
public class VariabilityPropertyPage extends AbstractModulePropertyPage {
    public VariabilityPropertyPage(IModule module, String name, String label, String bitmap) {
        super(module, name, label, bitmap);
    }

    @Override
    public void changeProperty(List<MObject> selectedElements, int row, String value) {
        if ((selectedElements != null) && (selectedElements.size() > 0) && (selectedElements.get(0) instanceof ModelElement)){
            
            ModelElement element = ((ModelElement) selectedElements.get (0));
        
            VariabilityPropertyManager variabilityPage = new VariabilityPropertyManager();
            variabilityPage.changeProperty(element, row, value);
            
        }
    }

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
