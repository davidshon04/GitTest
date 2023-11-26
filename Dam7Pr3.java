import acm.program.ConsoleProgram;

//	კონსოლიდან შემოდის დადებითი მთელი რიცხვი. დაბეჭდეთ მისი ყველა გამყოფი.

public class Dam7Pr3 extends ConsoleProgram {
	public void run() {
		int n = readInt("Enter number: ");
		while (n <= 0) {
			n = readInt("Enter number: ");
		}
		
		int numDiv = 0;
		for (int i = 1; i <= n; i++) {
			if (n % i == 0) {
				println(i);
				numDiv++;
			}
		}
		println("The number has " + numDiv + " Divisors.");
	}
}
