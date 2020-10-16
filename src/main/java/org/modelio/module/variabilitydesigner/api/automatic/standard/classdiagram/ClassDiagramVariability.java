/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: VariabilityDesigner v1.3.01

 * This file was generated on 10/1/20 10:12 AM by Modelio Studio.
 */
package org.modelio.module.variabilitydesigner.api.automatic.standard.classdiagram;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Objects;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.api.modelio.model.IModelingSession;
import org.modelio.api.modelio.model.PropertyConverter;
import org.modelio.api.module.context.IModuleContext;
import org.modelio.metamodel.diagrams.ClassDiagram;
import org.modelio.metamodel.mmextensions.infrastructure.ExtensionNotFoundException;
import org.modelio.metamodel.uml.infrastructure.Dependency;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.metamodel.uml.infrastructure.Stereotype;
import org.modelio.metamodel.uml.infrastructure.TagType;
import org.modelio.metamodel.uml.infrastructure.properties.PropertyDefinition;
import org.modelio.metamodel.uml.infrastructure.properties.PropertyTableDefinition;
import org.modelio.module.variabilitydesigner.api.IVariabilityDesignerPeerModule;
import org.modelio.module.variabilitydesigner.api.VariabilityDesignerProxyFactory;
import org.modelio.module.variabilitydesigner.api.automatic.infrastructure.abstractdiagram.VariationDiagram;
import org.modelio.module.variabilitydesigner.impl.VariabilityDesignerModule;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * Proxy class to handle a {@link ClassDiagram} with << Class_Diagram_(Variability) >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
@objid ("d642bd19-a7c8-4b26-8323-d24b83f91460")
public class ClassDiagramVariability extends VariationDiagram {
    @objid ("1d78123e-1f1c-4fb4-8e39-b2f3622b0702")
    public static final String STEREOTYPE_NAME = "Class_Diagram_(Variability)";

    /**
     * Tells whether a {@link ClassDiagramVariability proxy} can be instantiated from a {@link MObject} checking it is a {@link ClassDiagram} stereotyped << Class_Diagram_(Variability) >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("428f75d7-df0d-42ef-aa9d-c12b7e02fd49")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof ClassDiagram) && ((ClassDiagram) elt).isStereotyped(IVariabilityDesignerPeerModule.MODULE_NAME, ClassDiagramVariability.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link ClassDiagram} stereotyped << Class_Diagram_(Variability) >> then instantiate a {@link ClassDiagramVariability} proxy.
     * 
     * @return a {@link ClassDiagramVariability} proxy on the created {@link ClassDiagram}.
     */
    @objid ("99f2b19f-da79-4eac-8e54-290a060ef7a3")
    public static ClassDiagramVariability create() {
        ModelElement e = (ModelElement)VariabilityDesignerModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Standard.ClassDiagram");
        e.addStereotype(IVariabilityDesignerPeerModule.MODULE_NAME, ClassDiagramVariability.STEREOTYPE_NAME);
        return ClassDiagramVariability.instantiate((ClassDiagram)e);
    }

    /**
     * Tries to instantiate a {@link ClassDiagramVariability} proxy from a {@link ClassDiagram} stereotyped << Class_Diagram_(Variability) >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a ClassDiagram
     * @return a {@link ClassDiagramVariability} proxy or <i>null</i>.
     */
    @objid ("2a817e31-57aa-4dc1-a452-596361f381fc")
    public static ClassDiagramVariability instantiate(final ClassDiagram obj) {
        return ClassDiagramVariability.canInstantiate(obj) ? new ClassDiagramVariability(obj) : null;
    }

    /**
     * Tries to instantiate a {@link ClassDiagramVariability} proxy from a {@link ClassDiagram} stereotyped << Class_Diagram_(Variability) >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link ClassDiagram}
     * @return a {@link ClassDiagramVariability} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("cb9448df-2d5a-4d97-b44b-c7a5b26a8f3e")
    public static ClassDiagramVariability safeInstantiate(final ClassDiagram obj) throws IllegalArgumentException {
        if (ClassDiagramVariability.canInstantiate(obj))
        	return new ClassDiagramVariability(obj);
        else
        	throw new IllegalArgumentException("ClassDiagramVariability: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("a10eb228-7f6c-4103-b5c9-cfec34a7dcbb")
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
        ClassDiagramVariability other = (ClassDiagramVariability) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link ClassDiagram}. 
     * @return the ClassDiagram represented by this proxy, never null.
     */
    @objid ("9e424341-d69d-4ec8-99ef-5d4f3fcd411c")
    @Override
    public ClassDiagram getElement() {
        return (ClassDiagram)super.getElement();
    }

    @objid ("042aa833-6865-4a5f-9936-233b94ac8b94")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    @objid ("4471d4ac-e751-4f9d-b700-352fb5894fd1")
    protected ClassDiagramVariability(final ClassDiagram elt) {
        super(elt);
    }

    @objid ("b3da098d-0c69-4511-82b9-d87efde6bc0d")
    public static final class MdaTypes {
        @objid ("ef67820c-8b10-4a83-8df8-cf3a2e08af32")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("62c4c910-c31d-4c37-a9e7-68a22f41da89")
        private static Stereotype MDAASSOCDEP;

        @objid ("c57e79f1-0e6c-4e2d-8d95-e579038fffa4")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("479da537-0a31-42cf-ac32-36b48df92968")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "7863d1bf-ac2d-4f1c-9a18-54bdd695004a");
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
