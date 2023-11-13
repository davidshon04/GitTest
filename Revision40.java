import acm.graphics.GOval;
import acm.program.GraphicsProgram;

//40. წინა ამოცანის გაგრძელება, დაამატეთ ვერტიკალური კედლებიდან ასხლეტვა. ანუ ბურთი
//მოძრაობს მარცხენა კედლიდან მარჯვნივ. როგორც კი მარჯვენა კედელს დაეტაკება იმავე
//სიჩქარით უნდა გააგრძელოს მოძრაობა მაჯვენა კედლიდან მარცხნივ. როგორც კი მარცხენა
//კედელს დაეტაკება უნდა გააგრძელოს მარჯვნივ და ა.შ. უსასრულოდ.

public class Revision40 extends GraphicsProgram {
	
	private static final int DIAMETER = 50;
	private static final int VELOCITY = 3;
	private static final int PAUSE_TIME = 5;
	
	public void run() {
		GOval circle = new GOval(DIAMETER, DIAMETER);
		add(circle, 0, getHeight() / 2 - DIAMETER / 2);
		circle.setFilled(true);

		int vx = VELOCITY;
		while (true) {
			if (circle.getX() + DIAMETER > getWidth() || circle.getX() < 0) {
				vx = -vx;
			}
			circle.move(vx, 0);
			pause(PAUSE_TIME);
		}
	}
}
