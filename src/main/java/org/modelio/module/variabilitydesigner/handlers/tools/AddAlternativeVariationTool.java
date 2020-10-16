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

@objid ("17c7b606-7a33-4b15-a06f-639ed3183c4e")
public class AddAlternativeVariationTool extends DefaultMultiLinkTool {
    @objid ("7e0d89b5-faed-44ff-adc4-d98630d8831e")
    @Override
    public void actionPerformed(IDiagramHandle diagramHandle, IDiagramGraphic lastNode, List<IDiagramGraphic> otherNodes, List<LinkRouterKind> routerKinds, List<ILinkPath> paths, Rectangle rectangle) {
        DiagramToolsUtils.constraintCreation(this,VariabilityDesignerStereotypes.AlTERNATIVE_STRUCTURAL, diagramHandle, lastNode, otherNodes, routerKinds, paths, rectangle);
    }

    @objid ("e114513e-8bab-4c15-9195-53eba8edf72b")
    @Override
    public boolean acceptFirstElement(IDiagramHandle diagramHandle, IDiagramGraphic targetNode) {
        return DiagramToolsUtils.acceptElement(this, diagramHandle, targetNode);
    }

    @objid ("0a8e64df-6547-4e24-a4e8-cba3cc6195a8")
    @Override
    public boolean acceptAdditionalElement(IDiagramHandle diagramHandle, List<IDiagramGraphic> previousNodes, IDiagramGraphic targetNode) {
        return DiagramToolsUtils.acceptElement(this, diagramHandle, targetNode);
    }

    @objid ("1c230fac-b399-4548-9113-b8bf6110e5ac")
    @Override
    public boolean acceptLastElement(IDiagramHandle diagramHandle, List<IDiagramGraphic> otherNodes, IDiagramGraphic targetNode) {
        return DiagramToolsUtils.acceptElement(this, diagramHandle, targetNode);
    }

}
