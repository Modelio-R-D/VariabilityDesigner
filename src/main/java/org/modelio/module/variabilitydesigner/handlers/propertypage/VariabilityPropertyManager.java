package org.modelio.module.variabilitydesigner.handlers.propertypage;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.api.module.propertiesPage.IModulePropertyTable;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.module.variabilitydesigner.api.IVariabilityDesignerPeerModule;
import org.modelio.module.variabilitydesigner.api.feature.standard.class_.AlternativeFeature;
import org.modelio.module.variabilitydesigner.api.feature.standard.class_.MandatoryFeature;
import org.modelio.module.variabilitydesigner.api.feature.standard.class_.OptionalFeature;
import org.modelio.module.variabilitydesigner.api.feature.standard.class_.OrFeature;

@objid ("8ab9d56a-71e9-43ee-9132-3b1b8ec19f6e")
public class VariabilityPropertyManager {
    /**
     * @return
     */
    @objid ("11c24b45-4ec7-4fd0-9961-42437d07d722")
    public int changeProperty(ModelElement element, int row, String value) {
        IPropertyContent propertyPage = null;
        
        int currentRow = row;
        
        propertyPage = new ModelElementPropertyPage();
        currentRow -= propertyPage.changeProperty(element, currentRow, value);
        
        if(isFeature(element)) {
            propertyPage = new FeaturePropertyPage();
            currentRow -= propertyPage.changeProperty(element, currentRow, value);
        }else {
            propertyPage = new NotFeaturePropertyPage();
            currentRow -= propertyPage.changeProperty(element, currentRow, value);
        }
        return currentRow;
    }

    @objid ("0300d54d-0cc2-44e1-bfce-c96275ee0b8c")
    public void update(ModelElement element, IModulePropertyTable table) {
        IPropertyContent propertyPage = null;
        
        propertyPage = new ModelElementPropertyPage();
        propertyPage.update(element, table);
        
        if(isFeature(element)) {
            propertyPage = new FeaturePropertyPage();
            propertyPage.update(element, table);
        }else {
            propertyPage = new NotFeaturePropertyPage();
            propertyPage.update(element, table);
        }
    }

    @objid ("229cb906-561d-4f08-890d-8023afa4dbc7")
    private boolean isFeature(ModelElement element) {
        return (element.isStereotyped(IVariabilityDesignerPeerModule.MODULE_NAME, MandatoryFeature.STEREOTYPE_NAME))
                || (element.isStereotyped(IVariabilityDesignerPeerModule.MODULE_NAME, OptionalFeature.STEREOTYPE_NAME))
                || (element.isStereotyped(IVariabilityDesignerPeerModule.MODULE_NAME, OrFeature.STEREOTYPE_NAME))
                ||(element.isStereotyped(IVariabilityDesignerPeerModule.MODULE_NAME, AlternativeFeature.STEREOTYPE_NAME));
    }

}
