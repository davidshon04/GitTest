import acm.program.ConsoleProgram;

//კონსოლში შემოდის ორი რიცხვი. რიცხვების შემდეგ შემოდის ერთი სიმბოლო: “+”,” -”, “*” ან “/” . 
//იმის მიხედვით თუ რომელი სიმბოლო შემოვიდა, დაბეჭდეთ შესაბამისი ოპერაციის შედეგი

public class Dam6Pr2 extends ConsoleProgram{
	public void run() {
		int n1 = readInt("n1: ");
		int n2 = readInt("n2: ");
		
		String symbol = readLine("Enter symbol(+, -, *, /): ");
		char symb = symbol.charAt(0);
		
		if (symb == '+') {
			println(n1 + n2);
		} else if (symb == '-') {
			println(n1 - n2);
		} else if (symb == '*') {
			println(n1 * n2);
		} else if (symb == '/') {
			println((double) n1 / (double) n2);
		} else {
			println("Inapropriate symbol.");
		}
	}
}
