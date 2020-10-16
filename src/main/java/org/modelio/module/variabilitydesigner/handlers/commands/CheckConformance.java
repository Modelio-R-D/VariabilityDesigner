package org.modelio.module.variabilitydesigner.handlers.commands;

import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.swt.widgets.Display;
import org.modelio.api.module.IModule;
import org.modelio.api.module.command.DefaultModuleCommandHandler;
import org.modelio.api.module.context.IModuleContext;
import org.modelio.vcore.smkernel.mapi.MObject;

@objid ("99e23c9d-347d-4792-b1b1-677b8a753934")
public class CheckConformance extends DefaultModuleCommandHandler {
    @objid ("ebd28d2d-bd6c-49cc-bf86-69e3dec50fa4")
    @Override
    public void actionPerformed(final List<MObject> selectedElements, final IModule module) {
        // Module context is the link to many Modelio services
        IModuleContext ctx = module.getModuleContext();
        
        // TODO replace the following dumb code by the real implementation of the command
        MessageDialog.openInformation(Display.getDefault().getActiveShell(), "check", "Command not implemented!");
    }

    @objid ("7df0a4cf-6d24-4c3e-bd76-c34db3915e47")
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
