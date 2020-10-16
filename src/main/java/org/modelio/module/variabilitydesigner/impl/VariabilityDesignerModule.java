package org.modelio.module.variabilitydesigner.impl;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.api.module.AbstractJavaModule;
import org.modelio.api.module.context.IModuleContext;
import org.modelio.api.module.lifecycle.IModuleLifeCycleHandler;
import org.modelio.api.module.mda.IMdaExpert;
import org.modelio.api.module.parameter.IParameterEditionModel;
import org.modelio.metamodel.uml.infrastructure.Stereotype;

@objid ("62b421ec-29ed-4333-b0b2-1dd482358b58")
public class VariabilityDesignerModule extends AbstractJavaModule {
    @objid ("c7b35baa-9ad8-4f48-becf-870d5e960e9f")
    private static final String MODULE_IMAGE = "/res/icon/module.png";

    @objid ("02ac28f3-6f37-4ff9-afde-6da4e7bee78d")
    private VariabilityDesignerPeerModule peerModule = null;

    @objid ("97769614-0bef-4e64-a384-cfad61697235")
    private VariabilityDesignerLifeCycleHandler lifeCycleHandler = null;

    @objid ("44795858-f38e-4579-8cd1-b85f84f8a96e")
    private static VariabilityDesignerModule instance;

    @objid ("c11dd7a2-51fc-4fdd-8cff-7b9ff153147a")
    public static VariabilityDesignerLogService logService;

    @objid ("8b03c5e8-c494-4617-9fd3-9e96dc46c74d")
    public VariabilityDesignerModule(final IModuleContext moduleContext) {
        super(moduleContext);
        
        VariabilityDesignerModule.instance = this;
        
        this.lifeCycleHandler  = new VariabilityDesignerLifeCycleHandler(this);
        this.peerModule = new VariabilityDesignerPeerModule(this, moduleContext.getPeerConfiguration());
        init();
    }

    @objid ("1b6043d7-cf4c-45fa-8cf5-2520826a5e47")
    @Override
    public VariabilityDesignerPeerModule getPeerModule() {
        return this.peerModule;
    }

    /**
     * Return the LifeCycleHandler  attached to the current module. This handler is used to manage the module lifecycle by declaring the desired implementation for the start, select... methods.
     */
    @objid ("a0b7a237-435e-418f-82a9-9d2cdd872841")
    @Override
    public IModuleLifeCycleHandler getLifeCycleHandler() {
        return this.lifeCycleHandler;
    }

    /**
     * Method automatically called just after the creation of the module. The module is automatically instanciated at the beginning
     * of the MDA lifecycle and constructor implementation is not accessible to the module developer. The <code>init</code> method
     * allows the developer to execute the desired initialization.
     */
    @objid ("56121267-a7e3-4ab5-943e-30acb7037c54")
    @Override
    public IParameterEditionModel getParametersEditionModel() {
        return super.getParametersEditionModel();
    }

    @objid ("1d22eac5-06cf-4ebc-9168-05cee95f1f88")
    @Override
    public String getModuleImagePath() {
        return VariabilityDesignerModule.MODULE_IMAGE;
    }

    @objid ("8164d50b-4c64-426d-9ef5-015e2653f04a")
    public static VariabilityDesignerModule getInstance() {
        // Automatically generated method. Please delete this comment before entering specific code.
        return instance;
    }

    @objid ("5975da8d-7833-420a-8750-d4a43139e0c2")
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
    @objid ("e244be3d-0739-4952-9ccb-3ece200836a6")
    private IMdaExpert getGeneratedMdaExpert(final Stereotype st) {
        switch (st.getUuid()) {
        	default: return null;
        }
    }

}
