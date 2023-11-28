import acm.graphics.GLine;
import acm.program.GraphicsProgram;

//დაწერეთ გრაფიკული პროგრამა, რომლიც ეკრანის შუაში გაავლებს ჰორიზონტალურ ხაზს. 
//ეკრანის ზომის ცვლილებისას ხაზი ყოველთვის ეკრანის შუაში უნდა იყოს, ეკრანის მთელს სიგრძეზე.

public class Dam13Pr1 extends GraphicsProgram {
	public void run() {
		GLine line = createLine();
		while(true) {
			remove(line);
			createLine();
			pause(20);
		}
	}

	private GLine createLine() {
		GLine line = new GLine(0, getHeight() / 2, getWidth(), getHeight() / 2);
		add(line);
		return line;
	}
}
