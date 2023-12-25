import java.util.StringTokenizer;

import acm.program.ConsoleProgram;

//დაწერეთ მეთოდი რომელსაც გადაეცემა ინგლისური ტექსტი, და აბრუნებს ტექსტს, 
//რომელიც არის საწყისი ტექსტი შეცვლილი ისე, რომ თითოეული სიყვა არის შებრუნებული.  
//კონსოლიდან შემოიყვანეთ ტექსტი და დაბეჭდეთ ამ მეთოდის მიერ დაბრუნებული შედეგი.
//ტექსტი შედგება მხოლოდ შემდეგი სიმბოლოებისგან: ინგლისური ასოები, მძიმე, წერტილი, space. (Practice04)
//მაგ:  “i have A pEN.” -> “i evah A NEp.”
//Tags: String, Tokenizer, ReverseString

public class PP4 extends ConsoleProgram {
	public void run() {
		String text = readLine("Ennter text: ");
		String correctedText = correctText(text);
		println(correctedText);
	}

	private String correctText(String text) {
		String newText = "";
		StringTokenizer tok = new StringTokenizer(text);
		while (tok.hasMoreTokens()) {
			String currToken = tok.nextToken();
			String reversed = reverseTok(currToken);
			newText += (reversed + " ");
		}
		return newText.substring(0, newText.length() - 1);
	}

	private String reverseTok(String currToken) {
		String reversed = "";
		for (int i = currToken.length() - 1; i >= 0; i--) {
			reversed += currToken.charAt(i);
		}
		return reversed;
	}
}
