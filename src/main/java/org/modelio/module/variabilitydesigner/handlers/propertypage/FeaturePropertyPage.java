package org.modelio.module.variabilitydesigner.handlers.propertypage;

import java.util.ArrayList;
import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.api.module.propertiesPage.IModulePropertyTable;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.module.variabilitydesigner.api.IVariabilityDesignerPeerModule;
import org.modelio.module.variabilitydesigner.api.feature.standard.class_.AlternativeFeature;
import org.modelio.module.variabilitydesigner.api.feature.standard.class_.MandatoryFeature;
import org.modelio.module.variabilitydesigner.api.feature.standard.class_.OptionalFeature;
import org.modelio.module.variabilitydesigner.api.feature.standard.class_.OrFeature;
import org.modelio.module.variabilitydesigner.i18n.Messages;

@objid ("20b8dec4-57bd-4517-92a3-d962e9288d36")
public class FeaturePropertyPage implements IPropertyContent {
    @objid ("5212e8aa-9232-42a3-83cb-26725f727f35")
    private static List<String> sterNames = new ArrayList<>();

    @objid ("7fb70a7a-f56f-4b6d-a58b-d949005707ed")
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

    @objid ("302ddc9f-64e9-49af-9c07-e779c8118e7f")
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
