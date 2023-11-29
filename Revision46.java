import acm.program.ConsoleProgram;

//46. დაწერეთ მეთოდი რომელსაც გადაეცემა სტიგნი და რომელიც აბრუნებს ამ სტრინგში
//ყველაზე ხშირ სიმბოლოს.

public class Revision46 extends ConsoleProgram {
	public void run() {
		String text = readLine("Enter text: ");
		
		int mostFrequent = 0;
		char freqSymb = ' ';
		for (int i = 0; i < text.length(); i++) {
			char currSymb = text.charAt(i);
			int currSymbFreq = 0;
			for (int j = 0; j < text.length(); j++) {
				if (text.charAt(j) == currSymb) {
					currSymbFreq++;
				}
			}
			if (currSymbFreq > mostFrequent) {
				mostFrequent = currSymbFreq;
				freqSymb = currSymb;
			}
		}
		
		println("most frequently used symbol is: " + freqSymb);
	}
}
