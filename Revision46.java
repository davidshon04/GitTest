import acm.program.ConsoleProgram;

//46. დაწერეთ მეთოდი რომელსაც გადაეცემა სტიგნი და რომელიც აბრუნებს ამ სტრინგში
//ყველაზე ხშირ სიმბოლოს.

public class Revision46 extends ConsoleProgram {
	public void run() {
		String text = readLine("Enter text: ");

		int mostFrequent = 0;
		char freqSymb = ' ';
		for (int i = 0; i < text.length(); i++) {
			int currSymbFreq = numOccurences(text.charAt(i), text);

			if (currSymbFreq > mostFrequent) {
				mostFrequent = currSymbFreq;
				freqSymb = text.charAt(i);
			}
		}

		println("most frequently used symbol is: " + freqSymb);
	}

	private int numOccurences(char currSymb, String text) {
		int currSymbFreq = 0;
		for (int i = 0; i < text.length(); i++) {
			if (text.charAt(i) == currSymb) {
				currSymbFreq++;
			}
		}
		return currSymbFreq;
	}
}
