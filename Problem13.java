import acm.graphics.GLine;
import acm.program.GraphicsProgram;

//	13. დაწერეთ პროგრამა, რომლიც ეკრანის შუაში გაავლებს ჰორიზონტალურ ხაზს.

public class Problem13 extends GraphicsProgram{
	public void run(){

//	ვიგებ პანელის მაქსიმალურ კოორდინატებს:
	int panelHeight = getHeight();
	int panelWidth = getWidth();

// 	ვიგებ Y-ს შუა წერტილს:
	int middleY = panelHeight/2;
	
//	ვხაზავ ლაინს:
	add(new GLine(0, middleY, panelWidth, middleY));
	
	}
}
