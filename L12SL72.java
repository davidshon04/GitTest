import acm.program.ConsoleProgram;

//Reverse a String

public class L12SL72 extends ConsoleProgram {
	public void run() {
		String text = readLine("Enter text: ");

		String reversed = "";
		for (int i = text.length(); i > 0; i--) {
			char ch = text.charAt(i - 1);
			reversed += ch;
		}
		println(reversed);
	}
}
