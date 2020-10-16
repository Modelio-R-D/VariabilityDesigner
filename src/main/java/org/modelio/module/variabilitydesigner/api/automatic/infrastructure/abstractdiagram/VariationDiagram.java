/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: VariabilityDesigner v1.3.01

 * This file was generated on 10/1/20 10:12 AM by Modelio Studio.
 */
package org.modelio.module.variabilitydesigner.api.automatic.infrastructure.abstractdiagram;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Objects;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.api.modelio.model.IModelingSession;
import org.modelio.api.modelio.model.PropertyConverter;
import org.modelio.api.module.context.IModuleContext;
import org.modelio.metamodel.diagrams.AbstractDiagram;
import org.modelio.metamodel.mmextensions.infrastructure.ExtensionNotFoundException;
import org.modelio.metamodel.uml.infrastructure.Dependency;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.metamodel.uml.infrastructure.Stereotype;
import org.modelio.metamodel.uml.infrastructure.TagType;
import org.modelio.metamodel.uml.infrastructure.properties.PropertyDefinition;
import org.modelio.metamodel.uml.infrastructure.properties.PropertyTableDefinition;
import org.modelio.module.variabilitydesigner.api.IVariabilityDesignerPeerModule;
import org.modelio.module.variabilitydesigner.api.VariabilityDesignerProxyFactory;
import org.modelio.module.variabilitydesigner.impl.VariabilityDesignerModule;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * Proxy class to handle a {@link AbstractDiagram} with << Variation_Diagram >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
@objid ("6e9f4b6e-ff23-4a7c-a9fd-0fbac2d40405")
public class VariationDiagram {
    @objid ("a0e7e26d-c985-4108-9f46-457df1649261")
    public static final String STEREOTYPE_NAME = "Variation_Diagram";

    /**
     * The underlying {@link AbstractDiagram} represented by this proxy, never null.
     */
    @objid ("2a40b292-171b-47da-a81f-779132299dd6")
    protected final AbstractDiagram elt;

    /**
     * Tells whether a {@link VariationDiagram proxy} can be instantiated from a {@link MObject} checking it is a {@link AbstractDiagram} stereotyped << Variation_Diagram >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("e71067ea-91e7-4509-8a2f-f45a9f7c5360")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof AbstractDiagram) && ((AbstractDiagram) elt).isStereotyped(IVariabilityDesignerPeerModule.MODULE_NAME, VariationDiagram.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link AbstractDiagram} stereotyped << Variation_Diagram >> then instantiate a {@link VariationDiagram} proxy.
     * 
     * @return a {@link VariationDiagram} proxy on the created {@link AbstractDiagram}.
     */
    @objid ("3fa69d15-c9c2-4578-91e7-594ae8c36f4b")
    public static VariationDiagram create() {
        ModelElement e = (ModelElement)VariabilityDesignerModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Infrastructure.AbstractDiagram");
        e.addStereotype(IVariabilityDesignerPeerModule.MODULE_NAME, VariationDiagram.STEREOTYPE_NAME);
        return VariationDiagram.instantiate((AbstractDiagram)e);
    }

    /**
     * Tries to instantiate a {@link VariationDiagram} proxy from a {@link AbstractDiagram} stereotyped << Variation_Diagram >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a AbstractDiagram
     * @return a {@link VariationDiagram} proxy or <i>null</i>.
     */
    @objid ("17a8e3bc-6e01-451d-bd93-51eeddd46645")
    public static VariationDiagram instantiate(final AbstractDiagram obj) {
        return VariationDiagram.canInstantiate(obj) ? new VariationDiagram(obj) : null;
    }

    /**
     * Tries to instantiate a {@link VariationDiagram} proxy from a {@link AbstractDiagram} stereotyped << Variation_Diagram >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link AbstractDiagram}
     * @return a {@link VariationDiagram} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("b9ce12a2-7a85-4e09-a3bb-f7693dabe240")
    public static VariationDiagram safeInstantiate(final AbstractDiagram obj) throws IllegalArgumentException {
        if (VariationDiagram.canInstantiate(obj))
        	return new VariationDiagram(obj);
        else
        	throw new IllegalArgumentException("VariationDiagram: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("5595b490-d6bd-4ec0-923a-e360dcdbb77e")
    @Override
    public boolean equals(final Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        VariationDiagram other = (VariationDiagram) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link AbstractDiagram}. 
     * @return the AbstractDiagram represented by this proxy, never null.
     */
    @objid ("58954ffe-562d-4589-855d-5da515ab728f")
    public AbstractDiagram getElement() {
        return this.elt;
    }

    @objid ("95145801-5d46-442c-8b5b-3d0d4d6f36b4")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    @objid ("c6533558-76f3-4312-8644-b2cd6615d90c")
    protected VariationDiagram(final AbstractDiagram elt) {
        this.elt = elt;
    }

    @objid ("7b3f38f2-278b-4a7e-80fc-cc0e143a20e8")
    public static final class MdaTypes {
        @objid ("b72607fb-9f2d-4d6a-a158-bb11fb19a5d8")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("4532d9a2-1017-4b25-9e24-25b965085d3a")
        private static Stereotype MDAASSOCDEP;

        @objid ("6d4a84d1-0d82-4006-94ce-89fed9ccd9e2")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("be45a9af-f9b3-4022-ac4f-e77d65d8a675")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "80f753fc-c7a9-424d-9b5a-b9475971dad9");
            MDAASSOCDEP = ctx.getModelingSession().findElementById(Stereotype.class, "94b7efa5-f94c-4d1d-896f-f103e56a8e2e");
            MDAASSOCDEP_ROLE = ctx.getModelingSession().findElementById(TagType.class, "7637f2fd-b750-43c1-a15c-5d0b084ca1cd");
        }


	static {
		if(VariabilityDesignerModule.getInstance() != null) {
			init(VariabilityDesignerModule.getInstance().getModuleContext());
		}
	}
    }

}
