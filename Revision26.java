import acm.program.ConsoleProgram;

//26. მომხმარებელს შეჰყავს ორი რიცხვი თქვენმა პროგრამამ უნდა დაბეჭდოს ამ ორი რიცხვის
//უდიდესი საერთო გამყოფი

public class Revision26 extends ConsoleProgram {
	public void run() {
		int a = readInt("Enter a: ");
		int b = readInt("Enter b: ");
		int gcd = gcdCounter(a, b);
		println("GCD of the entered numbers is: " + gcd);
	}

	private int gcdCounter(int a, int b) {
		int maybeGCD = Math.min(a, b);
		for(int i = maybeGCD; i > 0; i--) {
			if(a % i == 0 && b % i == 0) {
				maybeGCD = i;
				break;
			}
		}
		return maybeGCD;
	}
}
