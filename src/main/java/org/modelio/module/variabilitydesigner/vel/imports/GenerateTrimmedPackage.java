package org.modelio.module.variabilitydesigner.vel.imports;

import java.util.Set;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.eclipse.swt.widgets.Display;
import org.modelio.api.modelio.diagram.IDiagramGraphic;
import org.modelio.api.modelio.diagram.IDiagramHandle;
import org.modelio.api.modelio.model.ITransaction;
import org.modelio.api.module.context.IModuleContext;
import org.modelio.metamodel.diagrams.AbstractDiagram;
import org.modelio.metamodel.uml.infrastructure.Dependency;
import org.modelio.metamodel.uml.infrastructure.Element;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.metamodel.uml.statik.BindableInstance;
import org.modelio.metamodel.uml.statik.Classifier;
import org.modelio.metamodel.uml.statik.Package;
import org.modelio.metamodel.uml.statik.Port;
import org.modelio.module.variabilitydesigner.api.feature.standard.class_.AlternativeFeature;
import org.modelio.module.variabilitydesigner.api.feature.standard.class_.Feature;
import org.modelio.module.variabilitydesigner.api.feature.standard.class_.MandatoryFeature;
import org.modelio.module.variabilitydesigner.api.feature.standard.class_.OptionalFeature;
import org.modelio.module.variabilitydesigner.api.feature.standard.class_.OrFeature;
import org.modelio.module.variabilitydesigner.gui.report.ReportManager;
import org.modelio.module.variabilitydesigner.gui.report.ReportModel;
import org.modelio.module.variabilitydesigner.impl.VariabilityDesignerModule;
import org.modelio.module.variabilitydesigner.impl.VariabilityDesignerPeerModule;
import org.modelio.module.variabilitydesigner.utils.uml.CompositionUMLElement;
import org.modelio.module.variabilitydesigner.utils.uml.IUMLElement;
import org.modelio.module.variabilitydesigner.utils.uml.UMLProcess;
import org.modelio.module.variabilitydesigner.utils.walkers.Walker;
import org.modelio.vcore.smkernel.mapi.MObject;

@objid ("414b431b-eaa8-42a6-84b4-9cab301a7277")
public class GenerateTrimmedPackage {
    @objid ("0f3d28dc-f92f-4606-b792-967ae1fdce01")
    public void generate(IModuleContext ctx, TrimmingData data, org.modelio.metamodel.uml.statik.Class variant) {
        Package pack = null;
        
        for(Dependency dep : variant.getDependsOnDependency()) {
            if (!(dep.isStereotyped("ModelerModule", "Trace"))
                    && (dep.getDependsOn() instanceof Package)) {
                pack = (Package) dep.getDependsOn();
            }
        }
        
        if (pack != null) {
        
            try (ITransaction tr = ctx.getModelingSession().createTransaction("clone")) {
                Package cloned = (Package) ctx.getModelioServices().getModelManipulationService().clone(pack);
                cloned.setName(variant.getName());
        
                trim(ctx, data, cloned);
        
                ReportModel rm = new ReportManager().getNewReport();
        
                check(cloned, rm);
                if (rm.isEmpty()) {
                    tr.commit();
                }else {
                    new ReportManager().showGenerationReport(Display.getCurrent().getActiveShell(), rm, ctx.getModelioServices().getNavigationService());
                    tr.rollback();
                }
            }
        
        }
    }

    @objid ("708b2340-3c7c-436d-8866-bfb7d6fa3ee7")
    public void remove(Element element, IModuleContext ctx) {
        for(AbstractDiagram diagramElement : element.getDiagramElement()) {
            IDiagramHandle diagramHandle = ctx.getModelioServices().getDiagramService().getDiagramHandle(diagramElement);
            for(IDiagramGraphic graphic : diagramHandle.getDiagramGraphics(element)) {
                try {
                    graphic.mask();
                } catch(NullPointerException e) {}
            }
        }
        element.delete();
    }

    @objid ("c8a65018-f9fc-4a9a-a381-250a91457d65")
    private void trim(IModuleContext ctx, TrimmingData data, Package cloned) {
        Set<MObject> elementsToKeep = data.getElementsToKeep();
        
        Walker<IUMLElement> walker = new Walker<>();
        walker.setProcess(new UMLProcess() {
            @Override
            public void process(MObject mobj) {
                if(mobj instanceof ModelElement) {
                    ModelElement mdElt = (ModelElement) mobj;
        
                    Boolean keep = true;
        
                    for (Dependency dep : mdElt.getDependsOnDependency()) {
                        ModelElement impacted = dep.getDependsOn();
        
                        if ((impacted instanceof Classifier)
                                && (!((Classifier) impacted).getOwnedElement().isEmpty())) {
                            keep = true;
                        }else if ((impacted.isStereotyped(VariabilityDesignerPeerModule.MODULE_NAME, MandatoryFeature.STEREOTYPE_NAME))){
                            keep = true;
                        }else if ((((impacted.isStereotyped(VariabilityDesignerPeerModule.MODULE_NAME, Feature.STEREOTYPE_NAME))
                                || (impacted.isStereotyped(VariabilityDesignerPeerModule.MODULE_NAME, OrFeature.STEREOTYPE_NAME))
                                || (impacted.isStereotyped(VariabilityDesignerPeerModule.MODULE_NAME, OptionalFeature.STEREOTYPE_NAME))
                                || (impacted.isStereotyped(VariabilityDesignerPeerModule.MODULE_NAME, AlternativeFeature.STEREOTYPE_NAME))))
                               ){
                            keep = (elementsToKeep.contains(impacted));
                        }
                    }
        
                    if (!(keep)) {
                        remove((Element) mobj, ctx);
                    }
                }
            }
        });
        
        walker.walk(new CompositionUMLElement(cloned));
    }

    @objid ("2e32a73a-f3c6-40ac-97e5-fe1c97de02df")
    private void check(Package cloned, ReportModel rm) {
        Walker<IUMLElement> walker = new Walker<>();
        walker.setProcess(new UMLProcess() {
            @Override
            public void process(MObject mobj) {
                if ((mobj instanceof BindableInstance)
                        && (!(mobj instanceof Port))){
                    BindableInstance part = (BindableInstance) mobj;
        
                    if (part.getBase() == null) {
                        MObject mo = null;
                        for ( MObject bi : VariabilityDesignerModule.getInstance().getModuleContext().getModelingSession().findByClass(part.getMClass())) {
                            if (bi.getName().equals(part.getName())
                                    && (!(bi.equals(part)))) {
                                mo = bi;
                                break;
                            }
                        }
                        if (mo != null) {
                            rm.addError("Consistency Error", (ModelElement) mo, "The " + mo.getName() + " part is not well defined regarding its type." );
                        }else {
                            rm.addError("Consistency Error", part, "The " + part.getName() + " part is not well defined regarding its type." );
                        }
                    }
                }
            }
        });
        
        walker.walk(new CompositionUMLElement(cloned));
    }

}
