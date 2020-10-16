/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: VariabilityDesigner v1.3.01

 * This file was generated on 10/1/20 10:12 AM by Modelio Studio.
 */
package org.modelio.module.variabilitydesigner.api.variation.standard.constraint;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Objects;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.api.modelio.model.IModelingSession;
import org.modelio.api.modelio.model.PropertyConverter;
import org.modelio.api.module.context.IModuleContext;
import org.modelio.metamodel.mmextensions.infrastructure.ExtensionNotFoundException;
import org.modelio.metamodel.uml.infrastructure.Constraint;
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
 * Proxy class to handle a {@link Constraint} with << Alternative_Parameter_Variation >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
@objid ("dcbab187-0621-494f-a710-9a2f1770f4ed")
public class AlternativeParameterVariation extends Variation {
    @objid ("d564a592-51c0-451e-819d-3f63dc7b6cef")
    public static final String STEREOTYPE_NAME = "Alternative_Parameter_Variation";

    @objid ("2dbe0668-dd91-43b2-9ef7-a28bf0801126")
    public static final String APPLIED_ON_TAGTYPE = "Applied_on";

    @objid ("f4605a1e-e709-4066-beb2-d637d7d91442")
    public static final String CONDITION_TAGTYPE = "Condition";

    @objid ("a9150d4f-755a-4ea1-8e0d-fbbadd411afc")
    public static final String TYPE_TAGTYPE = "Type";

    @objid ("4c501b3b-d70b-4ca3-a82e-cbdd3251b853")
    public static final String VALUE_TAGTYPE = "Value";

    /**
     * Tells whether a {@link AlternativeParameterVariation proxy} can be instantiated from a {@link MObject} checking it is a {@link Constraint} stereotyped << Alternative_Parameter_Variation >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("20af1822-5a12-406c-a7f0-97f602e71ddc")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Constraint) && ((Constraint) elt).isStereotyped(IVariabilityDesignerPeerModule.MODULE_NAME, AlternativeParameterVariation.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Constraint} stereotyped << Alternative_Parameter_Variation >> then instantiate a {@link AlternativeParameterVariation} proxy.
     * 
     * @return a {@link AlternativeParameterVariation} proxy on the created {@link Constraint}.
     */
    @objid ("d9e61a09-1c46-46c0-83e4-62fc91364608")
    public static AlternativeParameterVariation create() {
        ModelElement e = (ModelElement)VariabilityDesignerModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Standard.Constraint");
        e.addStereotype(IVariabilityDesignerPeerModule.MODULE_NAME, AlternativeParameterVariation.STEREOTYPE_NAME);
        return AlternativeParameterVariation.instantiate((Constraint)e);
    }

    /**
     * Tries to instantiate a {@link AlternativeParameterVariation} proxy from a {@link Constraint} stereotyped << Alternative_Parameter_Variation >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Constraint
     * @return a {@link AlternativeParameterVariation} proxy or <i>null</i>.
     */
    @objid ("67e8d624-49cb-4a84-820d-40e4116af94e")
    public static AlternativeParameterVariation instantiate(final Constraint obj) {
        return AlternativeParameterVariation.canInstantiate(obj) ? new AlternativeParameterVariation(obj) : null;
    }

