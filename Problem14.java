import acm.graphics.GRect;
import acm.program.GraphicsProgram;

//	14. დახატეთ რობოტის სახე ფანჯრის ცენტრში.

public class Problem14 extends GraphicsProgram{
	public void run(){
		
//ვიგებ პანელის სიგრძე-სიგანეს:
		int panelHeight = getHeight();
		int panelWidth = getWidth();
		
//ვიგებ ცენტრის კოორდინატებს:
		int middleX = panelWidth/2;
		int middleY = panelHeight/2;
		
//ვხატავ რობოტის თავს:
		GRect robotHead = new GRect (200, 200);
		add(robotHead, middleX-100, middleY-100);
	}

}
