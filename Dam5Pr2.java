import java.awt.Color;

import acm.graphics.GRect;
import acm.program.GraphicsProgram;

//დახატეთ ფერადი სახლი ფანჯრის ცენტრში

public class Dam5Pr2 extends GraphicsProgram {

	private static final int HOUSE_WIDTH = 100;
	private static final int HOUSE_HEIGHT = 200;

	public void run() {
		drawHouse();

	}

	private GRect drawHouse() {
		GRect house = new GRect(HOUSE_WIDTH, HOUSE_HEIGHT);
		house.setFilled(true);
		house.setColor(Color.YELLOW);
		double x = (getWidth() - HOUSE_WIDTH) / 2;
		double y = (getHeight() - HOUSE_HEIGHT) / 2;
		add(house, x, y);
		return house;
	}

}
