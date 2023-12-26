import java.util.ArrayList;
import java.util.Arrays;

import acm.program.ConsoleProgram;

//60. კონსოლიდან შეგვყავს რიცხვები მანამ სანამ არ შეიყვანთ -1-ს, დაბეჭდეთ შეყვანილი
//რიცხვები შებრუნებული მიმდევრობით.

public class Problem60 extends ConsoleProgram {
	
	private static final int SENTINEL = -1;
	
	public void run() {
		ArrayList<Integer> numberList = new ArrayList<Integer>();
		while(true) {
			int n = readInt("Enter number: ");
			if (n == SENTINEL) {
				break;
			}
			numberList.add(n);
		}
		
		int[] reversedNumbers = new int[numberList.size()];
		for (int i = 0; i < reversedNumbers.length; i++) {
			reversedNumbers[i] = numberList.get(numberList.size() - i - 1);
		}
		
		println("Reversed: " + Arrays.toString(reversedNumbers));
	}
}
