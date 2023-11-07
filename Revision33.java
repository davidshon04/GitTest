import java.awt.Color;

import acm.graphics.GOval;
import acm.program.GraphicsProgram;
import acm.util.RandomGenerator;

//33. დაწერეთ პროგრამა რომელიც კანვასზე დახატავს შემთხვევითი ფერის მქონე წრეწირს, 
//რაიდიუსიც შემთხვევით აირჩეით შეზღუდული რეინჯიდან. 

public class Revision33 extends GraphicsProgram {
	
	private static final int MIN_R = 10;
	private static final int MAX_R = 100;
	private RandomGenerator rgen = RandomGenerator.getInstance();
	
	public void run() {
		int radius = rgen.nextInt(MIN_R, MAX_R);
		double x = rgen.nextDouble(0, getWidth() - 2 * radius);
		double y = rgen.nextDouble(0, getHeight() - 2 * radius);
		Color color = rgen.nextColor();
		
		GOval circle = new GOval(2 * radius, 2 * radius);
		circle.setFilled(true);
		circle.setColor(color);
		add(circle, x, y);
	}
}
