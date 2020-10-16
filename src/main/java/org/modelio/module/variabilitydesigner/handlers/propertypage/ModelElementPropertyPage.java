package org.modelio.module.variabilitydesigner.handlers.propertypage;

import org.modelio.api.module.propertiesPage.IModulePropertyTable;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.module.variabilitydesigner.i18n.Messages;

public class ModelElementPropertyPage implements IPropertyContent {
    @Override
    public int changeProperty(ModelElement element, int row, String value) {
        if(row==1) {
            element.setName(value);
        }
        return 1;
    }

    @Override
    public void update(ModelElement element, IModulePropertyTable table) {
        /*
         *  add  Name (row = 1)
         */
        table.addProperty(Messages.getString("Ui.Property.Name.Label"), element.getName());
    }

}
