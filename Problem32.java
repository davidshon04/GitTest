import acm.program.ConsoleProgram;

// 32. დაწერეთ პროგრამა რომელიც იპოვის და დაბეჭდავს 1000 მდე ყველა მერტივ რიცხვს

public class Problem32 extends ConsoleProgram {
	
	private static final int MAX_NUM = 1000;
	
	public void run() {
		for(int i = 1; i < MAX_NUM; i++) {
			if(isPrime(i)) {
				println(i);
			}
		}
	}

	private boolean isPrime(int num) {
		if(num == 1) {
			return false;
		}
		for(int i = 2; i <= Math.sqrt(num); i++) {
			if(num % i == 0) {
				return false;
			}
		}
		return true;
	}

}
