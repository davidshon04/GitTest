import acm.program.ConsoleProgram;

//1.კონსოლიდან იკითხეთ რიცხვები, მანამ სანამ შემოსული რიცხვი არ იქნება 0. 
//0-ის შემოსვლის შემდეგ დაბეჭდეთ შემოსული რიცხვების ჯამი.

public class SemPr16 extends ConsoleProgram {

	private static final int Sentinel = 0;
	
	public void run() {
		println ("This Program will add numbers after you enter Zero");
		
		int num = readInt("Enter the Number: ");
		
		
		while(true){
			if(num == Sentinel) {
				int total = 0;
				total += num;
			}
			
		}
		
		
	}

}
