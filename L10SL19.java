import acm.graphics.GOval;
import acm.program.GraphicsProgram;

// bouncing ball

public class L10SL19 extends GraphicsProgram {
	
	private static final int RADIUS = 30;
	private static final int DELAY = 10;
	
	public void run() {
		GOval ball = createBall();
		int vx = 3;
		int vy = 3;
		while (true) {
			if (ball.getY() + 2 * RADIUS > getHeight() || ball.getY() < 0) {
				vy = -vy;
			}
			if (ball.getX() < 0 || ball.getX() + 2 * RADIUS > getWidth()) {
				vx = -vx;
			}
			ball.move(vx, vy);
			pause(DELAY);
		}
	}

	private GOval createBall() {
		GOval ball = new GOval(2 * RADIUS, 2 * RADIUS);
		ball.setFilled(true);
		add(ball);
		return ball;
	}

}
