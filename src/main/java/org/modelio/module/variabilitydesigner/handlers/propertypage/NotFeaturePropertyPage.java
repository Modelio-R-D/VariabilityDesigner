package org.modelio.module.variabilitydesigner.handlers.propertypage;

import java.util.ArrayList;
import java.util.List;
import org.modelio.api.module.propertiesPage.IModulePropertyTable;
import org.modelio.metamodel.uml.infrastructure.Dependency;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.module.variabilitydesigner.api.IVariabilityDesignerPeerModule;
import org.modelio.module.variabilitydesigner.api.feature.standard.class_.AlternativeFeature;
import org.modelio.module.variabilitydesigner.api.feature.standard.class_.MandatoryFeature;
import org.modelio.module.variabilitydesigner.api.feature.standard.class_.OptionalFeature;
import org.modelio.module.variabilitydesigner.api.feature.standard.class_.OrFeature;
import org.modelio.module.variabilitydesigner.i18n.Messages;
import org.modelio.module.variabilitydesigner.impl.VariabilityDesignerModule;

public class NotFeaturePropertyPage implements IPropertyContent {
    private static List<String> names = new ArrayList<>();

    private static List<org.modelio.metamodel.uml.statik.Class> features = new ArrayList<>();

    @Override
    public int changeProperty(ModelElement element, int row, String value) {
        if(row == 1) {
        
            /*
             * Add new selected variation stereotype
             */
            for(org.modelio.metamodel.uml.statik.Class feature : features) {
                if (feature.getName().equals(value)) {
                    Dependency dep =  element.getDependsOnDependency().get(0);
                    dep.setDependsOn(feature);
                }
            }
        }
        return 1;
    }

    @Override
    public void update(ModelElement element, IModulePropertyTable table) {
        /*
         *  add Constraint Type (row = 1)
         */
        String currentFeature = "";
        
        for (Dependency dep : element.getDependsOnDependency()) {
            currentFeature = dep.getDependsOn().getName();
        }
        
        String[] values = new String[features.size()];
        
        table.addProperty(Messages.getString("Ui.Property.RelatedFeature.Label"), currentFeature, names.toArray(values));
    }


static {

        for(org.modelio.metamodel.uml.statik.Class classe : VariabilityDesignerModule.getInstance().getModuleContext().getModelingSession().findByClass(org.modelio.metamodel.uml.statik.Class.class)) {
            if (classe.isStereotyped(IVariabilityDesignerPeerModule.MODULE_NAME, OrFeature.STEREOTYPE_NAME)
                    || (classe.isStereotyped(IVariabilityDesignerPeerModule.MODULE_NAME, MandatoryFeature.STEREOTYPE_NAME))
                    || (classe.isStereotyped(IVariabilityDesignerPeerModule.MODULE_NAME, OptionalFeature.STEREOTYPE_NAME))
                    || (classe.isStereotyped(IVariabilityDesignerPeerModule.MODULE_NAME, AlternativeFeature.STEREOTYPE_NAME))) {
                features.add(classe);
            }
        }

        for (org.modelio.metamodel.uml.statik.Class feature : features) {
            names.add(feature.getName());
        }

        java.util.Collections.sort(names);
    }
}
