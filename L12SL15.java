import acm.program.ConsoleProgram;

//String operations

public class L12SL15 extends ConsoleProgram {
	public void run() {
		String text = "I am Starboy!";
		
		// print the length
		println(text.length());
		
		// print first letter
		char firstSymbol = text.charAt(0);
		println("Fisrt symbol is: " + firstSymbol);
		
		// printline each symbol
		for (int i = 0; i < text.length(); i++) {
			println(text.charAt(i));
		}
	}
}
