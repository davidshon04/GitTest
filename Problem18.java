import acm.program.ConsoleProgram;

//18. კონსოლიდან წაიკითხეთ ორი მთელი რიცხვი და დაბეჭდეთ მათ შორის მაქსიმალური.

public class Problem18 extends ConsoleProgram {
	public void run() {
		int num1 = readInt("Enter First Number: ");
		int num2 = readInt("Enter Second Number: ");
		
		if(num1 > num2) {
			println("Max Number is: " + num1 + ".");
		} else if(num2 > num1) {
			println("Max Number is: " + num2 + ".");
		} else {
			println("These Numbers are Equal.");
		}
	}
	
}
