import acm.program.ConsoleProgram;

//კონსოლიდან წაიკითხეთ ნამდვილი რიცხვი და დაბეჭდეთ მისი მთელი ნაწილი და მისი 
//წილადი ნაწილი. მაგალითად მომხმარებელმა თუ შეიყვანა 3.14 თქვენმა პროგრამამ უნდა 
//დაბეჭდოს 3 და 0.14

public class Problem17 extends ConsoleProgram {
	public void run() {
		double realNumber = readDouble ("Enter Real Number: ");
		
		int wholeNumber = (int) realNumber;
		println(wholeNumber);
		
		double ggg = wholeNumber;
		println(ggg);
		double fraction = realNumber - ggg;
		println(fraction);
	}

}
