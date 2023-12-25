import acm.graphics.GLine;
import acm.program.GraphicsProgram;

//21. ხაზებით ბადის დახატვა 10x10 ზე

public class Problem21 extends GraphicsProgram {
	
	private static final int N_Rows = 10;
	private static final int N_Columns = 10;
	
	public void run() {
		drawRows();
		drawColumns();
	}

	private void drawColumns() {
		for(int j = 0; j < N_Columns; j++){
			double xCoord = (double) getWidth() / N_Columns;
			GLine columnLine = new GLine(xCoord * j, 0, xCoord * j, getHeight());
			add(columnLine);
		}
	}

	private void drawRows() {
		for(int i = 0; i < N_Rows; i++){
			double yCoord = (double) getHeight() / N_Rows;
			GLine rowLine = new GLine(0, yCoord * i, getWidth(), yCoord * i);
			add(rowLine);
		}
	}
}
