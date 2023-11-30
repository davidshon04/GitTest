import acm.program.ConsoleProgram;

// Caesar cipher

public class L12Sl32 extends ConsoleProgram {
	public void run() {
		String text = readLine("Enter text: ");
		int cipherKey = readInt("Enter key: ");
		
		String cipheredMessage = cipherMessage(text, cipherKey);
		println(cipheredMessage);
	}

	private String cipherMessage(String text, int cipherKey) {
		String cipheredMessage = "";
		for (int i = 0; i < text.length(); i++) {
			char Ch = text.charAt(i);
			int index = (int) Ch + cipherKey;
			cipheredMessage += (char) index;
		}
		return cipheredMessage;
	}
}
