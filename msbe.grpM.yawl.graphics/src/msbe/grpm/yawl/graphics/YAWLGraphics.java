package msbe.grpm.yawl.graphics;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.ecore.EClass;
import org.pnml.tools.epnk.gmf.extensions.graphics.GraphicalExtension;
import org.pnml.tools.epnk.gmf.extensions.graphics.IArcFigure;
import org.pnml.tools.epnk.gmf.extensions.graphics.IUpdateableFigure;
import org.pnml.tools.epnk.pnmlcoremodel.Arc;
import org.pnml.tools.epnk.pnmlcoremodel.Place;


import msbe.grpM.yawlpntd.yawlnet.YawlnetPackage;
import msbe.grpm.yawl.graphics.figures.YAWLArcs;
import msbe.grpm.yawl.graphics.figures.YAWLPlaces;

public class YAWLGraphics extends GraphicalExtension {

	@Override
	public List<EClass> getExtendedNetTypes() {
		ArrayList<EClass> list = new ArrayList<EClass>();
		list.add(YawlnetPackage.eINSTANCE.getYAWLNet());
		return list;
	}

	@Override
	public List<EClass> getExtendedNetObjects(EClass netType) {
		List<EClass> list = new ArrayList<EClass>();
		if (netType.equals(YawlnetPackage.eINSTANCE.getYAWLNet())) {
			list.add(YawlnetPackage.eINSTANCE.getArc());	
			list.add(YawlnetPackage.eINSTANCE.getPlace());
			list.add(YawlnetPackage.eINSTANCE.getTransition());
		}
		return list;
	}

	@Override
	public IArcFigure createArcFigure(Arc arc) {
		if (arc instanceof msbe.grpM.yawlpntd.yawlnet.Arc){
			return new YAWLArcs((msbe.grpM.yawlpntd.yawlnet.Arc) arc);	
		}
		return null;
	}
	
	@Override
	public IUpdateableFigure createPlaceFigure(Place place) {
		if (place instanceof msbe.grpM.yawlpntd.yawlnet.Place) {
			return new YAWLPlaces((msbe.grpM.yawlpntd.yawlnet.Place) place);
		}
		return null;
	}
	
}
//test

