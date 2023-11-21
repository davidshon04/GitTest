import acm.program.ConsoleProgram;

//47. დაწერეთ პრედიკატ მეთოდი რომელსაც გადაეცემა სტრინგი და რომელიც დაადგენს არის თუ
//არა მოცემული ტექსტი პალინდრომი

public class Problem47 extends ConsoleProgram {
	public void run() {
		String text = "232";
		boolean isPalindrom = isPalindrom(text);
		println(text + " is Palindrom: " + isPalindrom);
	}

	private boolean isPalindrom(String text) {
		for (int i = 0; i < text.length() / 2; i++) {
			if (text.charAt(i) != text.charAt(text.length() - i - 1)) {
				return false;
			}
		}
		return true;
	}
}
