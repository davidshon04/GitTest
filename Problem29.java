import acm.program.ConsoleProgram;

//29. მოხმარებელს შეყავს მთელი რიცხვი n, პროგრამამ უნდა დაბეჭდოს ფიბონაჩის მიმდევრობის 
//მე n წევრი.

public class Problem29 extends ConsoleProgram {
	public void run() {
		int n = readInt("Enter the Number: ");
		int fibonacci = fibonaccimethod(n);
	}

	private int fibonaccimethod(int n) {
		int total = 1;
		for(int i = 1; i <= n - 2; i++) {
			total += i;
		}
		return 0;
	}

}