    /**
     * Tries to instantiate a {@link AlternativeParameterVariation} proxy from a {@link Constraint} stereotyped << Alternative_Parameter_Variation >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Constraint}
     * @return a {@link AlternativeParameterVariation} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("5ba27c5a-7b96-4ef0-88aa-394ec4214d55")
    public static AlternativeParameterVariation safeInstantiate(final Constraint obj) throws IllegalArgumentException {
        if (AlternativeParameterVariation.canInstantiate(obj))
        	return new AlternativeParameterVariation(obj);
        else
        	throw new IllegalArgumentException("AlternativeParameterVariation: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("7a7d330e-9826-4ffb-9e48-96895bba9b73")
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
        AlternativeParameterVariation other = (AlternativeParameterVariation) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Getter for string property 'Applied_on'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("8fc7e688-0311-4234-a7c2-0f7e87f00890")
    public String getApplied_on() {
        return this.elt.getTagValue(AlternativeParameterVariation.MdaTypes.APPLIED_ON_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'Condition'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("f206032e-f0a8-439f-8abc-112551499dbb")
    public String getCondition() {
        return this.elt.getTagValue(AlternativeParameterVariation.MdaTypes.CONDITION_TAGTYPE_ELT);
    }

    /**
     * Get the underlying {@link Constraint}. 
     * @return the Constraint represented by this proxy, never null.
     */
    @objid ("0a721037-b5cf-4e40-80ae-8553be912b44")
    @Override
    public Constraint getElement() {
        return (Constraint)super.getElement();
    }

    /**
     * Getter for string property 'Type'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("32d52834-7e29-462a-a47b-e1c437b5b3b6")
    public String getType() {
        return this.elt.getTagValue(AlternativeParameterVariation.MdaTypes.TYPE_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'Value'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("afea96b5-de95-41c9-83cc-4205b05606fc")
    public String getValue() {
        return this.elt.getTagValue(AlternativeParameterVariation.MdaTypes.VALUE_TAGTYPE_ELT);
    }

    @objid ("32462582-e3b3-4721-9bfb-5959b48c767e")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Setter for string property 'Applied_on'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("386cacf4-ac73-46e7-b026-43dad95a090a")
    public void setApplied_on(final String value) {
        this.elt.putTagValue(AlternativeParameterVariation.MdaTypes.APPLIED_ON_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'Condition'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("4b72cabd-106b-4e4c-a8bf-5571c23c5a89")
    public void setCondition(final String value) {
        this.elt.putTagValue(AlternativeParameterVariation.MdaTypes.CONDITION_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'Type'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("57a5af2d-1946-4e6c-b8c9-049e42311429")
    public void setType(final String value) {
        this.elt.putTagValue(AlternativeParameterVariation.MdaTypes.TYPE_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'Value'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("860154c3-1bab-4467-a43e-af2b1d5369e2")
    public void setValue(final String value) {
        this.elt.putTagValue(AlternativeParameterVariation.MdaTypes.VALUE_TAGTYPE_ELT, value);
    }

    @objid ("f5de0267-0086-4cc1-aed6-fdc1f815d607")
    protected AlternativeParameterVariation(final Constraint elt) {
        super(elt);
    }

    @objid ("2582670d-e6ac-47f1-bece-932d25a24572")
    public static final class MdaTypes {
        @objid ("ac4b8b3b-eaae-402c-a8e1-adcef2591709")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("5cb14fdb-8ea5-413d-b155-0b2e4872fa2e")
        public static TagType TYPE_TAGTYPE_ELT;

        @objid ("16f7e008-bc5c-4986-b1e1-7b4420f928d3")
        public static TagType CONDITION_TAGTYPE_ELT;

        @objid ("f525d54c-a0e1-45c5-8168-39c7a1f1a3f2")
        public static TagType VALUE_TAGTYPE_ELT;

        @objid ("26e3c4d0-7de4-4380-9051-1ee641babe91")
        public static TagType APPLIED_ON_TAGTYPE_ELT;

        @objid ("9a8707b9-5c06-49b0-afe3-d092e212b333")
        private static Stereotype MDAASSOCDEP;

        @objid ("797739d4-fd1d-498f-a707-01c35a44840f")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("fb470cfd-f54a-4ccb-9d2b-eb51773f1869")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "6f9faa55-f77b-4111-a573-8295ceb345fc");
            TYPE_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "09055b18-ba6e-4c41-a512-e941fe8a81c3");
            CONDITION_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "f28591df-8e84-4ebe-8033-863b5e6a0aa3");
            VALUE_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "9028bb23-ad01-4140-b7dc-05756dad7c11");
            APPLIED_ON_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "f55a5703-9625-4370-a599-dc61ca4c2200");
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
