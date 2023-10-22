import acm.program.ConsoleProgram;

//23. მომხმარებელს შეყავს მთელი რიცხვი n, პროგრამამ უნდა დაბეჭდოს 1 დან n მდე რიცხვების 
//ჯამი

public class Problem23 extends ConsoleProgram {
	public void run() {
		int n = readInt ("Enter the Number: ");
		
		int sum = 0;
		for(int i = 1; i <= n; i++){
			sum += i;
		}
		
		println("The Sum is: " + sum + ".");
	}

}
