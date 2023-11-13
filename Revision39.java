import acm.graphics.GOval;
import acm.program.GraphicsProgram;

//39. დაწერეთ პროგრამა სადაც იქნება კანვასზე ბურთის მოძრაობა მარცხენა კედლის შუა
//წერტილიდან მარჯვენა კედლამდე.

public class Revision39 extends GraphicsProgram {
	
	private static final int DIAMETER = 50;
	
	public void run() {
		GOval circle = new GOval(DIAMETER, DIAMETER);
		add(circle, getWidth() / 2 - DIAMETER / 2, getHeight() / 2 - DIAMETER / 2);
		circle.setFilled(true);
		
		while (circle.getX() < getWidth() - DIAMETER) {
			circle.move(1, 0);
			pause(5);
		}
	}
}
