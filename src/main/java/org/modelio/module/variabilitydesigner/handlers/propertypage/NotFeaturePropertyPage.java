package org.modelio.module.variabilitydesigner.handlers.propertypage;

import java.util.ArrayList;
import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
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

@objid ("20180d3f-aea8-40d8-8961-9565cc0c8eca")
public class NotFeaturePropertyPage implements IPropertyContent {
    @objid ("ba4d7b31-b750-43a3-98e7-6b948b943caa")
    private static List<String> names = new ArrayList<>();

    @objid ("5d76f753-d5db-4450-8536-f324489db00a")
    private static List<org.modelio.metamodel.uml.statik.Class> features = new ArrayList<>();

    @objid ("65037746-9182-4d04-8e3f-fa7069a5e77d")
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

    @objid ("269eb13d-6944-4a4a-aae1-abb9b33985b5")
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
