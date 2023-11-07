import acm.program.ConsoleProgram;

//23. მომხმარებელს შეყავს მთელი რიცხვი n, პროგრამამ უნდა დაბეჭდოს 1 დან n მდე რიცხვების 
//ჯამი

public class SemPrs2324 extends ConsoleProgram {
	public void run() {
		int n = readInt("Enter n: ");
		
		int sum = calculateSum(n);
		println("Sum of numbers 1...n is: " + sum + ".");
		
		int numDivisors =  numberOfDivisors(n);
		println("Number of Dividors is: " + numDivisors + ".");
	}

	private int calculateSum(int n) {
		int sum = 0;
		for(int i = 1; i <= n; i++) {
			sum += i;  //sum = sum + i;
		}
		return sum;
	}
	
	private int numberOfDivisors(int n) {
		int num = 0;
		for(int i = 1; i <= n; i++) {
			if(n % i == 0) {
				num += 1;
			}
		}
		return num;
	}
}
