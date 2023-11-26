import acm.program.ConsoleProgram;

// write numbers which are squares

public class L7Sl161 extends ConsoleProgram {

	private static final int MAX_NUM = 300;
	
	public void run() {
		for (int i = 1; i <= MAX_NUM; i++) {
			if (isSquare(i)) {
				println(i + ", square of " + Math.sqrt(i));
			}
		}
	}

	private boolean isSquare(int i) {
		double root = Math.sqrt((double) i);
		if (root == Math.floor(root)) {
			return true;
		}
		return false;
	}
}
