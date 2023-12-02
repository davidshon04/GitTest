import acm.program.ConsoleProgram;

//დაწერეთ მეთოდი, რომელსაც გადმოეცემა რიცხვი და აბრუნებს ამ რიცხვის კენტ ადგილას მყოფი ციფრთა ჯამი 
//უდრის თუ არა ლუწ ადგილას მდგომ ციფრთა ჯამს.
//მაგ: 1232 -> true  1234 -> false (Practice10)
//Tags: Math, IntegerDigits

public class PP10 extends ConsoleProgram {
	public void run() {
		int num = readInt("Enter number: ");
		
	}
	
	private boolean sumsChecker(int num) {
		if (oddSum(num) == evenSum(num)) {
			return true;
		} else {
			return false;
		}
	}
}
