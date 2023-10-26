import acm.program.ConsoleProgram;

//27. მომხმარებელს შეყავს n და m დაბეჭდეთ n^m 

public class Problem27 extends ConsoleProgram {
	public void run() {
		int n = readInt("Enter n: ");
		int m = readInt("Enter m: ");
		int powered = powerNM(n, m);
		
		println("n^m is: " + powered + ".");
	}

	private int powerNM(int n, int m) {
		int total = n;
		for(int i = 1; i < m; i++) {
			total *= n;
		}
		return total;
	}
	
}
