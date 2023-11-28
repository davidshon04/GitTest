import java.awt.Color;

import acm.graphics.GOval;
import acm.program.GraphicsProgram;

//44. მაუსის კლიკზე იმავე ადგილზე ჩნდება ბურთი და იწყებს ვარდნას ძირს, თუ მაუსს სხვა
//ადგილზე ვაკლიკებ ბურთი გადადის ახალ ადგილზე და იქედან იწყებს ვარდნას

public class Revision44 extends GraphicsProgram {
	
	private GOval ball;
	private static int vy = 2;
	private static int DELAY = 10;
	
	public void run() {
		ball = createGravityBall();
	//	addMouseListeners();
	}

	private GOval createGravityBall() {
		ball = new GOval(40, 40);
		ball.setFilled(true);
		ball.setColor(Color.YELLOW);
		add(ball);
		ball.move(0, vy);
		pause(DELAY);
		return ball;
	}
}
