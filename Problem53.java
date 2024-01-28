import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.StringTokenizer;

import acm.program.ConsoleProgram;

//53. დაწერეთ პროგრამა რომელიც ფაილიდან წაიკითხავს ტექტს და დათვლის შემდეგ
//სტატისტიკებს: სიმბოლოების რაოდენობა, სიტყვების რაოდენობა(სიტყვები სფეისებით
//გამოყოფილია ერთმანეთისგან), წინადადებების რაოდენობა. 

public class Problem53 extends ConsoleProgram {

	private static final String FILE_NAME = "FileReadingText.java";
	
	public void run() {
		int numChars = 0;
		int numWords = 0;
		int numSentences = 0;
		
		try {
			BufferedReader rd = new BufferedReader(new FileReader(FILE_NAME));
			while (true) {
				String line = rd.readLine();
				if (line == null) {
					break;
				}
				numChars += countChars(line);
				numWords += countWords(line);
				numSentences += countSentences(line);
			}
			rd.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		println("Statistics of the given file:");
		println("There are " + numChars + " characters, " + numWords + " words and " + numSentences + " sentences.");
	}

	private int countSentences(String line) {
		int sentences = 0;
		for (int i = 0; i < line.length(); i++) {
			if (line.charAt(i) == '.' || line.charAt(i) == '!' || line.charAt(i) == '?') {
				sentences++;
			}
		}
		
		return sentences;
	}

	private int countWords(String line) {
		int words = 0;
		StringTokenizer tokenizer = new StringTokenizer(line, " ");
		while (tokenizer.hasMoreTokens()) {
			String currToken = tokenizer.nextToken();
			words++;
		}
		return words;
	}

	private int countChars(String line) {
		return line.length();
	}
}
