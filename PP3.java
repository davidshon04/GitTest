import java.util.StringTokenizer;

import acm.program.ConsoleProgram;

// დაწერეთ მეთოდი რომელსაც გადაეცემა ინგლისური ტექსტი, და აბრუნებს ტექსტს, რომელიც არის საწყისი ტექსტი შეცვლილი ისე, 
// რომ ყველა სიყვა დიდი ასოთი იწყებოდეს და სიტყვაში ყოველი შემდგომი ასო იყოს პატარა.  
// კონსოლიდან შემოიყვანეთ ტექსტი და დაბეჭდეთ ამ მეთოდის მიერ დაბრუნებული შედეგი. 
//მაგ: “i have A pEN.” -> “I Have A Pen” (Practice03)
//Tags: String, Tokenizer, toLowerCase, toUpperCase

public class PP3 extends ConsoleProgram {
	public void run() {
		String text = readLine("Enter text: ");
		String correction = correctText(text);
		println(correction);
	}

	private String correctText(String text) {
		String newText = "";
		StringTokenizer tok = new StringTokenizer(text);
		while (tok.hasMoreTokens()) {
			String currToken = tok.nextToken();
			String correctToken = tokenCorrector(currToken);
			newText += (correctToken + " ");
		}
		return newText.substring(0, newText.length() - 1);
	}

	private String tokenCorrector(String currToken) {
		String correctedToken = "";
		if (Character.isLowerCase(currToken.charAt(0))) {
			correctedToken += Character.toUpperCase(currToken.charAt(0));
			;
		} else {
			correctedToken += currToken.charAt(0);
		}

		for (int i = 1; i < currToken.length(); i++) {
			if (Character.isUpperCase(currToken.charAt(i))) {
				correctedToken += Character.toLowerCase(currToken.charAt(i));
				;
			} else {
				correctedToken += currToken.charAt(i);
			}
		}
		return correctedToken;
	}
}
