import acm.program.ConsoleProgram;

// Create a method to calculate combinations

public class L8Sl5 extends ConsoleProgram {
	public void run() {
		int n = readInt("Enter number of objects in the set: ");
		int k = readInt("Enter number to be chosen: ");
		int combin = calculateFactorial(n) / (calculateFactorial(k) * calculateFactorial(n - k));
		println(combin);
	}
	
	private int calculateFactorial(int number) {
		int factorial = 1;
		for (int i = 1; i <= number; i++) {
			factorial *= i;
		}
		return factorial;
	}
}
