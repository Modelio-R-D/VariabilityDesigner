package org.modelio.module.variabilitydesigner.impl;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.api.module.context.configuration.IModuleAPIConfiguration;
import org.modelio.module.variabilitydesigner.api.IVariabilityDesignerPeerModule;
import org.modelio.vbasic.version.Version;

@objid ("1e9aed3f-df4d-4e3b-b6de-e76f6495f7d3")
public class VariabilityDesignerPeerModule implements IVariabilityDesignerPeerModule {
    @objid ("5cbc23bb-d124-4578-9d76-f87e80c29e3c")
    private VariabilityDesignerModule module = null;

    @objid ("96e1f2d8-4e2f-4943-810f-1984b4c5a85b")
    private IModuleAPIConfiguration peerConfiguration;

    @objid ("450a0cbe-83f6-46f7-b814-da700b000035")
    public VariabilityDesignerPeerModule(final VariabilityDesignerModule module, final IModuleAPIConfiguration peerConfiguration) {
        this.module = module;
        this.peerConfiguration = peerConfiguration;
    }

    @objid ("38be1abe-262c-4521-872e-dc7fa56052ff")
    public IModuleAPIConfiguration getConfiguration() {
        return this.peerConfiguration;
    }

    @objid ("ba9469f2-15cf-4447-b02e-40d4501f3daa")
    public String getDescription() {
        return this.module.getDescription();
    }

    @objid ("e3fc0d83-e269-4691-a64e-c0aa16c05e58")
    public String getName() {
        return this.module.getName();
    }

    @objid ("87de7565-7eda-4fef-991c-82fd5eed0fc7")
    public Version getVersion() {
        return this.module.getVersion();
    }

    @objid ("a4fe1468-2d40-4f4f-9969-d5c2d58c8b51")
    void init() {
    }

}
