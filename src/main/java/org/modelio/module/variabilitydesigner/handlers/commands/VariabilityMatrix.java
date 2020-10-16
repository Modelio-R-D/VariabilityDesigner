package org.modelio.module.variabilitydesigner.handlers.commands;

import java.util.List;
import org.modelio.api.modelio.model.IModelingSession;
import org.modelio.api.modelio.model.ITransaction;
import org.modelio.api.module.IModule;
import org.modelio.api.module.command.DefaultModuleCommandHandler;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.metamodel.uml.infrastructure.matrix.MatrixDefinition;
import org.modelio.module.variabilitydesigner.api.feature.infrastructure.matrixdefinition.VariantDefinition;
import org.modelio.module.variabilitydesigner.impl.VariabilityDesignerPeerModule;
import org.modelio.vcore.smkernel.mapi.MObject;

public class VariabilityMatrix extends DefaultModuleCommandHandler {
    @Override
    public void actionPerformed(final List<MObject> selectedElements, final IModule module) {
        ModelElement selected = (ModelElement) selectedElements.get(0);
        IModelingSession modelingSession = module.getModuleContext().getModelingSession();
        
        try (ITransaction t = modelingSession.createTransaction("Create variability matrix")) {
        
            createMatrix(selected, modelingSession);
            t.commit();
        }
    }

    @Override
    public boolean accept(final List<MObject> selectedElements, final IModule module) {
        if (super.accept(selectedElements, module) == false) {
            return false;
        }
        return true;
    }

    public MatrixDefinition createMatrix(final ModelElement selected, final IModelingSession modelingSession) {
        MatrixDefinition matrix = modelingSession.getModel().createMatrixDefinition();
        matrix.setName("Variability Matrix ");
        matrix.addStereotype(VariabilityDesignerPeerModule.MODULE_NAME, VariantDefinition.STEREOTYPE_NAME);
        matrix.setOwner(selected);
        
        // Use a standard query for lines
        //
        //        QueryDefinition lineQuery = modelingSession.getModel().createQueryDefinition(IVariabilityDesignerPeerModule.MODULE_NAME, SourceAllocationQuery.class.getName());
        //        lineQuery.setUsingAdditions(true);
        //        matrix.setLinesDefinition(lineQuery);
        //
        //        // Use a custom query for columns
        //        QueryDefinition targetQuery = modelingSession.getModel().createQueryDefinition(IVariabilityDesignerPeerModule.MODULE_NAME, TargetAllocationQuery.class.getName());
        //        targetQuery.setUsingAdditions(true);
        //        matrix.setColumnsDefinition(targetQuery);
        //
        //        // Use a standard value definition
        //        MatrixValueDefinition valueDefinition = modelingSession.getModel().createMatrixValueDefinition(IVariabilityDesignerPeerModule.MODULE_NAME, LinkAsImageReadOnlyContextAccessor.class.getName());
        //        matrix.setValuesDefinition(valueDefinition);
        return matrix;
    }

}
