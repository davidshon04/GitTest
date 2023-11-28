import java.awt.Color;

import acm.graphics.GOval;
import acm.program.GraphicsProgram;

public class GravitationBouncing extends GraphicsProgram {

	private static final int DIAMETER = 50;
	private static final int INITIAL_VELOCITY = 1;
	private static final int GRAVITATION = 2;
	private static final double VY_AFTER_BOUNCING = 0.5;

	public void run() {
		GOval redBall = createRedBall();
		int vx = 3;
		int vy = INITIAL_VELOCITY;

		while (redBall.getX() + DIAMETER <= getWidth()) {
			if (redBall.getY() <= getHeight() - DIAMETER) {
				redBall.move(vx, vy);
				vy = vy + GRAVITATION;
				pause(50);
			} else {
				while (vy >= 0) {
					redBall.move(vx, -VY_AFTER_BOUNCING * vy);
					vy = vy - GRAVITATION;
					pause(50);
				}
			}
		}
	}

	private GOval createRedBall() {
		GOval redBall = new GOval(DIAMETER, DIAMETER);
		int x = 0;
		int y = 0;
		redBall.setFilled(true);
		redBall.setColor(Color.RED);
		add(redBall, x, y);
		return redBall;
	}

}
