import java.util.StringTokenizer;

import acm.program.ConsoleProgram;

//50. შეყვანილ ტექსტში დათვალეთ სიტვყების რაოდენობა, ტოკენაიზერის საშუალებით. 

public class Problem50 extends ConsoleProgram {
	public void run() {
		String text = readLine("Enter text: ");
		StringTokenizer tokenizer = new StringTokenizer(text);
		
		int wordCount = 0;
		while (tokenizer.hasMoreTokens()) {
			String currToken = tokenizer.nextToken();
			wordCount++;
		}
		println("Count: " + wordCount);
	}
}
