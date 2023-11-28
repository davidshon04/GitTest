import java.awt.event.MouseEvent;

import acm.graphics.GOval;
import acm.program.GraphicsProgram;

// Hole puncher

public class L11Sl7 extends GraphicsProgram {
	
	private static final int RADIUS = 20;
	
	public void run() {
		addMouseListeners();
	}
	
	public void mouseClicked(MouseEvent e) {
		GOval circle = new GOval(2 * RADIUS, 2 * RADIUS);
		circle.setFilled(true);
		int x = e.getX() - RADIUS;
		int y = e.getY() - RADIUS;
		add(circle, x, y);
	}

}
