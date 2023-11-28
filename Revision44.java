import java.awt.Color;
import java.awt.event.MouseEvent;

import acm.graphics.GOval;
import acm.program.GraphicsProgram;

//44. მაუსის კლიკზე იმავე ადგილზე ჩნდება ბურთი და იწყებს ვარდნას ძირს, თუ მაუსს სხვა
//ადგილზე ვაკლიკებ ბურთი გადადის ახალ ადგილზე და იქედან იწყებს ვარდნას

public class Revision44 extends GraphicsProgram {

	private GOval ball;
	private static int VY = 2;
	private static int DELAY = 10;
	private static final int RADIUS = 20;

	public void run() {
		ball = createGravityBall();
		addMouseListeners();
		while (true) {
			ball.move(0, VY);
			pause(DELAY);
		}
	}

	public void mouseClicked(MouseEvent e) {
		add(ball, e.getX() - RADIUS, e.getY() - RADIUS);
	}

	private GOval createGravityBall() {
		ball = new GOval(2 * RADIUS, 2 * RADIUS);
		ball.setFilled(true);
		ball.setColor(Color.YELLOW);
		return ball;
	}
}
