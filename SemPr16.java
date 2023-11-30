import acm.program.ConsoleProgram;

//1.კონსოლიდან იკითხეთ რიცხვები, მანამ სანამ შემოსული რიცხვი არ იქნება 0. 
//0-ის შემოსვლის შემდეგ დაბეჭდეთ შემოსული რიცხვების ჯამი.

public class SemPr16 extends ConsoleProgram {

	private static final int Sentinel = 0;
	
	public void run() {
		println ("This Program will add numbers after you enter Zero");
		
		int total = 0;
		while(true) {
			int num = readInt("Enter the Number: ");
			if(num == Sentinel) break; 
				total += num;	
		}
		println("The Total is: " + total + ".");
		
	}

}
