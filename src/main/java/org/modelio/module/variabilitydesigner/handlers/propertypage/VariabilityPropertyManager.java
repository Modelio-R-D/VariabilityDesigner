package org.modelio.module.variabilitydesigner.handlers.propertypage;

import org.modelio.api.module.propertiesPage.IModulePropertyTable;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.module.variabilitydesigner.api.IVariabilityDesignerPeerModule;
import org.modelio.module.variabilitydesigner.api.feature.standard.class_.AlternativeFeature;
import org.modelio.module.variabilitydesigner.api.feature.standard.class_.MandatoryFeature;
import org.modelio.module.variabilitydesigner.api.feature.standard.class_.OptionalFeature;
import org.modelio.module.variabilitydesigner.api.feature.standard.class_.OrFeature;

public class VariabilityPropertyManager {
    /**
     * @return
     */
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

    private boolean isFeature(ModelElement element) {
        return (element.isStereotyped(IVariabilityDesignerPeerModule.MODULE_NAME, MandatoryFeature.STEREOTYPE_NAME))
                || (element.isStereotyped(IVariabilityDesignerPeerModule.MODULE_NAME, OptionalFeature.STEREOTYPE_NAME))
                || (element.isStereotyped(IVariabilityDesignerPeerModule.MODULE_NAME, OrFeature.STEREOTYPE_NAME))
                ||(element.isStereotyped(IVariabilityDesignerPeerModule.MODULE_NAME, AlternativeFeature.STEREOTYPE_NAME));
    }

}
