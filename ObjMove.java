import java.awt.event.MouseEvent;

import acm.graphics.GObject;
import acm.graphics.GRect;
import acm.program.GraphicsProgram;

public class ObjMove extends GraphicsProgram{
	GRect rect;
	private int prevX;
	public void run() {
		rect = new GRect(50, 100);
		rect.setFilled(true);
		add(rect, 100, 100);
		addMouseListeners();
	}
	
	public void mousePressed(MouseEvent e) {
		GObject obj = getElementAt(e.getX(), e.getY());
		if(obj == rect) {
			prevX = e.getX();
		}
	}
	
	public void mouseMoved(MouseEvent e) {
		GObject obj = getElementAt(e.getX(), e.getY());
		obj = rect;
			obj.move(e.getX() - prevX, 0);
		
		prevX = e.getX();

	}
}
