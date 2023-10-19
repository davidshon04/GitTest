import acm.graphics.GLine;
import acm.program.GraphicsProgram;

public class SemPr21 extends GraphicsProgram {
	
	private static final int NUM_LINES = 11;
	
	public void run() {
		for (int i = 0; i < NUM_LINES; i++) {
			drawHorizontalLine(i);
		}
		
	}

	private void drawHorizontalLine(int i) {
		double y = i * ((double) getHeight() / (NUM_LINES - 1));
		double x1 = 0;
		double x2 = getWidth();
		GLine line = new GLine(x1, y, x2, y);
		add(line);
	}

}
