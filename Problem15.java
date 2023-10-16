import acm.program.ConsoleProgram;

//15. კონსოლიდან წაიკითხეთ ორი მთელი რიცხვი და დაბეჭდეთ მათი საშუალო არითმეტიკული.

public class Problem15 extends ConsoleProgram {
	public void run() {
		int num1 = readInt("Enter First Number: ");
		int num2 = readInt("Enter Second Number: ");
		
		int sum = num1 + num2;
		double average = (double) sum / 2;
		println("The Average is " + average + ".");
	}

}
