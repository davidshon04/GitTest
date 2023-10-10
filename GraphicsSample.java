import java.awt.Color;

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
		
//		myRect.setFilled(true);
		
		GRect oldRect = myRect;
		myRect = new GRect(100, 200);
		add(myRect, 100, 250);
		
		
		myRect.setFilled(true);
		oldRect.setFilled(true);
		oldRect.setColor(Color.GREEN);
	}

}
