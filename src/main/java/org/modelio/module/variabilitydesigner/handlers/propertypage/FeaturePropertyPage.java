package org.modelio.module.variabilitydesigner.handlers.propertypage;

import java.util.ArrayList;
import java.util.List;
import org.modelio.api.module.propertiesPage.IModulePropertyTable;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.module.variabilitydesigner.api.IVariabilityDesignerPeerModule;
import org.modelio.module.variabilitydesigner.api.feature.standard.class_.AlternativeFeature;
import org.modelio.module.variabilitydesigner.api.feature.standard.class_.MandatoryFeature;
import org.modelio.module.variabilitydesigner.api.feature.standard.class_.OptionalFeature;
import org.modelio.module.variabilitydesigner.api.feature.standard.class_.OrFeature;
import org.modelio.module.variabilitydesigner.i18n.Messages;

public class FeaturePropertyPage implements IPropertyContent {
    private static List<String> sterNames = new ArrayList<>();

    @Override
    public int changeProperty(ModelElement element, int row, String value) {
        if(row==1) {
        
            /*
             * Remove old variation stereotypes
             */
            for(String stereotypeName : sterNames) {
                element.removeStereotypes(IVariabilityDesignerPeerModule.MODULE_NAME, stereotypeName);
            }
        
            /*
             * Add new selected variation stereotype
             */
            element.addStereotype(IVariabilityDesignerPeerModule.MODULE_NAME, value);
        }
        return 1;
    }

    @Override
    public void update(ModelElement element, IModulePropertyTable table) {
        /*
         *  add Constraint Type (row = 1)
         */
        String currentConstraintType = "";
        
        
        if(element.isStereotyped(IVariabilityDesignerPeerModule.MODULE_NAME, MandatoryFeature.STEREOTYPE_NAME)) {
            currentConstraintType = MandatoryFeature.STEREOTYPE_NAME;
        } else if(element.isStereotyped(IVariabilityDesignerPeerModule.MODULE_NAME, OptionalFeature.STEREOTYPE_NAME)) {
            currentConstraintType = OptionalFeature.STEREOTYPE_NAME;
        } else if(element.isStereotyped(IVariabilityDesignerPeerModule.MODULE_NAME, AlternativeFeature.STEREOTYPE_NAME)) {
            currentConstraintType = AlternativeFeature.STEREOTYPE_NAME;
        } else if(element.isStereotyped(IVariabilityDesignerPeerModule.MODULE_NAME, OrFeature.STEREOTYPE_NAME)) {
            currentConstraintType = OrFeature.STEREOTYPE_NAME;
        }
        
        String[] values = new String[sterNames.size()];
        table.addProperty(Messages.getString("Ui.Property.VariationType.Label"), currentConstraintType, sterNames.toArray(values));
    }


static {
        sterNames.add(MandatoryFeature.STEREOTYPE_NAME);
        sterNames.add(OptionalFeature.STEREOTYPE_NAME);
        sterNames.add(AlternativeFeature.STEREOTYPE_NAME);
        sterNames.add(OrFeature.STEREOTYPE_NAME);
    }
}
