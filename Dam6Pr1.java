import acm.program.ConsoleProgram;

//	კონსოლიდან იკითხეთ რიცხვები, მანამ სანამ შემოსული რიცხვი არ იქნება 0. 0-ის შემოსვლის შემდეგ დაბეჭდეთ შემოსული რიცხვების ჯამი

public class Dam6Pr1 extends ConsoleProgram {

	private static final int SENTINEL = 0;

	public void run() {
		int sum = 0;
		while (true) {
			int n = readInt("Enter number: ");
			if (n == SENTINEL) {
				break;
			}
			sum += n;
		}
		println("Sum is: " + sum);
	}
}
