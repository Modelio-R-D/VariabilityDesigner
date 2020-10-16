package org.modelio.module.variabilitydesigner.handlers.tools;

import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.eclipse.draw2d.geometry.Rectangle;
import org.modelio.api.modelio.diagram.IDiagramGraphic;
import org.modelio.api.modelio.diagram.IDiagramHandle;
import org.modelio.api.modelio.diagram.IDiagramLink.LinkRouterKind;
import org.modelio.api.modelio.diagram.ILinkPath;
import org.modelio.api.modelio.diagram.tools.DefaultMultiLinkTool;
import org.modelio.module.variabilitydesigner.api.VariabilityDesignerStereotypes;
import org.modelio.module.variabilitydesigner.utils.DiagramToolsUtils;

@objid ("c0a0a823-2a37-4443-ba74-bf0a52599a55")
public class AddCalculatedParameterVariationTool extends DefaultMultiLinkTool {
    @objid ("304e5b3e-d75b-4934-8f18-68268f50984f")
    @Override
    public void actionPerformed(IDiagramHandle diagramHandle, IDiagramGraphic lastNode, List<IDiagramGraphic> otherNodes, List<LinkRouterKind> routerKinds, List<ILinkPath> paths, Rectangle rectangle) {
        DiagramToolsUtils.constraintCreation(this,VariabilityDesignerStereotypes.CALCULATED_PARAMETER, diagramHandle, lastNode, otherNodes, routerKinds, paths, rectangle);
    }

    @objid ("7b407e79-3781-47cf-b453-72ea336749df")
    @Override
    public boolean acceptFirstElement(IDiagramHandle diagramHandle, IDiagramGraphic targetNode) {
        return DiagramToolsUtils.acceptElement(this, diagramHandle, targetNode);
    }

    @objid ("65538cb3-6583-498f-a384-dd792b1c801a")
    @Override
    public boolean acceptAdditionalElement(IDiagramHandle diagramHandle, List<IDiagramGraphic> previousNodes, IDiagramGraphic targetNode) {
        return DiagramToolsUtils.acceptElement(this, diagramHandle, targetNode);
    }

    @objid ("b1376f3e-26d0-4968-a82a-dd399359fb9a")
    @Override
    public boolean acceptLastElement(IDiagramHandle diagramHandle, List<IDiagramGraphic> otherNodes, IDiagramGraphic targetNode) {
        return DiagramToolsUtils.acceptElement(this, diagramHandle, targetNode);
    }

}
