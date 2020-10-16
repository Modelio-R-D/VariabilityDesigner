package org.modelio.module.variabilitydesigner.handlers.tools;

import java.util.List;
import org.eclipse.draw2d.geometry.Rectangle;
import org.modelio.api.modelio.diagram.IDiagramGraphic;
import org.modelio.api.modelio.diagram.IDiagramHandle;
import org.modelio.api.modelio.diagram.IDiagramLink.LinkRouterKind;
import org.modelio.api.modelio.diagram.ILinkPath;
import org.modelio.api.modelio.diagram.tools.DefaultMultiLinkTool;
import org.modelio.module.variabilitydesigner.api.VariabilityDesignerStereotypes;
import org.modelio.module.variabilitydesigner.utils.DiagramToolsUtils;

public class AddOptionalVariationTool extends DefaultMultiLinkTool {
    @Override
    public boolean acceptFirstElement(final IDiagramHandle diagramHandle, final IDiagramGraphic targetNode) {
        return DiagramToolsUtils.acceptElement(this, diagramHandle, targetNode);
    }

    @Override
    public boolean acceptAdditionalElement(final IDiagramHandle diagramHandle, final List<IDiagramGraphic> previousNodes, final IDiagramGraphic targetNode) {
        return DiagramToolsUtils.acceptElement(this, diagramHandle, targetNode);
    }

    @Override
    public boolean acceptLastElement(final IDiagramHandle diagramHandle, final List<IDiagramGraphic> otherNodes, final IDiagramGraphic targetNode) {
        return DiagramToolsUtils.acceptElement(this, diagramHandle, targetNode);
    }

    @Override
    public void actionPerformed(final IDiagramHandle diagramHandle, final IDiagramGraphic lastNode, final List<IDiagramGraphic> otherNodes, final List<LinkRouterKind> routerKinds, final List<ILinkPath> paths, final Rectangle rectangle) {
        DiagramToolsUtils.constraintCreation(this, VariabilityDesignerStereotypes.OPTIONAL_STRUCTURAL, diagramHandle, lastNode, otherNodes, routerKinds, paths, rectangle);
    }

}
