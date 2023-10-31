import acm.program.ConsoleProgram;

//31. დაწერეთ პროგრამა რომელიც დაადგენს შეყვანილი რიცხვი მარტივია თუ არა 

public class Problem31 extends ConsoleProgram {
	public void run() {
		int n = readInt("Enter the Number: ");
		
		for(int i = 2; i < n; i++) {
			double div1 = n / i;
			int div2 = n / i;
			
			if((int) div1 == div2) {
				println("Not Simple Number");
			} else {
				println("Simple Number");
			}
			 
		}
	}
}
