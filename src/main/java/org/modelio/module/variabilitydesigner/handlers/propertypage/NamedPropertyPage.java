package org.modelio.module.variabilitydesigner.handlers.propertypage;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.api.module.propertiesPage.IModulePropertyTable;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.module.variabilitydesigner.i18n.Messages;

@objid ("7951d59f-66f5-4acd-85c0-befe590a7fe4")
public class NamedPropertyPage implements IPropertyContent {
    @objid ("d8606ede-ab61-4971-9a72-8db3c613e343")
    @Override
    public int changeProperty(ModelElement element, int row, String value) {
        if(row==1) {
            element.setName(value);
        }
        return 1;
    }

    @objid ("bec412f8-a840-439f-93e1-3fd0b1cee6ba")
    @Override
    public void update(ModelElement element, IModulePropertyTable table) {
        /*
         *  add  Name (row = 1)
         */
        table.addProperty(Messages.getString("Ui.Property.Name.Label"), element.getName());
    }

}
