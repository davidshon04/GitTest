import acm.program.ConsoleProgram;

//16. კონსოლიდან წაიკითხეთ სამი მთელი რიცხვი და დაბეჭდეთ მათი საშუალო ჰარმონიული. 

public class Problem16 extends ConsoleProgram {
	public void run() {
		int num1 = readInt("Enter First Number: ");
		int num2 = readInt("Enter Second Number: ");
		int num3 = readInt("Enter Third Number: ");
		
		double div1 = (double) 1 / num1;
		double div2 = (double) 1 / num2;
		double div3 = (double) 1 / num3;
		
		double divsum = div1 + div2 + div3;
		double harmonic = 1 / divsum;
		
		println("Harmonic Mean is: " + harmonic + ".");	
	}

}
