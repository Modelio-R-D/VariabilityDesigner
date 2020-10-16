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

@objid ("dcaf5d20-4f02-41bc-b06a-fe3b12b37174")
public class AddAlternativeParameterVariationTool extends DefaultMultiLinkTool {
    @objid ("f9fe71c1-8afc-4742-a83a-e208239071a1")
    @Override
    public boolean acceptFirstElement(final IDiagramHandle diagramHandle, final IDiagramGraphic targetNode) {
        return DiagramToolsUtils.acceptElement(this, diagramHandle, targetNode);
    }

    @objid ("b32b363e-ab2f-4c61-bf5f-24dc0cb06af2")
    @Override
    public boolean acceptAdditionalElement(final IDiagramHandle diagramHandle, final List<IDiagramGraphic> previousNodes, final IDiagramGraphic targetNode) {
        return DiagramToolsUtils.acceptElement(this, diagramHandle, targetNode);
    }

    @objid ("21271d2d-1506-4637-bba7-ba53babf313e")
    @Override
    public boolean acceptLastElement(final IDiagramHandle diagramHandle, final List<IDiagramGraphic> otherNodes, final IDiagramGraphic targetNode) {
        return DiagramToolsUtils.acceptElement(this, diagramHandle, targetNode);
    }

    @objid ("ab13e9cc-edc1-4dc7-a98a-d7db854224dc")
    @Override
    public void actionPerformed(final IDiagramHandle diagramHandle, final IDiagramGraphic lastNode, final List<IDiagramGraphic> otherNodes, final List<LinkRouterKind> routerKinds, final List<ILinkPath> paths, final Rectangle rectangle) {
        DiagramToolsUtils.constraintCreation(this, VariabilityDesignerStereotypes.ALTERNATIVE_PARAMETER, diagramHandle, lastNode, otherNodes, routerKinds, paths, rectangle);
    }

}
