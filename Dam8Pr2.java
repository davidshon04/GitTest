import java.awt.Color;

import acm.graphics.GRect;
import acm.program.GraphicsProgram;

//დაწერეთ მეთოდი რომელიც აბრუნებს კვადრატს, როგორც ობიექტს(GRect). მეთოდს არგუმენტად გადაეცემა 3 ცვლადი: 
//გვერდის სიგრძე, ფერი, და ცვლადი რომელიც აღნიშნავს შევსებული უნდა იყოს თუ არა კვადრატი. 
//კვადრატი უნდა გამოიყურებოდეს გადმოცემული ცვლადების შესაბამისად.
//მეთოდის დაწერის შემდეგ შექმენით ობიექტი ამ მეთოდის გამოყენებით და გამოაჩინეთ ფანჯრის ცენტრში.


public class Dam8Pr2 extends GraphicsProgram {
	
	private static final int SIZE = 150;
	
	public void run() {
		GRect square = createSquare(SIZE, Color.CYAN, false);
		int x = (getWidth() - SIZE) / 2;
		int y = (getHeight() - SIZE) / 2;
		add(square, x, y);
	}

	private GRect createSquare(int i, Color color, boolean setFillness) {
		GRect square = new GRect(i, i);
		square.setFilled(setFillness);
		square.setColor(color);
		return square;
	}

}
