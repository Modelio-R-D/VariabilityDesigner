package org.modelio.module.variabilitydesigner.impl;

import java.util.Map;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.api.module.lifecycle.DefaultModuleLifeCycleHandler;
import org.modelio.api.module.lifecycle.ModuleException;
import org.modelio.vbasic.version.Version;

@objid ("5939b2a0-9a02-44bd-87bb-2a387d6e9e79")
public class VariabilityDesignerLifeCycleHandler extends DefaultModuleLifeCycleHandler {
    @objid ("d95648e1-7c02-4efc-8261-6158b6501110")
    public VariabilityDesignerLifeCycleHandler(final VariabilityDesignerModule module) {
        super(module);
    }

    @objid ("74fefdc5-c6f6-4762-a286-a6f57c7e9a25")
    @Override
    public boolean start() throws ModuleException {
        return super.start();
    }

    @objid ("cfc72e3e-3825-4162-89fb-0bbd3c27d69c")
    @Override
    public void stop() throws ModuleException {
        super.stop();
    }

    /**
     * @return
     */
    @objid ("6b07d726-abb7-4a01-843e-213af29f1dff")
    public static boolean install(final String modelioPath, final String mdaPath) throws ModuleException {
        return DefaultModuleLifeCycleHandler.install(modelioPath, mdaPath);
    }

    @objid ("c9614fef-e5eb-4458-b0fe-edc05b52f6c8")
    @Override
    public boolean select() throws ModuleException {
        return super.select();
    }

    @objid ("750132c4-b13c-4c8d-895e-343a52f62136")
    @Override
    public void upgrade(final Version oldVersion, final Map<String, String> oldParameters) throws ModuleException {
        Version lastVersion = new Version("2.1.10");
        if (oldVersion.isOlderThan(lastVersion)) {
        }
    }

    @objid ("e030d54e-16b0-4fe5-b89a-f43bb577d11b")
    @Override
    public void unselect() throws ModuleException {
        super.unselect();
    }

}
