import acm.program.ConsoleProgram;

// Create a method that tests palyndromes

public class L12SL80 extends ConsoleProgram {
	public void run() {
		while(true){
		String text = readLine("Enter text: ");
		if (isPalyndrome(text)) {
			println("Palyndrome");
		} else {
			println("just a text");
		}
		}
	}

	private boolean isPalyndrome(String text) {
		for (int i = 0; i < text.length() / 2; i++) {
			char fCh = text.charAt(i);
			char lCh = text.charAt(text.length() - i - 1);
			if (fCh != lCh) {
				return false;
			}
		}
		return true;
	}
}
