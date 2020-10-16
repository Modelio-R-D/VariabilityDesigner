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
 * Proxy class to handle a {@link Constraint} with << Calculated_Parameter_Variation >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
@objid ("d49f83fb-6562-45ae-b3b4-dafcabdac9dc")
public class CalculatedParameterVariation extends Variation {
    @objid ("97d2668a-3462-4f93-8daf-aafaf6064279")
    public static final String STEREOTYPE_NAME = "Calculated_Parameter_Variation";

    @objid ("6ed8098a-2ded-45eb-96f2-4f725a95a8a5")
    public static final String APPLIED_ON_TAGTYPE = "Applied_on";

    @objid ("09eb7d20-67df-46e9-b3e9-2490dd778dcc")
    public static final String EXPRESSION_TAGTYPE = "Expression";

    @objid ("968baa58-ecd1-4a4d-b749-5ca38422ef8b")
    public static final String TYPE_TAGTYPE = "Type";

    /**
     * Tells whether a {@link CalculatedParameterVariation proxy} can be instantiated from a {@link MObject} checking it is a {@link Constraint} stereotyped << Calculated_Parameter_Variation >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("5ea55d88-72de-470e-bf64-70a08afa1c91")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Constraint) && ((Constraint) elt).isStereotyped(IVariabilityDesignerPeerModule.MODULE_NAME, CalculatedParameterVariation.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Constraint} stereotyped << Calculated_Parameter_Variation >> then instantiate a {@link CalculatedParameterVariation} proxy.
     * 
     * @return a {@link CalculatedParameterVariation} proxy on the created {@link Constraint}.
     */
    @objid ("9fe16caa-41ee-4c89-8b8d-81faf8e4544b")
    public static CalculatedParameterVariation create() {
        ModelElement e = (ModelElement)VariabilityDesignerModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Standard.Constraint");
        e.addStereotype(IVariabilityDesignerPeerModule.MODULE_NAME, CalculatedParameterVariation.STEREOTYPE_NAME);
        return CalculatedParameterVariation.instantiate((Constraint)e);
    }

    /**
     * Tries to instantiate a {@link CalculatedParameterVariation} proxy from a {@link Constraint} stereotyped << Calculated_Parameter_Variation >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Constraint
     * @return a {@link CalculatedParameterVariation} proxy or <i>null</i>.
     */
    @objid ("2a59f8e4-7563-4e77-bd82-3f20e06c3c77")
    public static CalculatedParameterVariation instantiate(final Constraint obj) {
        return CalculatedParameterVariation.canInstantiate(obj) ? new CalculatedParameterVariation(obj) : null;
    }

    /**
     * Tries to instantiate a {@link CalculatedParameterVariation} proxy from a {@link Constraint} stereotyped << Calculated_Parameter_Variation >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Constraint}
     * @return a {@link CalculatedParameterVariation} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("0e3ab9e5-d048-4809-8801-db584d539a07")
    public static CalculatedParameterVariation safeInstantiate(final Constraint obj) throws IllegalArgumentException {
        if (CalculatedParameterVariation.canInstantiate(obj))
        	return new CalculatedParameterVariation(obj);
        else
        	throw new IllegalArgumentException("CalculatedParameterVariation: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("64660703-8dba-4d5e-b17f-f358b9568552")
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
        CalculatedParameterVariation other = (CalculatedParameterVariation) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Getter for string property 'Applied_on'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("dde0c6fa-e119-426a-b448-882ba837a073")
    public String getApplied_on() {
        return this.elt.getTagValue(CalculatedParameterVariation.MdaTypes.APPLIED_ON_TAGTYPE_ELT);
    }

    /**
     * Get the underlying {@link Constraint}. 
     * @return the Constraint represented by this proxy, never null.
     */
    @objid ("ec9e4a92-0ec5-4f17-acef-cec551cd64af")
    @Override
    public Constraint getElement() {
        return (Constraint)super.getElement();
    }

    /**
     * Getter for string property 'Expression'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("13112dd8-d06f-4c17-b65c-44b4822edefe")
    public String getExpression() {
        return this.elt.getTagValue(CalculatedParameterVariation.MdaTypes.EXPRESSION_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'Type'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("2dbf1c70-724c-43dc-b901-0f424b0f7b85")
    public String getType() {
        return this.elt.getTagValue(CalculatedParameterVariation.MdaTypes.TYPE_TAGTYPE_ELT);
    }

    @objid ("31502a68-3d06-4352-8d3d-bf551fd632d4")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Setter for string property 'Applied_on'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("09846f90-f30d-46ac-8966-997ad4b00515")
    public void setApplied_on(final String value) {
        this.elt.putTagValue(CalculatedParameterVariation.MdaTypes.APPLIED_ON_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'Expression'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("5ae83efe-5857-4cbd-89e1-af4fd04dc8a2")
    public void setExpression(final String value) {
        this.elt.putTagValue(CalculatedParameterVariation.MdaTypes.EXPRESSION_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'Type'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("4b3074b6-b58a-47ae-8066-08d893d12498")
    public void setType(final String value) {
        this.elt.putTagValue(CalculatedParameterVariation.MdaTypes.TYPE_TAGTYPE_ELT, value);
    }

    @objid ("acbaf8f3-42cc-490d-b8f9-8399eb1148d7")
    protected CalculatedParameterVariation(final Constraint elt) {
        super(elt);
    }

    @objid ("c4e9b9bf-56d7-4885-a514-4a58b23e7ea8")
    public static final class MdaTypes {
        @objid ("f5fc587b-912c-47e3-a922-e42c3bbd07d8")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("6c684e97-ead3-45e5-b22e-0afde3280d21")
        public static TagType TYPE_TAGTYPE_ELT;

        @objid ("eadb6259-5a3f-4b8c-baef-1f8b94963468")
        public static TagType EXPRESSION_TAGTYPE_ELT;

        @objid ("ab718d34-a11b-4240-9e22-50b89e4b612e")
        public static TagType APPLIED_ON_TAGTYPE_ELT;

        @objid ("8c4a21ff-4627-4af4-b6f6-ea4850e1f517")
        private static Stereotype MDAASSOCDEP;

        @objid ("0e8a94b4-6927-46c6-b4e2-c5eb7507e231")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("127f941c-36b3-413d-8fd1-37fa92ccab12")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "b67fcb92-1c2d-4a52-9a18-a5ded16b9a4f");
            TYPE_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "85b8a68d-faba-47e7-a57c-8d8420954bf7");
            EXPRESSION_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "e3a90ba9-ec30-4b32-ab6a-855574ead050");
            APPLIED_ON_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "b105ec93-cda6-49a2-816e-d6e64e83964e");
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
