package msbe.grpm.yawl.graphics.figures;

import org.eclipse.draw2d.Graphics;
import org.eclipse.draw2d.geometry.Rectangle;
import org.pnml.tools.epnk.gmf.extensions.graphics.figures.PlaceFigure;
import org.pnml.tools.epnk.pnmlcoremodel.Place;

public class YAWLPlaces extends PlaceFigure{

	public YAWLPlaces(Place place) {
		super(place);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	protected void fillShape(Graphics graphics) {
		super.fillShape(graphics);
		
		if (((yawlnet.Place) super.place).getType() != null){
			if(((yawlnet.Place)super.place).getType().getText().getValue() == 1){
				Rectangle rect = this.getClientArea();
				int py = rect.y + rect.height/4;
				int px = rect.x + rect.width/4;
				
				graphics.setBackgroundColor(getForegroundColor());
				graphics.setLineWidth(3);
				graphics.drawRectangle(px, py, rect.width/2, rect.height/2);
				
			}
		}
		// TODO Auto-generated method stub
		
	}
	
	@Override
	public void update() {
		
		this.repaint();
	}
	

}