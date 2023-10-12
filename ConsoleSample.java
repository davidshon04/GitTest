import acm.program.ConsoleProgram;

public class ConsoleSample extends ConsoleProgram{
	public void run(){
//		int kids = readInt("Your kids number: ");
//		
//		println("Your kids number: " + kids);
		int firstNum = readInt("Enter first number: ");
		int secondNum = readInt("Enter second number: ");
		
		int average = (firstNum+secondNum)/2;
		println(average);
	}

}
//15,16,17