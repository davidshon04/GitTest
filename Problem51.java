import acm.program.ConsoleProgram;

//51. დაწერეთ მეთოდი რომელიც გადაცემული ტექსტიდან შლის დუბლირებულ სიმბოლოებს, 
//ანუ თუ ტექსტიში რომელიმე სიმბოლო მეორდება, უნდა დარჩეს მხოლოდ ყველაზე მარცხენა.

public class Problem51 extends ConsoleProgram {
	public void run() {
		String text = readLine("Enter text: ");
		String replaced = removeDuplicates(text);
		println(replaced);
	}
	
	private String removeDuplicates(String text) {
//		println(text.replace("ri", "RI"));
		String result = "";
		for (int i = 0; i < text.length(); i++) {
			char ch = text.charAt(i);
//			if (text.indexOf(ch) == i) {	//first occurence
			if (!result.contains("" + ch)) {
				result += ch;
			}
		}
		return result;
	}
}
