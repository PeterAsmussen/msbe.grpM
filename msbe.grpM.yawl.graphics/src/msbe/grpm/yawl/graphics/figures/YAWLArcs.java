package msbe.grpm.yawl.graphics.figures;

import org.eclipse.swt.SWT;
import org.pnml.tools.epnk.gmf.extensions.graphics.figures.ArcFigure;

import msbe.grpM.yawlpntd.yawlnet.AType;
import msbe.grpM.yawlpntd.yawlnet.Arc;
import msbe.grpM.yawlpntd.yawlnet.ArcType;



public class YAWLArcs extends ArcFigure{

	private enum Type {
	    Normal, Reset
	}
	
	private Type type;
	
	public YAWLArcs(Arc arc) {
		super(arc);
		type = getType();
		setGraphics();
	}
	
	
	@Override
	public void update()
	{
		Type oldType = type;
		type = getType();
		if (type != oldType) {
			setGraphics();
		}
	}
	
	private void setGraphics() {
		if (type == Type.Normal) {
			this.setLineStyle(SWT.LINE_SOLID);
		} else {
			this.setLineStyle(SWT.LINE_DASH);
		}
	}
	
	
	 
	private Type getType() {
		if (this.arc instanceof Arc) {
			ArcType arctype = ((Arc)arc).getType();
			if (arctype != null) {
				switch (arctype.getText().getValue()) {
				case AType.NORMAL_VALUE:
					return Type.Normal;
				case AType.RESET_VALUE:
					return Type.Reset;
				} 
			}
		}
		return Type.Normal;
	}

}