import acm.graphics.GLine;
import acm.graphics.GRect;
import acm.program.GraphicsProgram;

public class SemPr12 extends GraphicsProgram{

	private static final double House_Width = 200;
	private static final double House_Height = 300;
	private static final double Window_Width = 40;
	private static final double Window_Height = 60;
	private static final double Roof_Height = 40;
	
	public void run(){
		drawHouse();
	}
	
	private void drawHouse(){
		drawWall();
		drawWindows();
		drawRoof();
//		drawDoor();
	}

	private void drawRoof() {
		double x1 = getWidth()/2-House_Width/2;
		double x2 = getWidth();
		double y1 = getHeight()/2-House_Height;
		double y2 = getHeight()/2-House_Height-Roof_Height;
		GLine line = new GLine(x1, y1, x2, y2);
		add(line);
		
	}

	private void drawWindows() {
		for (int i=0; i<2; i++){
			double x;
			int y = (int) (getHeight()-House_Height+Window_Height/2);
			if(i == 0){
				x = getWidth()/2-House_Width/2+Window_Width/2;
			}else{
				x = getWidth()/2+House_Width/2-Window_Width*3/2;
			}
			GRect window = new GRect(Window_Width, Window_Height);
			add(window, x, y);
		}
		
	}

	private void drawWall() {
		GRect wall = new GRect(House_Width, House_Height);
		double x = getWidth()/2-House_Width/2;
		double y = getHeight()-House_Height;
		add (wall, x, y);
	}
}
