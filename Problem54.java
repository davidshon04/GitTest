import java.util.Arrays;

import acm.program.ConsoleProgram;

//54. კონსოლიდან შეგყვავს n და შემდეგ n ცალი მთელი რიცხვი, იპოვეთ და დაბეჭდეთ ამ
//რიცხვებს შორის ორი მაქსიმალური რიცხვი.

public class Problem54 extends ConsoleProgram {
	
	public void run() {
		int n = readInt("Enter value: ");
		int[] numbers = new int[n];
		for(int i = 0; i < numbers.length; i++) {
			int num = readInt("Enter number: ");
			numbers[i] = num;
		}
		
		Arrays.sort(numbers);
		println("Max numbers are: " + numbers[n-2] + " and " + numbers[n-1]);
	}
}
