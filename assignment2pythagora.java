import acm.program.ConsoleProgram;

public class assignment2pythagora extends ConsoleProgram {
	public void run() {
		println("Enter values to compute Pythagorean Theorem");
		int a = readInt("a: ");
		int b = readInt("b: ");
		double c = hypotenuse(a, b);
		println("c = " + c);
	}

	private double hypotenuse(int a, int b) {
		double aSquared = Math.pow(a, 2);
		double bSquared = Math.pow(b, 2);
		double sqrtC = Math.sqrt(aSquared + bSquared);
		return sqrtC;
	}
}
