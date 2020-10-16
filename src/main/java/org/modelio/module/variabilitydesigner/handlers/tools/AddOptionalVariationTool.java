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

@objid ("6da5f91b-c1cc-4dbe-a8a7-7661155a327a")
public class AddOptionalVariationTool extends DefaultMultiLinkTool {
    @objid ("8f786f15-af95-4812-959c-a422d488c2c0")
    @Override
    public boolean acceptFirstElement(final IDiagramHandle diagramHandle, final IDiagramGraphic targetNode) {
        return DiagramToolsUtils.acceptElement(this, diagramHandle, targetNode);
    }

    @objid ("5e36827c-0c93-4ed2-a298-c35248e72741")
    @Override
    public boolean acceptAdditionalElement(final IDiagramHandle diagramHandle, final List<IDiagramGraphic> previousNodes, final IDiagramGraphic targetNode) {
        return DiagramToolsUtils.acceptElement(this, diagramHandle, targetNode);
    }

    @objid ("4ab93a62-641f-464d-825e-b9d1967c4da0")
    @Override
    public boolean acceptLastElement(final IDiagramHandle diagramHandle, final List<IDiagramGraphic> otherNodes, final IDiagramGraphic targetNode) {
        return DiagramToolsUtils.acceptElement(this, diagramHandle, targetNode);
    }

    @objid ("544917ae-05c8-4c15-87b5-0a5f499225c8")
    @Override
    public void actionPerformed(final IDiagramHandle diagramHandle, final IDiagramGraphic lastNode, final List<IDiagramGraphic> otherNodes, final List<LinkRouterKind> routerKinds, final List<ILinkPath> paths, final Rectangle rectangle) {
        DiagramToolsUtils.constraintCreation(this, VariabilityDesignerStereotypes.OPTIONAL_STRUCTURAL, diagramHandle, lastNode, otherNodes, routerKinds, paths, rectangle);
    }

}
