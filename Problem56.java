import java.util.Arrays;

import acm.program.ConsoleProgram;

//56. კონსოლიდან შეგყვავს n და შემდეგ n ცალი მთელი რიცხვი, დაალაგეთ რიცხვები
//ზრდადობით და დაბეჭდეთ.

public class Problem56 extends ConsoleProgram {
	public void run() {
		int n = readInt("Enter value: ");
		int[] numbers = new int[n];
		for(int i = 0; i < numbers.length; i++) {
			int num = readInt("Enter number: ");
			numbers[i] = num;
		}
		Arrays.sort(numbers);
		println(Arrays.toString(numbers));
	}
}
