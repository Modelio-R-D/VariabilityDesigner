package org.modelio.module.variabilitydesigner.handlers.commands;

import java.util.List;
import org.modelio.api.module.IModule;
import org.modelio.api.module.command.DefaultModuleCommandHandler;
import org.modelio.api.module.context.IModuleContext;
import org.modelio.module.variabilitydesigner.vel.imports.GenerateTrimmedPackage;
import org.modelio.module.variabilitydesigner.vel.imports.TrimmingData;
import org.modelio.module.variabilitydesigner.vel.imports.TrimmingDataGenerator;
import org.modelio.vcore.smkernel.mapi.MObject;

public class CreateANewVariantCommand extends DefaultModuleCommandHandler {
    @Override
    public void actionPerformed(final List<MObject> selectedElements, final IModule module) {
        // Module context is the link to many Modelio services
        IModuleContext ctx = module.getModuleContext();
        //        IModelManipulationService modelManipulationService = ctx.getModelioServices().getModelManipulationService();
        //        IModelingSession session = ctx.getModelingSession();
        
        //        List<File> files = getFiles();
        //        for(File file : files) {
        //            VariabilityExchangeModelsType model = new ImportVELConfiguration().importVelFile(file);
        org.modelio.metamodel.uml.statik.Class variant = (org.modelio.metamodel.uml.statik.Class) selectedElements.get(0);
        TrimmingDataGenerator generator = new TrimmingDataGenerator();
        TrimmingData data = generator.generate(ctx, variant);
        
        
        new GenerateTrimmedPackage().generate(ctx, data, variant );
        //        }
    }

    @Override
    public boolean accept(final List<MObject> selectedElements, final IModule module) {
        // Generated call to the super method will check the scope conditions defined in Studio.
        // DO NOT REMOVE this call unless you need to take full control on the checks to be carried out.
        // However you can safely extends the checked conditions by adding custom code.
        if (super.accept(selectedElements, module) == false) {
            return false;
        }
        if( selectedElements.size() != 1 ) {
            return false;
        }
        return true;
    }

}
