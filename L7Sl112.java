import acm.program.ConsoleProgram;

// create a method to calculate factorials

public class L7Sl112 extends ConsoleProgram {
	public void run() {
		int n = readInt("Enter number: ");
		for (int i = 0; i <= n; i++) {
			println(i + "! = " + calculateFactorial(i));
		}
	}

	private int calculateFactorial(int number) {
		int factorial = 1;
		for (int i = 1; i <= number; i++) {
			factorial *= i;
		}
		return factorial;
	}
}
