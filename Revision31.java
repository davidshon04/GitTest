import acm.program.ConsoleProgram;

//31. დაწერეთ პროგრამა რომელიც დაადგენს შეყვანილი რიცხვი მარტივია თუ არა

public class Revision31 extends ConsoleProgram {
	public void run() {
		int n = readInt("Enter number: ");
		boolean isSimple = testSimple(n);
		if (isSimple) {
			println("Simple");
		} else {
			println("not Simple");
		}
	}

	private boolean testSimple(int n) {
		if (n == 1) {
			return false;
		}
		for (int i = 2; i < n; i++) {
			if (n % i == 0) {
				return false;
			}
		}
		return true;
	}
}
