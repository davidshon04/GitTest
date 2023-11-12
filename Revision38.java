import acm.program.ConsoleProgram;
import acm.util.RandomGenerator;

//38. მოხმარებელს აქვს საწყისი თანხა 1000, თამაშობს მანამ სანამ არ წააგებს ყველაფერს. ყოველ
//ჯერზე შეყავს ფსონის თანხა და რიცხვი რომელზეც დებს. ხდება რულეტკის დატრიალების
//სიმულაცია(0-დან 36-მდე შემთხვევითი რიცხვი), მოგების შემთხვევაში მოთამაშეს
//უორმაგედბა დადებული თანხა წაგების შემთხვევაში კი მოთამაშე კარგავს დადებულ თანხას.
//მოთამაშე მოგებულია მაშინ თუ რულეტკაზე ამოსული რიცხვი ემთხვევა მის მიერ დადებულ
//რიცხვს. პროგრამა ყოველ მოქმედებაზე უნდა ბეჭდავდეს შესაბამის შეტყობინებას, ადვილად
//რომ გაერკვეს მოთამაშე, რა რიცხვი ამოვიდა, რამდენი წააგო, რამდენი მოიგო, რამდენი აქვს
//ბალანსი.

public class Revision38 extends ConsoleProgram {
	RandomGenerator rgen = RandomGenerator.getInstance();

	public void run() {
		int balance = 1000;
		println("The Starting Balance is: " + balance);
		while (balance > 0) {
			int betNumber = readBet();
			int betValue = readInt("Enter how much money you bet");
			while (betValue < 0 || betValue > balance) {
				betValue = readInt("Look at your Balance!");
			}

			int roulette = rouletteSimulation();
			println("The winning number is: " + roulette);

			if (betNumber == roulette) {
				println("Winner!");
				println("You won: " + 2 * betValue);
				balance += betValue;
				println("New balance is: " + balance);
			} else {
				println("Loser!");
				println("You lost: " + betValue);
				balance -= betValue;
				println("New balance is: " + balance);
			}
			println(" ");
		}
	}

	private int readBet() {
		int n = readInt("Enter Number between 0 and 36: ");
		while (n < 0 || n > 36) {
			n = readInt("Enter Number between 0 and 36: ");
		}
		return n;
	}

	private int rouletteSimulation() {
		int rouletteNumber = rgen.nextInt(0, 36);
		return rouletteNumber;
	}
}
