import acm.program.ConsoleProgram;

public class CharSample extends ConsoleProgram {
	public void run() {
		// determine the first symbol is a letter or not.
		String text = readLine("Enter text: ");
		char firstCh = text.charAt(0);
		if (Character.isLetter(firstCh)) {
			println("It's a letter!");
		} else {
			println("It's not a letter.");
		}
		
		// determine the symbol (if it's a letter) is uppercase or not
		if (Character.isUpperCase(firstCh)) {
			println("UpperCase");
			println(firstCh + "-->" + Character.toLowerCase(firstCh));
		} else if (Character.isLowerCase(firstCh)) {
			println("LowerCase");
			println(firstCh + "-->" + Character.toUpperCase(firstCh));
		}
	}

}
