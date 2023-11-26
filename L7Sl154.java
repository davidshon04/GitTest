import acm.program.ConsoleProgram;

// add five method

public class L7Sl154 extends ConsoleProgram {
	public void run() {
		int x = 8;
		x = addfive(x);
		println(x);
	}

	private int addfive(int num) {
		num += 5;
		return num;
	}

}
