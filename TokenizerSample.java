import java.util.StringTokenizer;

import acm.program.ConsoleProgram;

public class TokenizerSample extends ConsoleProgram {
	public void run() {
		String text = "markoza magaria, shermadini bandzia. basri gelitaevi";
		// StringTokenizer tokenizer = new StringTokenizer(text);

		//StringTokenizer tokenizer = new StringTokenizer(text, " .,");
		
		StringTokenizer tokenizer = new StringTokenizer(text, " .,", true);

		while (tokenizer.hasMoreTokens()) {
			String currToken = tokenizer.nextToken();
			println(currToken);
		}
	}
}
