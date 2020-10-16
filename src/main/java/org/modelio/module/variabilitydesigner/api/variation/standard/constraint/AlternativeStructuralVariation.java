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
 * Proxy class to handle a {@link Constraint} with << Alternative_Structural_Variation >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
@objid ("eb6666d5-d22d-404b-97c4-34be40946f90")
public class AlternativeStructuralVariation extends Variation {
    @objid ("eb46f8b2-f0e3-4a7c-ad2d-5791384f0690")
    public static final String STEREOTYPE_NAME = "Alternative_Structural_Variation";

    @objid ("94521e35-c080-4bc6-98f3-358db21e42ca")
    public static final String CONDITION_TAGTYPE = "Condition";

    @objid ("2a8c7ba2-8735-4565-895a-3089f65f12bc")
    public static final String TYPE_TAGTYPE = "Type";

    /**
     * Tells whether a {@link AlternativeStructuralVariation proxy} can be instantiated from a {@link MObject} checking it is a {@link Constraint} stereotyped << Alternative_Structural_Variation >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("adfea0df-2882-452c-8390-29f86382eebc")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Constraint) && ((Constraint) elt).isStereotyped(IVariabilityDesignerPeerModule.MODULE_NAME, AlternativeStructuralVariation.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Constraint} stereotyped << Alternative_Structural_Variation >> then instantiate a {@link AlternativeStructuralVariation} proxy.
     * 
     * @return a {@link AlternativeStructuralVariation} proxy on the created {@link Constraint}.
     */
    @objid ("494894cb-2fed-4315-ace8-a472c0b36020")
    public static AlternativeStructuralVariation create() {
        ModelElement e = (ModelElement)VariabilityDesignerModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Standard.Constraint");
        e.addStereotype(IVariabilityDesignerPeerModule.MODULE_NAME, AlternativeStructuralVariation.STEREOTYPE_NAME);
        return AlternativeStructuralVariation.instantiate((Constraint)e);
    }

    /**
     * Tries to instantiate a {@link AlternativeStructuralVariation} proxy from a {@link Constraint} stereotyped << Alternative_Structural_Variation >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Constraint
     * @return a {@link AlternativeStructuralVariation} proxy or <i>null</i>.
     */
    @objid ("10315351-5f4c-495b-8baa-0814ae6c1d19")
    public static AlternativeStructuralVariation instantiate(final Constraint obj) {
        return AlternativeStructuralVariation.canInstantiate(obj) ? new AlternativeStructuralVariation(obj) : null;
    }

    /**
     * Tries to instantiate a {@link AlternativeStructuralVariation} proxy from a {@link Constraint} stereotyped << Alternative_Structural_Variation >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Constraint}
     * @return a {@link AlternativeStructuralVariation} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("27c8ce08-868d-4e63-98f1-d9ec67e821f1")
    public static AlternativeStructuralVariation safeInstantiate(final Constraint obj) throws IllegalArgumentException {
        if (AlternativeStructuralVariation.canInstantiate(obj))
        	return new AlternativeStructuralVariation(obj);
        else
        	throw new IllegalArgumentException("AlternativeStructuralVariation: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("507fcca8-d44c-4f3e-846f-f3bd14edeeeb")
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
        AlternativeStructuralVariation other = (AlternativeStructuralVariation) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Getter for string property 'Condition'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("d9053829-e0a1-4f41-ae9b-f903da02a28b")
    public String getCondition() {
        return this.elt.getTagValue(AlternativeStructuralVariation.MdaTypes.CONDITION_TAGTYPE_ELT);
    }

    /**
     * Get the underlying {@link Constraint}. 
     * @return the Constraint represented by this proxy, never null.
     */
    @objid ("21eb3eb7-6dfe-4755-8213-500d8f7d9347")
    @Override
    public Constraint getElement() {
        return (Constraint)super.getElement();
    }

    /**
     * Getter for string property 'Type'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("2ca16dce-a283-46b4-9473-60cde82786ed")
    public String getType() {
        return this.elt.getTagValue(AlternativeStructuralVariation.MdaTypes.TYPE_TAGTYPE_ELT);
    }

    @objid ("0d9adabc-e08d-463f-bc1e-2c14881e65ed")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Setter for string property 'Condition'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("bd69034f-1e56-462f-81c5-c9ab51fcda76")
    public void setCondition(final String value) {
        this.elt.putTagValue(AlternativeStructuralVariation.MdaTypes.CONDITION_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'Type'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("a87d597c-92dd-4e07-808e-e18ec7efe29a")
    public void setType(final String value) {
        this.elt.putTagValue(AlternativeStructuralVariation.MdaTypes.TYPE_TAGTYPE_ELT, value);
    }

    @objid ("b2bdefe2-04bc-40cd-8d91-a45912a3e99c")
    protected AlternativeStructuralVariation(final Constraint elt) {
        super(elt);
    }

    @objid ("efd2261f-a089-46f7-985f-665fe60fe3dd")
    public static final class MdaTypes {
        @objid ("e6c12154-ede1-4704-bf7c-e91a523b039a")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("09472da6-f0f9-4497-9bc8-a235ed92dedd")
        public static TagType TYPE_TAGTYPE_ELT;

        @objid ("1f5c55c2-274f-4a88-bf4f-af8da9304526")
        public static TagType CONDITION_TAGTYPE_ELT;

        @objid ("c70e7e1e-c414-460f-bb50-131003d41a75")
        private static Stereotype MDAASSOCDEP;

        @objid ("ab65390d-0618-4219-be9c-5deae43652dc")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("5ba8aded-434d-4725-a22d-fb20af4073d0")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "bc83b3b7-a7bb-44f1-b3b1-8a0f60e3a7a2");
            TYPE_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "7fc513ff-2c09-4b58-a0ef-8a427170891c");
            CONDITION_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "bd0ff7fd-68d5-4591-bdb9-e901d7c78697");
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
