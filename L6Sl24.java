import acm.program.ConsoleProgram;

//variable love story

public class L6Sl24 extends ConsoleProgram {
	public void run() {
		boolean lookingForLove = readBoolean("Looking for love?");
		int x = 35;
		if (lookingForLove) {
			int y = 43;
			println(x + y);
		} else {
			println(x);
		}
	}

}
