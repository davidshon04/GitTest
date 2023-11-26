import acm.program.ConsoleProgram;

// create a method to calculate factorials

public class L7Sl112 extends ConsoleProgram {
	public void run() {
		int n = readInt("Enter number: ");
		int factN = calculateFactorial(n);
		
		for (int i = 0; i <= n; i++) {
			println(i + "! = " + factN);
		}
	}

	private int calculateFactorial(int n) {
		int factorial = 1;
		for (int i = 1; i <= n; i++) {
			factorial *= i;
		}
		return factorial;
	}
}
