import acm.program.ConsoleProgram;

//Meters to cm method

public class L7Sl66 extends ConsoleProgram {
	public void run() {
		double cms = metersToCms(5.7);
		println(cms + " cm");
	}

	private double metersToCms(double d) {
		double cms = d * 100;
		return cms;
	}
}
