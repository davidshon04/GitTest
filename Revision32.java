import acm.program.ConsoleProgram;

//32. დაწერეთ პროგრამა რომელიც იპოვის და დაბეჭდავს 10000-მდე ყველა მერტივ რიცხვს

public class Revision32 extends ConsoleProgram {

	private static final int MAX_NUM = 10000;

	public void run() {
		for (int i = 1; i <= MAX_NUM; i++) {
			boolean isSimple = testSimple(i);
			if (isSimple) {
				println(i);
			}
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
