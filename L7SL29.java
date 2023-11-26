import acm.program.ConsoleProgram;

// create a method to calculate two double's average

public class L7SL29 extends ConsoleProgram {
	public void run() {
		double average = calculateAverage(5.8, 67.4);
		println("Average is: " + average);
	}

	private double calculateAverage(double num1, double num2) {
		double sum = num1 + num2;
		double average = sum / 2;
		return average;
	}
}
