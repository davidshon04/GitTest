import java.awt.event.MouseEvent;

import acm.graphics.GOval;
import acm.program.GraphicsProgram;

//41. გააკეთეთ Paint-ის ფანქრის ანალოგიური ხელსაწყო. კერძოდ, მაუსის ყოველ მოძრაობაზე
//ეკრანზე დაამატეთ გაფერადებული წრეწირები იმავე წერტილში სადაც მაუსი მდებარეობს.

public class Revision41 extends GraphicsProgram {
	
	private GOval circle;
	private static int RADIUS = 10;
	
	public void run() {
		addMouseListeners();
	}
	
	public void mouseDragged(MouseEvent e) {
		circle = new GOval(2 * RADIUS, 2 * RADIUS);
		circle.setFilled(true);
		add(circle, e.getX() - RADIUS, e.getY() - RADIUS);
	}
}
