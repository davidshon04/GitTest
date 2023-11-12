import acm.program.ConsoleProgram;
import acm.util.RandomGenerator;

//37. რულეტკა, მომხმარებელს შეყავს 0 დან 36 მდე რიცხვი, შემდეგ ხდება რულეტკის
//დატრიალების სიმულაცია, კონსოლში უნდა დაიბეჭდოს ამოსული რიცხვი და მოიგო თუ არა
//დადებულმა რიცხვმა

public class Revision37 extends ConsoleProgram {
	
	RandomGenerator rgen = RandomGenerator.getInstance();
	
	public void run() {
		while(true){
		int n = readInt("Enter Number between 0 and 36: ");
		while(n < 0 || n > 36) {
			n = readInt("Enter Number between 0 and 36: ");
		}
		
		int roulette = rouletteSimulation();
		println("The winning number is: " + roulette);
		
		if (n == roulette) {
			println("Winner!");
		} else {
			println("Loser!");
		}
	}
	}
	private int rouletteSimulation() {
		int rouletteNumber = rgen.nextInt(0, 36);
		return rouletteNumber;
	}
}
