import java.awt.Color;

import acm.graphics.GOval;
import acm.program.GraphicsProgram;

//გრაფიკულ პროგრამაში შექმენით წითელი ბურთი, რომელიც დამატებულია x ღერძის ცენტრში, y = 0 ზე. 
//ბურთი უნდა ემორჩილებოდეს გრავიტაციას. შემოიტანეთ რაღაც გრავიტაციული მუდმივა, რომლითაც დროის 
//ერთეულში გაზრდით ბურთის სიჩქარეს.(handouts 21-bouncing-ball-example უფრო რთული ვარიანტია 
//გარჩეული)

public class Sem13Pr2 extends GraphicsProgram {
	
	private static final int DIAMETER = 50;
	private static final int INITIAL_VELOCITY = 2;
	private static final int GRAVITATION = 3;
	
	public void run() {
		GOval redBall = createRedBall();
		int vx = 0;
		int vy = INITIAL_VELOCITY;
		
		for (int i = 0; i < getHeight() - DIAMETER; i++) {
			redBall.move(vx, vy + i * GRAVITATION);
			pause(5);
		}
	}

	private GOval createRedBall() {
		GOval redBall = new GOval(DIAMETER, DIAMETER);
		int x = getWidth() / 2;
		int y = 0;
		redBall.setFilled(true);
		redBall.setColor(Color.RED);
		add(redBall, x, y);
		return redBall;
	}
}
