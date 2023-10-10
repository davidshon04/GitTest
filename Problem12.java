import acm.graphics.GRect;
import acm.program.GraphicsProgram;

public class Problem12 extends GraphicsProgram{

	//12. გრაფიკული პროგრამის გამოყენებით დახატეთ სახლი.
	
	public void run(){
		GRect myRect = new GRect(150, 200);
		add(myRect, 200, 200);
		
		add(new GRect(50, 80), 250, 320);
		add(new GRect (50, 50), 200, 240);
		add(new GRect (50, 50), 300, 240);
//		add(new GLine(), 200, )
	}

}
