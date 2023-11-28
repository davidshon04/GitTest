import java.util.StringTokenizer;

import acm.program.ConsoleProgram;

//50. შეყვანილ ტექსტში დათვალეთ სიტვყების რაოდენობა, ტოკენაიზერის საშუალებით. 

public class Problem50 extends ConsoleProgram {
	public void run() {
		String text = readLine("Enter text: ");
		
//		String substr = text.substring(2, 10);
//		println(substr);
		
//		int index = text.indexOf("ari");
//		String mariWithoutM = text.substring(0, index);
		
		StringTokenizer tokenizer = new StringTokenizer(text);
		
		int wordCount = 0;
		while (tokenizer.hasMoreTokens()) {
//			String currToken = tokenizer.nextToken();
			tokenizer.nextToken();
			wordCount++;
		}
		println("Count: " + wordCount);
	}
}
