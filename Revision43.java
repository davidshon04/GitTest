import java.awt.Color;
import java.awt.event.MouseEvent;

import acm.graphics.GObject;
import acm.graphics.GOval;
import acm.program.GraphicsProgram;

//43. წრეწირის drag ით გადაადგილება

public class Revision43 extends GraphicsProgram {
	
	private GOval circle;
	private int prevX;
	private int prevY;
	
	public void run() {
		addCircle();
		addMouseListeners();
	}
	
	public void mousePressed(MouseEvent e) {
		GObject obj = getElementAt(e.getX(), e.getY());
		if (obj != null) {
			prevX = e.getX();
			prevY = e.getY();
		}		
	}
	
	public void mouseDragged(MouseEvent e) {
		GObject obj = getElementAt(e.getX(), e.getY());
		if (obj != null) {
			obj.move(e.getX() - prevX, e.getY() - prevY);
		}
	}

	private GOval addCircle() {
		circle = new GOval (50, 50);
		circle.setFilled(true);
		circle.setColor(Color.ORANGE);
		add(circle);
		return circle;
	}
	
	
}
