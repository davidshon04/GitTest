import java.awt.Color;

import acm.graphics.GRect;
import acm.program.GraphicsProgram;

// draw a flag

public class L7Sl106 extends GraphicsProgram {
	public void run() {
		drawStripe(Color.RED, 0.0, 1.0 / 3);
		drawStripe(Color.WHITE, 1.0 / 3, 2.0 / 3);
		drawStripe(Color.BLUE, 2.0 / 3, 1.0);
	}

	private GRect drawStripe(Color color, double startY, double endY) {
		double yStart = getHeight() * startY;
		double yEnd = getHeight() * endY;
		GRect stripe = new GRect(getWidth(), yEnd - yStart);
		stripe.setFilled(true);
		stripe.setColor(color);
		add(stripe, 0, getHeight() * startY);
		return stripe;
	}
}
