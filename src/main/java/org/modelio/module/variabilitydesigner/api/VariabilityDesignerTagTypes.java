package org.modelio.module.variabilitydesigner.api;

import org.modelio.metamodel.uml.infrastructure.Constraint;
import org.modelio.module.variabilitydesigner.impl.VariabilityDesignerPeerModule;

public class VariabilityDesignerTagTypes {
    public static final String VARIATION_POINT_ID = "Variation_Point_ID";

    public static final String VARIATION_EXPRESSION_TYPE = "Type";

    public static final String VARIATION_EXPRESSION_VALUE = "Expression";

    public static final String VARIATION_CONDITION_VALUE = "Condition";

    public static final String VARIATION_VALUE = "Value";

    public static final String VARIATION_APPLIED_ON = "Applied_on";

//------------------------------------//
    public static final String getVariationPointID(Constraint element) {
        return element.getTagValue(VariabilityDesignerPeerModule.MODULE_NAME, VARIATION_POINT_ID);
    }

    public static final String getVariationExpressionType(Constraint element) {
        return element.getTagValue(VariabilityDesignerPeerModule.MODULE_NAME, VARIATION_EXPRESSION_TYPE);
    }

    public static final String getVariationExpressionValue(Constraint element) {
        return element.getTagValue(VariabilityDesignerPeerModule.MODULE_NAME, VARIATION_EXPRESSION_VALUE);
    }

    public static final String getVariationConditionValue(Constraint element) {
        return element.getTagValue(VariabilityDesignerPeerModule.MODULE_NAME, VARIATION_CONDITION_VALUE);
    }

    public static final String getVariationValue(Constraint element) {
        return element.getTagValue(VariabilityDesignerPeerModule.MODULE_NAME, VARIATION_VALUE);
    }

    public static final String getVariationAppliedOn(Constraint element) {
        return element.getTagValue(VariabilityDesignerPeerModule.MODULE_NAME, VARIATION_APPLIED_ON);
    }


//------------------------------------//
}
