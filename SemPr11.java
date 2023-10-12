import acm.graphics.GLine;
import acm.graphics.GRect;
import acm.program.GraphicsProgram;

public class SemPr11 extends GraphicsProgram{
	
	public void run(){
		drawMidLine();
	}
	
	private void drawMidLine(){
		double x1 = 0;
		double x2 = getWidth();
		double y1 = getHeight()/2;
		double y2 = getHeight()/2;
		GLine line = new GLine(x1, y1, x2, y2);
		add(line);
	}
//	private static final int width = 200;
//	
//	public void run(){
//		int width = 100;
//		width = width+20;
//		width = 200;
//		
//		GRect rect = new GRect(width, width, width, width);
//		add(rect);
//	}
//
//	private void testVoid(){
//		
//	}
}
