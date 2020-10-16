package org.modelio.module.variabilitydesigner.handlers.commands;

import java.util.List;
import org.modelio.api.module.IModule;
import org.modelio.api.module.command.standard.DiagramCreationStandardHandler;
import org.modelio.metamodel.diagrams.AbstractDiagram;
import org.modelio.module.variabilitydesigner.i18n.Messages;
import org.modelio.module.variabilitydesigner.impl.VariabilityDesignerModule;
import org.modelio.vcore.smkernel.mapi.MObject;

public class FeatureDiagram extends DiagramCreationStandardHandler {
    @Override
    public boolean accept(final List<MObject> selectedElements, final IModule module) {
        if (super.accept(selectedElements, module) == false) {
            return false;
        }
        return true;
    }

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
