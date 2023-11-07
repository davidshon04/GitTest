import acm.program.ConsoleProgram;

//30. მომხმარებელს შეყავს მთელი რიცხვი, დაბეჭდეთ რიცხვი რომელიც მიიღება ციფრების
//შებრუნებით, 1256 -> 6521

public class Revision30 extends ConsoleProgram {
	public void run() {
		int n = readInt("Enter number: ");
		int reversed = reverseN(n);
		println(reversed);
	}

	private int reverseN(int n) {
		int k = 0;
		while (n != 0) {
			k *= 10;
			int nashti = n - (n / 10) * 10;
			n = n / 10;
			k += nashti;
		}
		return k;
	}
}
