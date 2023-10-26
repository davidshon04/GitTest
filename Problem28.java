import acm.program.ConsoleProgram;

//28. მომხმარებელს შეყავს დადებითი რიცხვები, მანამ სანამ არ შეიყვანს -1 ს, დაბეჭდეთ 
//რაოდენობა რამდენი ლუწი რიცხვი შეყვანა მომხმარებელმა. 

public class Problem28 extends ConsoleProgram {
	public void run() {
		int total = 0;
		while(true) {
			int num = readInt("Enter Number: ");
			//if(num < -1 || num = 0) {
			if(num == -1) break;
			if(num % 2 == 0) {
				total += 1;
			}
		}
		println("The quantity of Even Numbers is: " + total + ".");
	}
}
