import acm.program.ConsoleProgram;

public class SemPrs2526 extends ConsoleProgram {
	public void run() {
		int n = readInt("Enter n: ");
		while(n < 0) {
			println("n should be >= 0");
			n = readInt("Enter n: ");
		}
		
		int m = readInt("Enter m: ");
		while(m < 0) {
			println("m should be >= 0");
			m = readInt("Enter m: ");
		}
		
		
		int gcd = gcd(n, m);
		println("GCD is: " + gcd);
		
		int lcm = lcm(n, m);
		println("LCM is: " + lcm);
	}

	private int lcm(int n, int m) {
		return n * m / gcd(n, m);
	}

	private int gcd(int n, int m) {
		for(int i = Math.min(n, m); i >= 1; i--) {
			if(n % i == 0 && m % i == 0) {
				return i;
			}
		}
		return -1;
	}
}
