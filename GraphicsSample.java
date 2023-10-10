import acm.graphics.GOval;
import acm.graphics.GRect;
import acm.program.GraphicsProgram;

public class GraphicsSample extends GraphicsProgram{
	public void run(){
//		GRect myRect = new GRect(100, 200);
//		add(new GRect(100, 200), 100, 150);
//		add(new GOval(100, 200), 100, 150);
		GRect myRect = new GRect(100, 200);
		add(myRect, 100, 150);
		
//		GRect secondRect = new GRect(100, 200);
//		add(secondRect, 300, 150);
		
		myRect.setFilled(true);
		
		myRect = new GRect(100, 200);
		add(myRect, 300, 150);
		
		
		myRect.setFilled(true);
	}

}
