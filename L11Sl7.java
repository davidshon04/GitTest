import java.awt.Color;
import java.awt.event.MouseEvent;

import acm.graphics.GOval;
import acm.program.GraphicsProgram;
import acm.util.RandomGenerator;

// Hole puncher

public class L11Sl7 extends GraphicsProgram {
	
	private RandomGenerator rgen = RandomGenerator.getInstance();
	private static final int RADIUS = 15;
	
	public void run() {
		addMouseListeners();
	}
	
	public void mouseClicked(MouseEvent e) {
		GOval circle = new GOval(2 * RADIUS, 2 * RADIUS);
		circle.setFilled(true);
		Color color = rgen.nextColor();
		circle.setColor(color);
		int x = e.getX() - RADIUS;
		int y = e.getY() - RADIUS;
		add(circle, x, y);
	}

}
