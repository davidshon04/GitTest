import acm.program.ConsoleProgram;

//String operations

public class L12SL15 extends ConsoleProgram {
	public void run() {
		String text = "I am Starboy!";

		// print the length
		println("Length is: " + text.length());

		// print first letter
		char firstSymbol = text.charAt(0);
		println("First symbol is: " + firstSymbol);

		// printline each symbol
		println("Symbols are:");
		for (int i = 0; i < text.length(); i++) {
			println(text.charAt(i));
		}
	}
}
