import acm.program.ConsoleProgram;

//Meters to cm method

public class L7Sl66 extends ConsoleProgram {
	public void run() {
		println(metersToCms(5.9));
		println(metersToCms(94.5));
		println(metersToCms(0.1));
	}

	private double metersToCms(double meters) {
		double cms = meters * 100;
		return cms;
	}
}
