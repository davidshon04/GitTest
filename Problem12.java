import acm.graphics.GLine;
import acm.graphics.GRect;
import acm.program.GraphicsProgram;

public class Problem12 extends GraphicsProgram{

	//12. გრაფიკული პროგრამის გამოყენებით დახატეთ სახლი.
	
	public void run(){
		GRect myHouse = new GRect(150, 200);
		add(myHouse, 200, 200);
		
		GRect myDoor = new GRect(50, 80);
		add(myDoor, 250, 320);
		
		GRect myWindow = new GRect (50, 50);
		add(myWindow, 200, 240);
		
		myWindow = new GRect (50, 50);
		add(myWindow, 300, 240);
		
		add(new GLine (200, 200, 275, 150));
		add(new GLine (275, 150, 350, 150));
	}

}
