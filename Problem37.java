import acm.program.ConsoleProgram;
import acm.util.RandomGenerator;

//	37. რულეტკა, მომხმარებელს შეყავს 0 დან 36 მდე რიცხვი, შემდეგ ხდება რულეტკის
//	დატრიალების სიმულაცია, კონსოლში უნდა დაიბეჭდოს ამოსული რიცხვი და მოიგო თუ არა
//	დადებულმა რიცხვმა

public class Problem37 extends ConsoleProgram {
	
	private static final int MIN_VALUE = 0;
	private static final int MAX_VALUE = 36;
	private RandomGenerator rgen = RandomGenerator.getInstance();
	
	public void run() {
		int betNumber = readBet();
		int rouletteNumber = spinRouletee();
		
		if(betNumber == rouletteNumber) {
			println("You won!");
		} else {
			println("You lost!");
		}
	}

	private int spinRouletee() {
		int rouletteResult = rgen.nextInt(MIN_VALUE, MAX_VALUE);
		println("Roulette result is: " + rouletteResult);
		
		return rouletteResult;
	}

	private int readBet() {
		int bet = readInt("Enter bet number(0 - 36)");
		return bet;
	}
}
