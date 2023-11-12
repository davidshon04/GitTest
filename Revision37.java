import acm.program.ConsoleProgram;

//37. რულეტკა, მომხმარებელს შეყავს 0 დან 36 მდე რიცხვი, შემდეგ ხდება რულეტკის
//დატრიალების სიმულაცია, კონსოლში უნდა დაიბეჭდოს ამოსული რიცხვი და მოიგო თუ არა
//დადებულმა რიცხვმა

public class Revision37 extends ConsoleProgram {
	public void run() {
		int n = readInt("Enter Number between 0 and 36: ");
		while(n < 0 && n > 36) {
			n = readInt("Enter Number between 0 and 36: ");
		}
	}
}
