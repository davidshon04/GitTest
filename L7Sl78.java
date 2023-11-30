import acm.program.ConsoleProgram;

// you get two numbers, return larger

public class L7Sl78 extends ConsoleProgram {
	public void run() {
		int n1 = readInt("n1: ");
		int n2 = readInt("n2: ");
		int larger = returnLarger(n1, n2);
		println(larger);
	}

	private int returnLarger(int n1, int n2) {
		if (n1 >= n2) {
			return n1;
		} else {
			return n2;
		}
	}
}
