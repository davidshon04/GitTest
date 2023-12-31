import acm.graphics.GOval;
import acm.program.GraphicsProgram;

//40. წინა ამოცანის გაგრძელება, დაამატეთ ვერტიკალური კედლებიდან ასხლეტვა. ანუ ბურთი
//მოძრაობს მარცხენა კედლიდან მარჯვნივ. როგორც კი მარჯვენა კედელს დაეტაკება იმავე
//სიჩქარით უნდა გააგრძელოს მოძრაობა მაჯვენა კედლიდან მარცხნივ. როგორც კი მარცხენა
//კედელს დაეტაკება უნდა გააგრძელოს მარჯვნივ და ა.შ. უსასრულოდ.

public class Problem40 extends GraphicsProgram {
	private static final int PAUSE_ME = 5;
	private static final int INITIAL_VELOCITY = 5;
	private static final int RADIUS = 50;
	
	public void run() {
		GOval circle = createInitialCircle();
		int vx = INITIAL_VELOCITY;
		int vy = 0;
		while(true) {
			if(circle.getX() >= getWidth() - 2 * RADIUS || circle.getX() < 0) {
				vx = - vx;
			} 
			circle.move(vx, vy);
			pause(PAUSE_ME);
		}
	}

	private GOval createInitialCircle() {
		GOval circle = new GOval(2 * RADIUS, 2 * RADIUS);
		circle.setFilled(true);
		int x = getWidth() / 2 - RADIUS;
		int y = getHeight() / 2 - RADIUS;
		add(circle, x, y);
		return circle;
	}
}
