import acm.program.ConsoleProgram;

//1.კონსოლიდან იკითხეთ რიცხვები, მანამ სანამ შემოსული რიცხვი არ იქნება 0. 
//0-ის შემოსვლის შემდეგ დაბეჭდეთ შემოსული რიცხვების ჯამი.

public class SemPr16 extends ConsoleProgram {

	//private static final 
	
	public void run() {
		int num = readInt ("Enter the Number: ");
		while (num != 0) {
			println (num);
		}
		
	}

}
