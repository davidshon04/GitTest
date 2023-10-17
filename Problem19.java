import acm.program.ConsoleProgram;

//19. კონსოლიდან წაიკითხეთ მთელი რიცხვი n და შემდეგ n ჯერ დაბეჭდეთ “hello ” + i, სადაც i 
//იცვლება 0 დან n-1 მდე.

public class Problem19 extends ConsoleProgram {
	public void run() {
		int num = readInt ("Enter a Number: ");
		
		for(int i = 0; i < num; i++) {
			println("hello" + i);
		}
	}

}

