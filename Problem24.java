import acm.program.ConsoleProgram;

//24. მომხმარებელს შეყავს მთელი რიცხვი n, პროგრამამ უნდა დაბეჭდოს n ის გამყოფების 
//რაოდენობა

public class Problem24 extends ConsoleProgram {
	public void run() {
		int n = readInt("Enter the Number: ");
		
		int total = 1;
		for(int i = 2; i <= n; i++) {
			double div1 = n / i;
			int div2 = n / i;
			if(div1 - (double) div2 == 0.0){
				total += 1;
			}
		}
		
		println("The Number of Divisors for your Number is: " + total + ".");
	}

}
