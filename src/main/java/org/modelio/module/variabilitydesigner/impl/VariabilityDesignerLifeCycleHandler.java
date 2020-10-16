package org.modelio.module.variabilitydesigner.impl;

import java.util.Map;
import org.modelio.api.module.lifecycle.DefaultModuleLifeCycleHandler;
import org.modelio.api.module.lifecycle.ModuleException;
import org.modelio.vbasic.version.Version;

public class VariabilityDesignerLifeCycleHandler extends DefaultModuleLifeCycleHandler {
    public VariabilityDesignerLifeCycleHandler(final VariabilityDesignerModule module) {
        super(module);
    }

    @Override
    public boolean start() throws ModuleException {
        return super.start();
    }

    @Override
    public void stop() throws ModuleException {
        super.stop();
    }

    /**
     * @return
     */
    public static boolean install(final String modelioPath, final String mdaPath) throws ModuleException {
        return DefaultModuleLifeCycleHandler.install(modelioPath, mdaPath);
    }

    @Override
    public boolean select() throws ModuleException {
        return super.select();
    }

    @Override
    public void upgrade(final Version oldVersion, final Map<String, String> oldParameters) throws ModuleException {
        Version lastVersion = new Version("2.1.10");
        if (oldVersion.isOlderThan(lastVersion)) {
        }
    }

    @Override
    public void unselect() throws ModuleException {
        super.unselect();
    }

}
