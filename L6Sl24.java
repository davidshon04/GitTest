import acm.program.ConsoleProgram;

public class L6Sl24 extends ConsoleProgram {
	public void run() {
		boolean lookingForLove = readBoolean("Looking for love?", "y", "n");
		int x = 35;
		if (lookingForLove) {
			int y = 43;
			println(x + y);
		} else {
			println(x);
		}
	}

}
