import acm.program.ConsoleProgram;

//20. კონსოლიდან წაიკითხეთ n, შემდეგ წაიკითხეთ n ცალი მთელი რიცხვი და დაბეჭდეთ ჯამი

public class Problem20 extends ConsoleProgram {
	public void run() {
		int n = readInt ("Enter the Number: ");
		
		int total = 0;
		for(int i = 1; i <= n; i++){
			int numbers = readInt ("Enter Assembly " + i + ":");
			total += numbers;
		}
		println ("The Sum is: " + total + ".");
	}

}
