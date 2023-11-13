import acm.graphics.GLine;
import acm.program.GraphicsProgram;

//დაწერეთ გრაფიკული პროგრამა, რომლიც ეკრანის შუაში გაავლებს ჰორიზონტალურ ხაზს. 
//ეკრანის ზომის ცვლილებისას ხაზი ყოველთვის ეკრანის შუაში უნდა იყოს, ეკრანის მთელს სიგრძეზე.

public class Sem13Pr1 extends GraphicsProgram {
	public void run() {
		GLine line = new GLine(0, getHeight() / 2, getWidth(), getHeight() / 2);
		add(line);
		
		while(line.getY() < getHeight() / 2) {
			line.move(0, 1);
			pause(5);
		}
	}
}
