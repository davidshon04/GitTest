import java.awt.event.ComponentEvent;
import java.awt.event.ComponentListener;

import acm.graphics.GLine;
import acm.program.GraphicsProgram;

//70. მთელ ფორმაზე ბადის დახატვა, ისე რომ ფორმის ზომის ცვლილებაზე ბადის უჯრის ზომაც
//პროპორციულად იზრდებოდეს. 

public class Problem70 extends GraphicsProgram implements ComponentListener {
	
	private static final int N_Rows = 10;
	private static final int N_Columns = 10;
	
	public void init() {
		drawRows();
		drawColumns();
	}

	private void drawColumns() {
		for(int j = 0; j < N_Columns; j++){
			double xCoord = (double) getWidth() / N_Columns;
			GLine columnLine = new GLine((double) xCoord * j, 0, (double) xCoord * j, getHeight());
			add(columnLine);
		}
	}

	private void drawRows() {
		for(int i = 0; i < N_Rows; i++){
			double yCoord = (double) getHeight() / N_Rows;
			GLine rowLine = new GLine(0, (double) yCoord * i, (double) getWidth(), yCoord * i);
			add(rowLine);
		}
	}
	
	@Override
	public void componentResized(ComponentEvent e) {
		removeAll();
		drawRows();
		drawColumns();
	}

	@Override
	public void componentHidden(ComponentEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void componentMoved(ComponentEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void componentShown(ComponentEvent arg0) {
		// TODO Auto-generated method stub
		
	}
}
