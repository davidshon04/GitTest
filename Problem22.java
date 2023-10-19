import acm.graphics.GLine;
import acm.graphics.GRect;
import acm.program.GraphicsProgram;

//22. ჭადრაკის დაფის დახატვა 8x8 ზე

public class Problem22 extends GraphicsProgram {
	
	private static final int N_Rows = 8;
	private static final int N_Columns = 8;
	 
	
	public void run(){
	//	drawRows();
	//	drawColumns();
		drawSquares();
	//	colorSquares();
	}
	
	private void drawSquares() {
		for(int j = 0; j <= N_Columns; j++) {
			for(int i = 0; i <= N_Rows; i++){
				double squareSize = (double) getHeight() / N_Columns;
				GRect square = new GRect (squareSize, squareSize);
				double x = j * squareSize;
				double y = i * squareSize;
				add(square, x, y);
			}	
		}	
	}

//	private void colorSquares() {
//		// TODO Auto-generated method stub
//		
//	}
//
//	private void drawColumns() {
//		for(int j = 0; j <= N_Columns; j++){
//			double xCoord = (double) getHeight() / N_Columns;
//			GLine columnLine = new GLine(xCoord * j, 0, xCoord * j, getHeight());
//			add(columnLine);
//		}
//	}
//
//	private void drawRows() {
//		for(int i = 0; i <= N_Rows; i++){
//			double yCoord = (double) getHeight() / N_Rows;
//			GLine rowLine = new GLine(0, yCoord * i, getHeight(), yCoord * i);
//			add(rowLine);
//		}
//	}

}
