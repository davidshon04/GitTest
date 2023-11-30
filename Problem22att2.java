import acm.graphics.GRect;
import acm.program.GraphicsProgram;

public class Problem22att2 extends GraphicsProgram {
	
	private static final int N_Rows = 8;
	private static final int N_Columns = 8;
	
	public void run() {
		for(int i = 0; i <= N_Rows; i++) {
			for(int j = 0; j <= N_Columns; j++){
				double squareSize = (double) getHeight() / N_Columns;
				GRect square = new GRect (squareSize, squareSize);
				double x = i * squareSize;
				double y = j * squareSize;
				square.setFilled((i+j) % 2 != 0);
				add(square, x, y);
				
			}	
		}
	}

}
