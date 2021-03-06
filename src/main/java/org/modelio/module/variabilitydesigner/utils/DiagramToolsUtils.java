package org.modelio.module.variabilitydesigner.utils;

import java.util.ArrayList;
import java.util.List;
import org.eclipse.draw2d.geometry.Rectangle;
import org.modelio.api.modelio.diagram.IDiagramGraphic;
import org.modelio.api.modelio.diagram.IDiagramHandle;
import org.modelio.api.modelio.diagram.IDiagramLink.LinkRouterKind;
import org.modelio.api.modelio.diagram.IDiagramLink;
import org.modelio.api.modelio.diagram.ILinkPath;
import org.modelio.api.modelio.diagram.dg.IDiagramDG;
import org.modelio.api.modelio.diagram.tools.DefaultMultiLinkTool;
import org.modelio.api.modelio.model.IModelingSession;
import org.modelio.api.modelio.model.ITransaction;
import org.modelio.api.modelio.model.IUmlModel;
import org.modelio.api.modelio.model.scope.ElementScope;
import org.modelio.metamodel.uml.infrastructure.Constraint;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.metamodel.uml.infrastructure.UmlModelElement;
import org.modelio.module.variabilitydesigner.api.IVariabilityDesignerPeerModule;

public class DiagramToolsUtils {
    public static boolean acceptElement(DefaultMultiLinkTool tool, final IDiagramHandle diagramHandle, final IDiagramGraphic targetNode) {
        ModelElement owner = null;
        
        if (targetNode instanceof IDiagramDG) {
            owner = diagramHandle.getDiagram().getOrigin();
        } else {
            owner = (ModelElement) targetNode.getElement();
        }
        
        for (ElementScope aScope : tool.getSourceScopes()) {
            if (aScope.isMatching(owner)) {
                return true;
            }
        }
        return false;
    }

    public static void constraintCreation(DefaultMultiLinkTool tool, String stereotype, final IDiagramHandle diagramHandle, final IDiagramGraphic lastNode, final List<IDiagramGraphic> otherNodes, final List<LinkRouterKind> routerKinds, final List<ILinkPath> paths, final Rectangle rectangle) {
        IModelingSession session = tool.getModule().getModuleContext().getModelingSession();
        
        try (ITransaction tr = session.createTransaction("Create variation")) {
            IUmlModel modelFactory = session.getModel();
            List<UmlModelElement> contrainedElements = new ArrayList<>();
            for (IDiagramGraphic node : otherNodes) {
                contrainedElements.add((UmlModelElement) node.getElement());
            }
        
            Constraint constraint = modelFactory.createConstraint();
            constraint.addStereotype(IVariabilityDesignerPeerModule.MODULE_NAME, stereotype);
            constraint.setName("variation");
            constraint.getConstrainedElement().addAll(contrainedElements);
        
            int i = 0;
        
            List<IDiagramGraphic> graph = diagramHandle.unmask(constraint, rectangle.x, rectangle.y);
            for (IDiagramGraphic iDiagramGraphic : graph) {
                if (iDiagramGraphic instanceof IDiagramLink) {
                    IDiagramLink link = (IDiagramLink) iDiagramGraphic;
                    if (i < routerKinds.size()) {
                        link.setRouterKind(routerKinds.get(i));
                    }
                    if (i < paths.size()) {
                        link.setPath(paths.get(i));
                    }
        
                    i++;
                }
            }
            diagramHandle.save();
            tr.commit();
        } catch (Exception e) {
            tool.getModule().getModuleContext().getLogService().error(e);
        }
    }

}
