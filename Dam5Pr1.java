import acm.graphics.GLabel;
import acm.program.GraphicsProgram;

//GraphicsProgram - ფანჯრის ცენტრში გამოიტანეთ წარწერა: "width: x, height: y"  სადაც x არის ფანჯრის სიგანე, y - სიმაღლე. 

public class Dam5Pr1 extends GraphicsProgram {
	public void run() {
		double x = getWidth();
		double y = getHeight();
		String text = "width: " + x + ", height: " + y;
		GLabel str = new GLabel(text);
		add(str, getWidth() / 2 - str.getWidth() / 2, getHeight() / 2 - str.getAscent() / 2);
	}
}
