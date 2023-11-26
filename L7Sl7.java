import acm.graphics.GRect;
import acm.program.GraphicsProgram;

// draw Checkerboard

public class L7Sl7 extends GraphicsProgram {

	private static final int N_ROWS = 8;
	private static final int N_COLUMNS = 8;

	public void run() {
		for (int i = 0; i < N_ROWS; i++) {
			for (int j = 0; j < N_COLUMNS; j++) {
				double squareWidth = getHeight() / N_ROWS;
				GRect square = new GRect(squareWidth, squareWidth);
				double x = squareWidth * j;
				double y = squareWidth * i;
				if ((i + j) % 2 != 0) {
					square.setFilled(true);
				}
				add(square, x, y);
			}
		}
	}

}
