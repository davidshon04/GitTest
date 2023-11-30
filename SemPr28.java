import acm.program.ConsoleProgram;

//	28. მომხმარებელს შეყავს დადებითი რიცხვები, მანამ სანამ არ შეიყვანს -1 ს, დაბეჭდეთ 
//	რაოდენობა რამდენი ლუწი რიცხვი შეყვანა მომხმარებელმა. 

public class SemPr28 extends ConsoleProgram {
	
	private static final int SENTINEL = -1;
	
	public void run() {
//		int n = readInt("Enter Number: ");
		int numEvens = 0;
		while(true) {
			int n = readInt("Enter Number: ");
			if(n == SENTINEL) {
				break;
			}
			while(n < 0) {
				println("n must be positive!");
				n = readInt("Enter Number: ");
			}
			if(n % 2 == 0) {
				numEvens += 1;
			}
		}
		println("Number of Evens is: " + numEvens);
	}

}
