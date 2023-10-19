import acm.graphics.GLine;
import acm.program.GraphicsProgram;

//21. ხაზებით ბადის დახატვა 10x10 ზე

public class Problem21 extends GraphicsProgram {
	
	private static final int N_Rows = 10;
//	private static final int N_Columns = 10;
	
	public void run() {
	//	int i = getHeight() / N_Rows;
		for(int i = 0; i < N_Rows; i++){
			GLine rowLine = new GLine(0, i, getWidth(), i);
			add(rowLine);
		}
	}

}
