import java.awt.Color;
import java.awt.event.MouseEvent;

import acm.graphics.GRect;
import acm.program.GraphicsProgram;

// create square which moves along mouse

public class L11SL31 extends GraphicsProgram {
	
	private static final int SIZE = 50;
	private GRect square;
	
	public void run() {
		square = createSquare();
		addMouseListeners();
	}
	
	public void mouseMoved(MouseEvent e) {
		double dx = e.getX()  - SIZE / 2;
		double dy = e.getY()  - SIZE / 2;
		square.move(dx, dy);
		pause(15);
		//square.getX()	square.getY()
	}

	private GRect createSquare() {
		square = new GRect(SIZE, SIZE);
		square.setFilled(true);
		square.setColor(Color.CYAN);
		add(square, (getWidth() - SIZE) / 2, (getHeight() - SIZE) / 2);
		return square;
	}
}
