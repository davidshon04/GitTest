import acm.program.ConsoleProgram;

//48. კონსოლიდან შეგყვავს ტექსტი პროგრამამ უნდა დაბეჭდოს სტატისტიკა რომელი სიმბოლო
//რამდენჯერ გვხვდება

public class Problem48 extends ConsoleProgram {
	public void run() {
		String text = "mariami";
		printCharStatistics(text);
	}

	private void printCharStatistics(String text) {
		for (int i = 0; i < text.length(); i++) {
			char currCh = text.charAt(i);
			if (isFirstOccurence(text, i)) {
				int count = countSymbol(text, currCh);
				println(currCh + ": " + count);
			}
		}
	}

	private boolean isFirstOccurence(String text, int index) {
		return text.indexOf(text.charAt(index)) == index;
//		if(text.indexOf(text.charAt(index)) == index) {
//			return true;
//		}
//		return false;
	}

	private int countSymbol(String text, char symbol) {
		int symbolCount = 0;
		for (int i = 0; i < text.length(); i++) {
			if (text.charAt(i) == symbol) {
				symbolCount++;
			}
		}
		return symbolCount;
	}
}
