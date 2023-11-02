import acm.program.GraphicsProgram;
import acm.util.RandomGenerator;

//	34. კანვასზე დახატეთ 1000 შემთხვევითი რადიუსის მქონე შემთხვევითი ფერით გაფერადებული
//	წრე, შემთხვევით კოორდინატებზე.

public class Problem33 extends GraphicsProgram {
	
	private RandomGenerator rgen = RandomGenerator.getInstance();
	
	public void run() {
		println(rgen.nextInt());
	}
}
