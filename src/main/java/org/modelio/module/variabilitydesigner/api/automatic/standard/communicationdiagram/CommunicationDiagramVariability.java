/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: VariabilityDesigner v1.3.01

 * This file was generated on 10/1/20 10:12 AM by Modelio Studio.
 */
package org.modelio.module.variabilitydesigner.api.automatic.standard.communicationdiagram;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Objects;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.api.modelio.model.IModelingSession;
import org.modelio.api.modelio.model.PropertyConverter;
import org.modelio.api.module.context.IModuleContext;
import org.modelio.metamodel.diagrams.CommunicationDiagram;
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
 * Proxy class to handle a {@link CommunicationDiagram} with << Communication_Diagram_(Variability) >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
@objid ("8ab30b0c-1705-4f87-a02a-ebd7f7c31c72")
public class CommunicationDiagramVariability extends VariationDiagram {
    @objid ("e89774e3-285f-4e72-a138-f6592a625fd8")
    public static final String STEREOTYPE_NAME = "Communication_Diagram_(Variability)";

    /**
     * Tells whether a {@link CommunicationDiagramVariability proxy} can be instantiated from a {@link MObject} checking it is a {@link CommunicationDiagram} stereotyped << Communication_Diagram_(Variability) >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("f563ebd0-631f-4b51-8304-aef269bf8d1e")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof CommunicationDiagram) && ((CommunicationDiagram) elt).isStereotyped(IVariabilityDesignerPeerModule.MODULE_NAME, CommunicationDiagramVariability.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link CommunicationDiagram} stereotyped << Communication_Diagram_(Variability) >> then instantiate a {@link CommunicationDiagramVariability} proxy.
     * 
     * @return a {@link CommunicationDiagramVariability} proxy on the created {@link CommunicationDiagram}.
     */
    @objid ("6920b9f3-34af-4822-88d9-e0b9cdb2ae36")
    public static CommunicationDiagramVariability create() {
        ModelElement e = (ModelElement)VariabilityDesignerModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Standard.CommunicationDiagram");
        e.addStereotype(IVariabilityDesignerPeerModule.MODULE_NAME, CommunicationDiagramVariability.STEREOTYPE_NAME);
        return CommunicationDiagramVariability.instantiate((CommunicationDiagram)e);
    }

    /**
     * Tries to instantiate a {@link CommunicationDiagramVariability} proxy from a {@link CommunicationDiagram} stereotyped << Communication_Diagram_(Variability) >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a CommunicationDiagram
     * @return a {@link CommunicationDiagramVariability} proxy or <i>null</i>.
     */
    @objid ("030702da-767b-4693-aca2-e228de3fbbab")
    public static CommunicationDiagramVariability instantiate(final CommunicationDiagram obj) {
        return CommunicationDiagramVariability.canInstantiate(obj) ? new CommunicationDiagramVariability(obj) : null;
    }

    /**
     * Tries to instantiate a {@link CommunicationDiagramVariability} proxy from a {@link CommunicationDiagram} stereotyped << Communication_Diagram_(Variability) >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link CommunicationDiagram}
     * @return a {@link CommunicationDiagramVariability} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("a65f66e8-edbb-41f7-84ed-776a089cb16e")
    public static CommunicationDiagramVariability safeInstantiate(final CommunicationDiagram obj) throws IllegalArgumentException {
        if (CommunicationDiagramVariability.canInstantiate(obj))
        	return new CommunicationDiagramVariability(obj);
        else
        	throw new IllegalArgumentException("CommunicationDiagramVariability: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("79d13f29-5796-4618-ac88-03ed83fac0ef")
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
        CommunicationDiagramVariability other = (CommunicationDiagramVariability) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link CommunicationDiagram}. 
     * @return the CommunicationDiagram represented by this proxy, never null.
     */
    @objid ("4a672b9c-c2e2-4a92-b804-fdabff7ce1c9")
    @Override
    public CommunicationDiagram getElement() {
        return (CommunicationDiagram)super.getElement();
    }

    @objid ("050f7cdc-1ab9-429f-9000-2c78b72d9d68")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    @objid ("ae827349-91a2-4014-bef7-16f7f0f3f00b")
    protected CommunicationDiagramVariability(final CommunicationDiagram elt) {
        super(elt);
    }

    @objid ("d374295d-3cb8-42a3-882f-4ef3b11445a2")
    public static final class MdaTypes {
        @objid ("4e56fb17-8fd3-408b-9b27-c806071b5ffc")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("fd8c384f-2508-4b16-9d33-4e4cfccdad23")
        private static Stereotype MDAASSOCDEP;

        @objid ("aa9c5d53-9306-4bbe-8d57-649a84e18756")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("dfe71845-8154-4b76-888e-842755b33300")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "75f73c97-2807-4f78-8fee-4dcb27015ba0");
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
