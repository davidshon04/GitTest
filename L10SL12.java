import acm.graphics.GRect;
import acm.program.GraphicsProgram;

// move rect from left to center

public class L10SL12 extends GraphicsProgram {
	
	private static final int SQ_SIZE = 100;
	private static final int DX = 3;
	private static final int DELAY = 100;
	
	public void run() {
		GRect square = createSquare();
		while (square.getX() <= (getWidth() - SQ_SIZE) / 2) {
			square.move(DX, 0);
			pause(DELAY);
		}
	}

	private GRect createSquare() {
		GRect square = new GRect(SQ_SIZE, SQ_SIZE);
		square.setFilled(true);
		double x = 0;
		double y = (getHeight() - SQ_SIZE) / 2;
		add(square, x, y);
		return square;
	}

}
