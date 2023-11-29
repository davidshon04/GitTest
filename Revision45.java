import acm.program.ConsoleProgram;

//45. მომხმარებელს კონსოლიდან შეჰყავს ტექსტი და სიმბოლო, თქვენმა პროგრამამ უნდა იპოვოს
//რამდენჯერ გვხვდება მოცემულ ტექსტში მოცემული სიმბოლო

public class Revision45 extends ConsoleProgram {
	public void run() {
		String text = readLine("Enter text: ");
		String symbol = readLine("Enter symbol: ");
		char symb = symbol.charAt(0);
		
		int chFreq = 0;
		for (int i = 0; i < text.length(); i++) {
			if (text.charAt(i) == symb) {
				chFreq++;
			}
		}
		println(symb + " is used " + chFreq + " times.");
	}
}
