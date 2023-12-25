import acm.program.ConsoleProgram;

//კონსოლიდან შემოდის ტექსტი. დაბეჭდეთ True თუ ტექსტში არსებული ყველა lowercase ინგლისური ასო ზრდადობით არის დალაგებული, False თუ არაა. 
//ტექსტში სხვა სიმბოლოებიც შეიძლება შეგხვდეთ და იმათ ყურადღება არ მიაქციოთ.  
//მაგ: “a bcAAA!” -> true, “” -> true “ABCDz,a” -> false (Practice02)
//Tags: String, char, charOperations, isLowerCase 

public class PP2 extends ConsoleProgram {
	public void run() {
		String text = readLine("Enter text: ");
		boolean lowerCaseTest = testText(text);
		println(lowerCaseTest);
	}

	
	//	DabcRd
	private boolean testText(String text) {
		int ch0 = 1;
		char ch1 = (char) ch0;
		char ch2 = ' ';
		for (int i = 0; i < text.length(); i++) {
			if (Character.isLowerCase(text.charAt(i))) {
				ch2 = text.charAt(i);
				if (ch2 < ch1) {
					return false;
				} else {
					ch1 = ch2;
				}
			}
		}
		return true;
	}
}
