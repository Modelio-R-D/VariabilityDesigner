package org.modelio.module.variabilitydesigner.impl;

import org.modelio.api.module.context.configuration.IModuleAPIConfiguration;
import org.modelio.module.variabilitydesigner.api.IVariabilityDesignerPeerModule;
import org.modelio.vbasic.version.Version;

public class VariabilityDesignerPeerModule implements IVariabilityDesignerPeerModule {
    private VariabilityDesignerModule module = null;

    private IModuleAPIConfiguration peerConfiguration;

    public VariabilityDesignerPeerModule(final VariabilityDesignerModule module, final IModuleAPIConfiguration peerConfiguration) {
        this.module = module;
        this.peerConfiguration = peerConfiguration;
    }

    public IModuleAPIConfiguration getConfiguration() {
        return this.peerConfiguration;
    }

    public String getDescription() {
        return this.module.getDescription();
    }

    public String getName() {
        return this.module.getName();
    }

    public Version getVersion() {
        return this.module.getVersion();
    }

    void init() {
    }

}
