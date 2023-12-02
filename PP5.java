import acm.program.ConsoleProgram;

// დაწერეთ მეთოდი, რომელსაც გადაეცემა ორი სტრინგი და აბრუნებს ეს სტრინგები ერთმანეთის ანაგრამები არის თუ არა. 
// (ანუ ერთი სტრინგი მიიღება თუ არა მეორეში ასოების გადალაგების შედეგად) (Practice05)
//მაგ: ( “i have A pEN.” , “i evah A NEp.”) -> true  ( “i have A pEN.” , “i evaheeA NE.”) -> false
//Tags: String, Anagrams, RearrangeCharacters, CountCharacters

public class PP5 extends ConsoleProgram {
	public void run() {
		String text1 = readLine("Enter text: ");
		String text2 = readLine("Enter text: ");
		if (anagramTest(text1, text2)) {
			println("The above strings are anagrams.");
		} else {
			println("The above strings are not anagrams.");
		}

	}

	private boolean anagramTest(String text1, String text2) {
		for (int i = 0; i < text1.length(); i++) {
			char ch = text1.charAt(i);
			int numCh = 0;
			if (isFirstOccurence(ch, text1, i)) {
				for (int j = 0; j < text1.length(); j++) {
					if (text1.charAt(i) == ch) {
						numCh++;
					}
				}
			}
			if (text2.contains("" + ch)) {
				for (int k = 0; k < text2.length(); k++) {
					if (text2.charAt(k) == ch) {
						numCh--;
					}
				}
			}
			if (numCh != 0) {
				return false;
			}
		}
		return true;
	}

	private boolean isFirstOccurence(char ch, String text1, int i) {
		if(text1.indexOf(ch) == i) {
			return true;
		}
		return false;
	}
}
