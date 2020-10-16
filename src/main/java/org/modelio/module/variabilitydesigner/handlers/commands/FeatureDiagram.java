package org.modelio.module.variabilitydesigner.handlers.commands;

import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.api.module.IModule;
import org.modelio.api.module.command.standard.DiagramCreationStandardHandler;
import org.modelio.metamodel.diagrams.AbstractDiagram;
import org.modelio.module.variabilitydesigner.i18n.Messages;
import org.modelio.module.variabilitydesigner.impl.VariabilityDesignerModule;
import org.modelio.vcore.smkernel.mapi.MObject;

@objid ("5e8e574c-9c4a-4801-a429-d0e244b79378")
public class FeatureDiagram extends DiagramCreationStandardHandler {
    @objid ("1d67c7ce-9ad2-44e6-8c8a-2fe893ecb72f")
    @Override
    public boolean accept(final List<MObject> selectedElements, final IModule module) {
        if (super.accept(selectedElements, module) == false) {
            return false;
        }
        return true;
    }

    @objid ("11785627-1d84-44fe-a3a5-9754871ac211")
    @Override
    protected void postConfigureElement(final MObject newDiagram, final IModule module) {
        super.postConfigureElement(newDiagram, module);
        
        if (newDiagram instanceof AbstractDiagram) {
            AbstractDiagram diagram = (AbstractDiagram) newDiagram;
        
            VariabilityDesignerModule.getInstance().getModuleContext().getModelioServices().getEditionService().openEditor(diagram);
        
            newDiagram.setName(Messages.getString("FeatureDiagram", diagram.getCompositionOwner().getName()));
        }
    }

}
