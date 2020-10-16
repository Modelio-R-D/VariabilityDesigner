package org.modelio.module.variabilitydesigner.handlers.commands;

import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.swt.widgets.Display;
import org.modelio.api.module.IModule;
import org.modelio.api.module.command.DefaultModuleCommandHandler;
import org.modelio.api.module.context.IModuleContext;
import org.modelio.vcore.smkernel.mapi.MObject;

@objid ("29d178dd-ff53-4e53-b341-d0d5a51e016e")
public class GenerateVEL extends DefaultModuleCommandHandler {
    @objid ("d91e8a59-0b88-4f39-9e51-a0f2fa14fa17")
    @Override
    public void actionPerformed(final List<MObject> selectedElements, final IModule module) {
        // Module context is the link to many Modelio services
        IModuleContext ctx = module.getModuleContext();
        
        // TODO replace the following dumb code by the real implementation of the command
        MessageDialog.openInformation(Display.getDefault().getActiveShell(), "GenerateVEL", "Command not implemented!");
    }

    @objid ("6d017190-450f-4e7e-9589-36d9fe9257e2")
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
