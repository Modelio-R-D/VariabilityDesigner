package org.modelio.module.variabilitydesigner.handlers.tools;

import org.eclipse.draw2d.geometry.Point;
import org.eclipse.draw2d.geometry.Rectangle;
import org.modelio.api.modelio.diagram.IDiagramGraphic;
import org.modelio.api.modelio.diagram.IDiagramHandle;
import org.modelio.api.modelio.diagram.IDiagramLink.LinkRouterKind;
import org.modelio.api.modelio.diagram.IDiagramNode;
import org.modelio.api.modelio.diagram.ILinkPath;
import org.modelio.api.modelio.diagram.tools.DefaultAttachedBoxTool;
import org.modelio.api.modelio.model.IModelingSession;
import org.modelio.api.modelio.model.ITransaction;
import org.modelio.metamodel.uml.infrastructure.ModelTree;
import org.modelio.module.variabilitydesigner.api.feature.standard.class_.MandatoryFeature;
import org.modelio.module.variabilitydesigner.impl.VariabilityDesignerModule;
import org.modelio.vcore.smkernel.mapi.MObject;

public class MandatoryFeatureTool extends DefaultAttachedBoxTool {
    private MObject owner;

    @Override
    public boolean acceptElement(final IDiagramHandle diagramHandle, final IDiagramGraphic targetNode) {
        owner = targetNode.getElement();
        return true;
    }

    public void actionPerformed(final IDiagramHandle diagramHandle, final IDiagramGraphic parent, final Rectangle rect) {
        IModelingSession session = VariabilityDesignerModule.getInstance().getModuleContext().getModelingSession();
        try( ITransaction transaction = session.createTransaction ("Mandatory Feature")){
            MObject owner = parent.getElement();
        
            MandatoryFeature feature = MandatoryFeature.create();
            feature.getElement().setOwner((ModelTree) owner);
            feature.getElement().setName("Feature");
        
        
            for (IDiagramGraphic graph : diagramHandle.unmask (feature.getElement(), rect.x, rect.y)) {
                if ((graph.getElement().equals(feature.getClass())
                        && (graph instanceof IDiagramNode))) {
                            ((IDiagramNode)graph).setBounds(rect);
        
        //                    ((IDiagramNode)graph).setBounds(new Rectangle(rect.x + 10, rect.y + 10, rect.width, rect.height));
                }
        
        //                if (graph.getElement().equals(owner)) {
        //                    graph.setProperty("CLASS_REPRES_MODE", "SIMPLE");
        //                }
            }
        
            parent.setProperty("CLASS_REPRES_MODE", "SIMPLE");
            diagramHandle.save();
            diagramHandle.close();
            transaction.commit ();
        }
    }

    @Override
    public void actionPerformed(IDiagramHandle diagramHandle, IDiagramGraphic arg1, LinkRouterKind arg2, ILinkPath arg3, Point point) {
        IModelingSession session = VariabilityDesignerModule.getInstance().getModuleContext().getModelingSession();
        try( ITransaction transaction = session.createTransaction ("Mandatory Feature")){
        
            MandatoryFeature feature = MandatoryFeature.create();
            feature.getElement().setOwner((ModelTree) owner);
            feature.getElement().setName("Feature");
        
        
            for (IDiagramGraphic graph : diagramHandle.unmask (feature.getElement(), point.x, point.y)) {
        //                if ((graph.getElement().equals(feature.getClass())
        //                        && (graph instanceof IDiagramNode))) {
        //                            ((IDiagramNode)graph).setBounds(rect);
        
        //                    ((IDiagramNode)graph).setBounds(new Rectangle(rect.x + 10, rect.y + 10, rect.width, rect.height));
        //                }
        
        //                if (graph.getElement().equals(owner)) {
        //                    graph.setProperty("CLASS_REPRES_MODE", "SIMPLE");
        //                }
            }
        
            arg1.setProperty("CLASS_REPRES_MODE", "SIMPLE");
            diagramHandle.save();
            diagramHandle.close();
            transaction.commit ();
        }
    }

    @Override
    public void actionPerformedInDiagram(IDiagramHandle diagramHandle, Rectangle rect) {
        IModelingSession session = VariabilityDesignerModule.getInstance().getModuleContext().getModelingSession();
        try( ITransaction transaction = session.createTransaction ("Mandatory Feature")){
        
            MandatoryFeature feature = MandatoryFeature.create();
            feature.getElement().setOwner((ModelTree) owner);
            feature.getElement().setName("Feature");
        
        
            for (IDiagramGraphic graph : diagramHandle.unmask (feature.getElement(), rect.x, rect.y)) {
                if ((graph.getElement().equals(feature.getClass())
                        && (graph instanceof IDiagramNode))) {
                            ((IDiagramNode)graph).setBounds(rect);
        
        //                        ((IDiagramNode)graph).setBounds(new Rectangle(rect.x + 10, rect.y + 10, rect.width, rect.height));
                }
        
        //                    if (graph.getElement().equals(owner)) {
        //                        graph.setProperty("CLASS_REPRES_MODE", "SIMPLE");
        //                    }
            }
        
        //                owner.setProperty("CLASS_REPRES_MODE", "SIMPLE");
            diagramHandle.save();
            diagramHandle.close();
            transaction.commit ();
        }
    }

}
