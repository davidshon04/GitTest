import acm.graphics.GRect;
import acm.program.GraphicsProgram;

public class AnimationSample extends GraphicsProgram {
	private static final int PAUSE_ME = 100;
	private static final int INITIAL_VELOCITY = 5;
	public void run() {
		GRect myRect = new GRect(100, 200);
		add(myRect, 100, 150);
//		pause(PAUSE_ME);
// 		myRect.setLocation(100, 100);
//		myRect.move(100, 100);
		
		int finalX = 200;
		int vx = INITIAL_VELOCITY;
		int vy = 0;
		while(myRect.getX() <= finalX) {
			myRect.move(vx, vy);
			pause(PAUSE_ME);
		}
	}

}
