import acm.program.ConsoleProgram;

//31. დაწერეთ პროგრამა რომელიც დაადგენს შეყვანილი რიცხვი მარტივია თუ არა 

public class Problem31 extends ConsoleProgram {
	public void run() {
		int n = readInt("Enter the Number: ");
		
		int total = 1;   //because all numbers can be divided by 1.
		for(int i = 2; i < n; i++) {
			double div1 = (double) n / i;    
			int div2 = (int) (n / i);
			if(div1 == (double) div2) {
				total += 1;
			}	
		}
		
		if(total >= 2) {
			println("Not Simple");
		} else {
			println("Simple");
		}
	}
}
