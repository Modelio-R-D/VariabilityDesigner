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
import org.modelio.module.variabilitydesigner.impl.VariabilityDesignerModule;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * Proxy class to handle a {@link ClassDiagram} with << Feature_Diagram >> stereotype.
 * <p>Stereotype description:
 * <br/><i>null</i></p>
 */
@objid ("f9547a29-a090-4b9e-939e-b6e92b8a2e78")
public class FeatureDiagram {
    @objid ("4bd04d67-de1b-44d9-b870-46b753abcc13")
    public static final String STEREOTYPE_NAME = "Feature_Diagram";

    /**
     * The underlying {@link ClassDiagram} represented by this proxy, never null.
     */
    @objid ("212e91ca-8c62-44d1-bcb0-d6344a3a5503")
    protected final ClassDiagram elt;

    /**
     * Tells whether a {@link FeatureDiagram proxy} can be instantiated from a {@link MObject} checking it is a {@link ClassDiagram} stereotyped << Feature_Diagram >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("cc88cfd0-5586-4c4a-8d33-9ffea132ab89")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof ClassDiagram) && ((ClassDiagram) elt).isStereotyped(IVariabilityDesignerPeerModule.MODULE_NAME, FeatureDiagram.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link ClassDiagram} stereotyped << Feature_Diagram >> then instantiate a {@link FeatureDiagram} proxy.
     * 
     * @return a {@link FeatureDiagram} proxy on the created {@link ClassDiagram}.
     */
    @objid ("5f827745-becf-4d55-8e1e-7d8313593598")
    public static FeatureDiagram create() {
        ModelElement e = (ModelElement)VariabilityDesignerModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Standard.ClassDiagram");
        e.addStereotype(IVariabilityDesignerPeerModule.MODULE_NAME, FeatureDiagram.STEREOTYPE_NAME);
        return FeatureDiagram.instantiate((ClassDiagram)e);
    }

    /**
     * Tries to instantiate a {@link FeatureDiagram} proxy from a {@link ClassDiagram} stereotyped << Feature_Diagram >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a ClassDiagram
     * @return a {@link FeatureDiagram} proxy or <i>null</i>.
     */
    @objid ("723ef1d0-88fb-4bc2-9dee-572f02bfc075")
    public static FeatureDiagram instantiate(final ClassDiagram obj) {
        return FeatureDiagram.canInstantiate(obj) ? new FeatureDiagram(obj) : null;
    }

    /**
     * Tries to instantiate a {@link FeatureDiagram} proxy from a {@link ClassDiagram} stereotyped << Feature_Diagram >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link ClassDiagram}
     * @return a {@link FeatureDiagram} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("d35ecab7-865a-4ca3-bdd5-3f81bc06cf7b")
    public static FeatureDiagram safeInstantiate(final ClassDiagram obj) throws IllegalArgumentException {
        if (FeatureDiagram.canInstantiate(obj))
        	return new FeatureDiagram(obj);
        else
        	throw new IllegalArgumentException("FeatureDiagram: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("1e9cc9ae-d2a3-4050-adda-0c4dd47ef0e3")
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
        FeatureDiagram other = (FeatureDiagram) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link ClassDiagram}. 
     * @return the ClassDiagram represented by this proxy, never null.
     */
    @objid ("9eaa7f8f-00a6-4c7f-b789-39c61f0ea0b9")
    public ClassDiagram getElement() {
        return this.elt;
    }

    @objid ("b200308f-4679-4c49-8324-ee9cb8488d59")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    @objid ("7db3fa45-f1ac-4d71-ad97-c88e1315bd9a")
    protected FeatureDiagram(final ClassDiagram elt) {
        this.elt = elt;
    }

    @objid ("f9c5f827-ca3d-4df3-add1-4ce84f025502")
    public static final class MdaTypes {
        @objid ("00c2b6e1-d0ed-4ddb-ab96-2173aa3a2de1")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("316ba795-d557-48f8-8a7f-cbbbaff13e70")
        private static Stereotype MDAASSOCDEP;

        @objid ("30482a2c-a7f0-48f8-9a21-95fd33bc55d9")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("1664297e-5c17-47b1-add1-7cbd2eeece49")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "154248f2-acd9-4c6e-9b98-8df045ffae53");
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
