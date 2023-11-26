import acm.program.ConsoleProgram;

// add two numbers from console

public class L5Sl10 extends ConsoleProgram {
	public void run() {
		println("This program adds two Integers.");
		int n1 = readInt("Enter first Integer: ");
		int n2 = readInt("Enter second Integer: ");
		int sum = n1 + n2;
		println("Sum of the Integers is: " + sum + ".");
	}
}
