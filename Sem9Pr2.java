import acm.graphics.GLabel;
import acm.program.GraphicsProgram;

public class Sem9Pr2 extends GraphicsProgram {
	public void run() {
		int x = 4;
		GLabel label = new GLabel("x before method" + x);
		add(label, 0, 20);
	}

}
