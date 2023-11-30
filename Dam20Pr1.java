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
	private GOval circle = null;

	private static final int V_MIN = 1;
	private static final int V_MAX = 5;
	private int vx = 0;
	private int vy = 0;
	private static final int DELAY = 100;
	
	public void run() {
		addMouseListeners();
		circle = createCircle();
		
		while (true) {
			if (circle.getX() < 0 || circle.getX() + circle.getWidth() > getWidth()) {
				vx = -vx;
			}
			if (circle.getY() < 0 || circle.getY() + circle.getHeight() > getHeight()) {
				vy = -vy;
			}
			circle.move(vx, vy);
			pause(DELAY);
		}
	}
	
	@Override
	public void mouseClicked(MouseEvent e) {
		GObject obj = getElementAt(e.getX(), e.getY());
		if (obj != null) {
			vx = getRandomSpeed();
			vy = getRandomSpeed();
			Color color = rgen.nextColor();
			circle.setColor(color);
		}
	}

	private GOval createCircle() {
		double radius = rgen.nextDouble(MIN_RADIUS, MAX_RADIUS);
		circle = new GOval(2 * radius, 2 * radius);
		circle.setFilled(true);
		Color color = rgen.nextColor();
		circle.setColor(color);
		double x = rgen.nextDouble(0.0, getWidth() - 2 * radius);
		double y = rgen.nextDouble(0.0, getHeight() - 2 * radius);
		add(circle, x, y);
		return circle;
	}
	
	private int getRandomSpeed() {
		int v = rgen.nextInt(V_MIN, V_MAX);
		boolean negSpeed = rgen.nextBoolean();
		if (negSpeed) {
			v = -v;
		}
		return v;
	}
}
