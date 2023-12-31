import java.awt.event.MouseEvent;

import acm.graphics.GOval;
import acm.program.GraphicsProgram;

//44. მაუსის კლიკზე იმავე ადგილზე ჩნდება ბურთი და იწყებს ვარდნას ძირს, თუ მაუსს სხვა
//ადგილზე ვაკლიკებ ბურთი გადადის ახალ ადგილზე და იქედან იწყებს ვარდნას

public class Problem44 extends GraphicsProgram {
	
	private static final int RADIUS = 50;
	private static final double V_Y = 5;
	private static final int DELAY = 20;
	GOval circle;
	
	public void run() {
		circle = new GOval(2 * RADIUS, 2 * RADIUS);
		circle.setFilled(true);
		add(circle);
		
		addMouseListeners();
		while(true) {
			circle.move(0, V_Y);
			pause(DELAY);
		}	
	}
	
	@Override
	public void mouseClicked(MouseEvent e) {
		add(circle, e.getX() - RADIUS, e.getY() - RADIUS);
	}
}
//45-48.
