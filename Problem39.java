import acm.graphics.GOval;
import acm.program.GraphicsProgram;

//39. დაწერეთ პროგრამა სადაც იქნება კანვასზე ბურთის მოძრაობა მარცხენა კედლის შუა
//წერტილიდან მარჯვენა კედლამდე.

public class Problem39 extends GraphicsProgram {
	
	private static final int RADIUS = 50;
	
	public void run() {
		int initialX = getWidth() / 2 - RADIUS;
		int initialY = getHeight() / 2 - RADIUS;
		GOval ball = new GOval(2 * RADIUS, 2 * RADIUS);
		add(ball, initialX, initialY);
		ball.setFilled(true);
		
		int finalX = getWidth() - 2 * RADIUS;
		while(initialX < finalX) {
			ball.move(1, 0);
			pause(5);
		}
		
	}
}
