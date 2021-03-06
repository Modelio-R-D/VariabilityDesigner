package org.modelio.module.variabilitydesigner.handlers.commands;

import java.io.File;
import java.util.List;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.FileDialog;
import org.modelio.api.module.IModule;
import org.modelio.api.module.command.DefaultModuleCommandHandler;
import org.modelio.metamodel.uml.statik.Package;
import org.modelio.module.variabilitydesigner.variabilitymodel.VariabilityExchangeModelsType;
import org.modelio.module.variabilitydesigner.vel.generation.VariabilityModelGenerator;
import org.modelio.vcore.smkernel.mapi.MObject;

public class GenerateVELVariant extends DefaultModuleCommandHandler {
    @Override
    public void actionPerformed(final List<MObject> selectedElements, final IModule module) {
        VariabilityModelGenerator generator = new VariabilityModelGenerator();
        
        FileDialog dialog = new FileDialog(Display.getDefault().getActiveShell(), SWT.SAVE);
        dialog.setText("Export VEL description");
        String[] extensions = {"*.xml"};
        dialog.setFilterExtensions(extensions);
        File file = null;
        
        if(dialog.open() != null) {
            file = new File(dialog.getFilterPath() + File.separatorChar + dialog.getFileName());
        }
        
        if(file != null) {
            JAXBElement<VariabilityExchangeModelsType> model = generator.generate((Package) selectedElements.get(0));
        
            try {
                JAXBContext context = JAXBContext.newInstance(VariabilityExchangeModelsType.class);
                Marshaller m = context.createMarshaller();
                m.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
                m.setProperty(Marshaller.JAXB_ENCODING, "UTF-8");
                m.marshal(model, file);
            } catch (JAXBException e) {
                e.printStackTrace();
            }
        }
    }

    @Override
    public boolean accept(final List<MObject> selectedElements, final IModule module) {
        // Generated call to the super method will check the scope conditions defined in Studio.
        // DO NOT REMOVE this call unless you need to take full control on the checks to be carried out.
        // However you can safely extends the checked conditions by adding custom code.
        if (super.accept(selectedElements, module) == false) {
            return false;
        }
        return true;
    }

}
