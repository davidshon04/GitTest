import java.awt.Color;

import acm.graphics.GOval;
import acm.program.GraphicsProgram;
import acm.util.RandomGenerator;

//გრაფიკულ პროგრამაში შექმენით რანდომ ფერის ბურთი, რომელიც დამატებულია ეკრანის ცენტრში. 
//ბურთს მოძრაობა დააწყებინეთ რანდომ მიმართულებით. კედლებთან დაჯახებისას ბურთი უნდა ირეკლებოდეს.

public class Dam13Pr3 extends GraphicsProgram {

	private RandomGenerator rgen = RandomGenerator.getInstance();
	private static final int DIAMETER = 40;
	GOval circle;

	public void run() {
		createCircle();
		int vx = rgen.nextInt(2, 5);
		int vy = rgen.nextInt(3, 7);

		while (true) {
			if (circle.getY() + DIAMETER > getHeight() || circle.getY() < 0) {
				vy = -vy;
			}
			if (circle.getX() < 0 || circle.getX() + DIAMETER > getWidth()) {
				vx = -vx;
			}
			circle.move(vx, vy);
			pause(20);
		}
	}

	private GOval createCircle() {
		circle = new GOval(DIAMETER, DIAMETER);
		circle.setFilled(true);
		Color color = rgen.nextColor();
		circle.setColor(color);
		int x = (getWidth() - DIAMETER) / 2;
		int y = (getHeight() - DIAMETER) / 2;
		add(circle, x, y);
		return circle;
	}
}
