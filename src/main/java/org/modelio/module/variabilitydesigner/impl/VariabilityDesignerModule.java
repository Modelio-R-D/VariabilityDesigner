package org.modelio.module.variabilitydesigner.impl;

import org.modelio.api.module.AbstractJavaModule;
import org.modelio.api.module.context.IModuleContext;
import org.modelio.api.module.lifecycle.IModuleLifeCycleHandler;
import org.modelio.api.module.mda.IMdaExpert;
import org.modelio.api.module.parameter.IParameterEditionModel;
import org.modelio.metamodel.uml.infrastructure.Stereotype;

public class VariabilityDesignerModule extends AbstractJavaModule {
    private static final String MODULE_IMAGE = "/res/icon/module.png";

    private VariabilityDesignerPeerModule peerModule = null;

    private VariabilityDesignerLifeCycleHandler lifeCycleHandler = null;

    private static VariabilityDesignerModule instance;

    public static VariabilityDesignerLogService logService;

    public VariabilityDesignerModule(final IModuleContext moduleContext) {
        super(moduleContext);
        
        VariabilityDesignerModule.instance = this;
        
        this.lifeCycleHandler  = new VariabilityDesignerLifeCycleHandler(this);
        this.peerModule = new VariabilityDesignerPeerModule(this, moduleContext.getPeerConfiguration());
        init();
    }

    @Override
    public VariabilityDesignerPeerModule getPeerModule() {
        return this.peerModule;
    }

    /**
     * Return the LifeCycleHandler  attached to the current module. This handler is used to manage the module lifecycle by declaring the desired implementation for the start, select... methods.
     */
    @Override
    public IModuleLifeCycleHandler getLifeCycleHandler() {
        return this.lifeCycleHandler;
    }

    /**
     * Method automatically called just after the creation of the module. The module is automatically instanciated at the beginning
     * of the MDA lifecycle and constructor implementation is not accessible to the module developer. The <code>init</code> method
     * allows the developer to execute the desired initialization.
     */
    @Override
    public IParameterEditionModel getParametersEditionModel() {
        return super.getParametersEditionModel();
    }

    @Override
    public String getModuleImagePath() {
        return VariabilityDesignerModule.MODULE_IMAGE;
    }

    public static VariabilityDesignerModule getInstance() {
        // Automatically generated method. Please delete this comment before entering specific code.
        return instance;
    }

    @Override
    public IMdaExpert getMdaExpert(final Stereotype st) {
        // Generated code, please do not remove it
        IMdaExpert expert = getGeneratedMdaExpert(st);
        if (expert != null) {
            return expert;
        }// End generated code
        return null;
    }

    /**
     * Generated expert looking for a MDA expert in the generated MDA API.
     * 
     * @param st a stereotype owned by the current module.
     * @return a MDA expert belonging to the MDA API or <code>null</code>.
     */
    private IMdaExpert getGeneratedMdaExpert(final Stereotype st) {
        switch (st.getUuid()) {
            default: return null;
        }
    }

}
