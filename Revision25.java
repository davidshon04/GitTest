import acm.program.ConsoleProgram;

//25. მომხმარებელს შეჰყავს ორი რიცხვი თქვენმა პროგრამამ უნდა დაბეჭდოს ამ ორი რიცხვის
//უმცირესი საერთო ჯერადი.

public class Revision25 extends ConsoleProgram {
	public void run() {
		int a = readInt("Enter a: ");
		while (a <= 0) {
			println("a should be positive!");
			a = readInt("Enter a: ");
		}

		int b = readInt("Enter b: ");
		while (b <= 0) {
			println("b should be positive!");
			b = readInt("Enter b: ");
		}
		
		int lcm = lcmCounter(a, b);
		println("LCM is: " + lcm);
	}

	private int lcmCounter(int a, int b) {
		int maybeLCM = Math.max(a, b);
		for (int i = maybeLCM; i > maybeLCM; i++) {
			if(i % a == 0 && i % b == 0) {
				maybeLCM = i;
				break;
			}
		}
		return maybeLCM;
	}
}
