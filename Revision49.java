import acm.program.ConsoleProgram;

//49. დაწერეთ stringToInteger მეთოდი, რომელსაც გადაეცემა სტრინგი და აბრუნებს მთელ რიცხვს. 
//ჩათვალეთ, რომ გადაცემული სტრინგი მხოლოდ ციფრებისგან შედგება და არ იწყება 0-ით. 
//მაგალითად “234” გადაცემის შემთხვევაში მეთოდმა უნდა დააბრუნოს 234. ასევე ჩათვალეთ, 
//რომ დაბრუნებული მნიშვნელობა დადებითია და ეტევა int-ში.

public class Revision49 extends ConsoleProgram {
	public void run() {
		String text = readLine("Enter text: ");
		int number = stringToInteger(text);
		println(number);
	}

	private int stringToInteger(String text) {
		int num = 0;
		for (int i = 0; i < text.length(); i++) {
			char ch = text.charAt(i);
			num *= 10;
			num += ch - '0';
		}
		return num;
	}
}
