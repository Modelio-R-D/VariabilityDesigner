package org.modelio.module.variabilitydesigner.handlers.commands;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.FileDialog;
import org.modelio.api.module.IModule;
import org.modelio.api.module.command.DefaultModuleCommandHandler;
import org.modelio.api.module.context.IModuleContext;
import org.modelio.metamodel.uml.statik.Package;
import org.modelio.module.variabilitydesigner.variabilitymodel.VariabilityExchangeModelsType;
import org.modelio.module.variabilitydesigner.vel.imports.ImportVELConfiguration;
import org.modelio.module.variabilitydesigner.vel.imports.TrimmingData;
import org.modelio.module.variabilitydesigner.vel.imports.TrimmingDataGenerator;
import org.modelio.vcore.smkernel.mapi.MObject;

@objid ("7b6d914e-0a1a-4a83-9837-56a8f58bc91a")
public class CreateAVariantCommand extends DefaultModuleCommandHandler {
    @objid ("250ed63e-6f4d-45e0-864e-c30ab533d7ed")
    @Override
    public void actionPerformed(final List<MObject> selectedElements, final IModule module) {
        // Module context is the link to many Modelio services
        IModuleContext ctx = module.getModuleContext();
        
        List<File> files = getFiles();
        for(File file : files) {
            VariabilityExchangeModelsType model = new ImportVELConfiguration().importVelFile(file);
            TrimmingDataGenerator generator = new TrimmingDataGenerator();
            TrimmingData data = generator.generate(model, ctx);
        
            Package pack = (Package)selectedElements.get(0);
        //            new GenerateTrimmedPackage().generate(ctx, data, pack );
        }
    }

    @objid ("896fa075-6622-4796-b0fc-67953c164315")
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

    @objid ("d2cee1fb-b7d1-47fc-9283-14e0b40acf87")
    public List<File> getFiles() {
        ArrayList<File> res = new ArrayList<>();
        FileDialog dialog = new FileDialog(Display.getDefault().getActiveShell(), SWT.MULTI);
        dialog.setText("Select the VEL configuration to create.");
        String[] extension = { "*.xml" };
        dialog.setFilterExtensions(extension);
        if (dialog.open() != null) {
            for (String filename : dialog.getFileNames()) {
                File file = new File(dialog.getFilterPath() + File.separatorChar + filename);
                res.add(file);
            }
        }
        return res;
    }

}
