import java.util.StringTokenizer;

import acm.program.ConsoleProgram;

public class TokenizerSample extends ConsoleProgram{
	public void run() {
		String text = "markoza magaria";
		StringTokenizer tokenizer = new StringTokenizer(text);
		
		while(tokenizer.hasMoreTokens()){
			String currToken = tokenizer.nextToken();
			println(currToken);
		}
	}
}
