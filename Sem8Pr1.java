import acm.program.ConsoleProgram;

// კონსოლიდან იკითხეთ რიცხვები, მანამ სანამ შემოსული რიცხვი არ იქნება 0. 
// 0-ის შემოსვლის შემდეგ დაბეჭდეთ შემოსული რიცხვების ჯამი.

public class Sem8Pr1 extends ConsoleProgram {
	
	private static final int Sentinel = 0;
	
	public void run(){
		int total = 0;
		
		while(true) {
			int num = readInt("Enter Number: ");
			if(num == Sentinel) break;
				total += num;
		}
		
		println(total);
	}
}
