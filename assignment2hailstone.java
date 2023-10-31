import acm.program.ConsoleProgram;

public class assignment2hailstone extends ConsoleProgram {
	
	private static final int SENTINEL = 1;
	
	public void run() {
		int n = readInt("Enter a Number: ");
		
		int total = 0;
		while(true) {
			if(n % 2 == 0) {
				println(n + " is even, so I take half: " + n / 2);
				n = n / 2;
			} else {
				if(n == SENTINEL) break;
				println(n + " is odd, so I make 3n+1: " + (3 * n + 1));
				n = 3 * n + 1;
			}
			total ++;		
		}
		println("The process took " + total + " to reach " + SENTINEL);
	}
}
