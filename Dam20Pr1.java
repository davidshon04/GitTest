import java.awt.Color;
import java.awt.event.MouseEvent;

import acm.graphics.GObject;
import acm.graphics.GOval;
import acm.program.GraphicsProgram;
import acm.util.RandomGenerator;

//კანვასზე რენდომ ადგილას დახატეთ რენდომ რადიუსის რენდომ ფერით გაფერადებული წრეწირი.
//როდესაც წრეწირს მაუსს დავაქლიქებთ მან რენდომ სიჩქარით რენდომ მიმართულებით უნდა დაიწყოს მოძრაობა. 
//ყოველ ახალ ქლიქზე სიჩქარე რენდომად უნდა იცვლებოდეს. კედლებთან შეჯახებისას ბურთი უნდა ისხლიტებოდეს.

public class Dam20Pr1 extends GraphicsProgram {
	
	private RandomGenerator rgen = RandomGenerator.getInstance();
	private static final int MIN_RADIUS = 10;
	private static final int MAX_RADIUS = 60;
	private GOval circle;
	private double radius;
	private static final int V_MIN = 1;
	private static final int V_MAX = 5;
	
	public void run() {
		addMouseListeners();
		circle = createCircle();
	}
	
//	public void mouseClicked(MouseEvent e) {
//		GObject obj = getElementAt(e.getX(), e.getY());
//		int vx = rgen.nextInt(V_MIN, V_MAX);
//		int vy = rgen.nextInt(V_MIN, V_MAX);
//		if (obj != null) {
//			while (true) {
//				if (circle.getX() < 0 || circle.getX() + 2 * radius > getWidth()) {
//					vx = -vx;
//				}
//				if (circle.getY() < 0 || circle.getY() + 2 * radius > getHeight()) {
//					vy = -vy;
//				}
//				circle.move(vx, vy);
//				pause(30);
//			}
//		}
//	}

	private GOval createCircle() {
		radius = rgen.nextDouble(MIN_RADIUS, MAX_RADIUS);
		circle = new GOval(2 * radius, 2 * radius);
		circle.setFilled(true);
		Color color = rgen.nextColor();
		circle.setColor(color);
		double x = rgen.nextDouble(0.0, getWidth() - 2 * radius);
		double y = rgen.nextDouble(0.0, getHeight() - 2 * radius);
		add(circle, x, y);
		return circle;
	}
}
