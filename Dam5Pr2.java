import java.awt.Color;

import acm.graphics.GRect;
import acm.program.GraphicsProgram;

//დახატეთ ფერადი სახლი ფანჯრის ცენტრში

public class Dam5Pr2 extends GraphicsProgram {

	private static final int HOUSE_WIDTH = 150;
	private static final int HOUSE_HEIGHT = 200;
	private static final int DOOR_WIDTH = 50;
	private static final int DOOR_HEIGHT = 70;

	public void run() {
		drawHouse();
		drawDoor();

	}

	private GRect drawDoor() {
		GRect door = new GRect(DOOR_WIDTH, DOOR_HEIGHT);
		door.setFilled(true);
		door.setColor(Color.RED);
		double x = (getWidth() - DOOR_WIDTH) / 2;
		double y = (getHeight() - HOUSE_HEIGHT) / 2 + HOUSE_HEIGHT - DOOR_HEIGHT;
		add(door, x, y);
		return door;
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
