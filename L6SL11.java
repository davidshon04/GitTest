import acm.program.ConsoleProgram;

// enter number, program says whether it is zero, positive or negative

public class L6SL11 extends ConsoleProgram {
	public void run() {
		int n = readInt("Enter number: ");
		if (n == 0) {
			println("The number is zero");
		} else if (n > 0) {
			println("The number isn't zero");
			println("The number is positive Integer");
		} else {
			println("The number isn't zero");
			println("The number is negative Integer");
		}
	}
}
