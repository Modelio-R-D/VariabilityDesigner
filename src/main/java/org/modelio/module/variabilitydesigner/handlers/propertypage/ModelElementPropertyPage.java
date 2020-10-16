package org.modelio.module.variabilitydesigner.handlers.propertypage;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.api.module.propertiesPage.IModulePropertyTable;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.module.variabilitydesigner.i18n.Messages;

@objid ("3b94114e-3414-4485-b142-c50a071370fc")
public class ModelElementPropertyPage implements IPropertyContent {
    @objid ("f8edfea4-8afa-4ddc-b3e1-6c5030db4814")
    @Override
    public int changeProperty(ModelElement element, int row, String value) {
        if(row==1) {
            element.setName(value);
        }
        return 1;
    }

    @objid ("d884ee57-22d6-4ee1-b0e1-ad619fc9a981")
    @Override
    public void update(ModelElement element, IModulePropertyTable table) {
        /*
         *  add  Name (row = 1)
         */
        table.addProperty(Messages.getString("Ui.Property.Name.Label"), element.getName());
    }

}
