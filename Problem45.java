import acm.program.ConsoleProgram;

//45. მომხმარებელს კონსოლიდან შეჰყავს ტექსტი და სიმბოლო, თქვენმა პროგრამამ უნდა იპოვოს
//რამდენჯერ გვხვდება მოცემულ ტექსტში მოცემული სიმბოლო 

public class Problem45 extends ConsoleProgram {

	public void run() {
		String str = readLine("Enter text: ");
		String ch = readLine("Enter symbol: ");
		char firstChar = ch.charAt(0);

		int n = 0;
		int length = str.length();
		for (int i = 0; i < length; i++) {
			if (firstChar == str.charAt(i)) {
				n++;
			}
		}

		println(n);
	}
}
