import acm.program.ConsoleProgram;

//16. მოხმარებელს შეყავს მთელი რიცხვი n, a, q, პროგრამამ უნდა დაბეჭდოს გეომეტრიული პროგრესიის პირველი n ცალი წევრი. 
//a არის გეომეტრიული პროგრესიის პირველი წევრი, ხოლო q გეომეტიული მნიშვნელი. (Practice16)
//Tags: Math, Sequence

public class PP16 extends ConsoleProgram {
	public void run() {
		int n = readInt("Enter number: ");
		int a = readInt("Enter number: ");
		int q = readInt("Enter number: ");

		for(int i = 0; i < n; i++) {
			println("number " + (i+1) + " = " + a * Math.pow(q, i));
		}
	}
	
}
