import java.util.Arrays;

import acm.program.ConsoleProgram;

//55. კონსოლიდან შეგყვავს n და შემდეგ n ცალი მთელი რიცხვი, გაარკვიეთ შეყვანილი რიცხვები
//არის თუ არა ზრდადობით დალაგებული. თუკი არის დაბეჭდეთ “sorted” თუ არა მაშინ
//დაბეჭდეთ “not sorted”.

public class Problem55 extends ConsoleProgram {

	public void run() {
		int n = readInt("Enter value: ");
		int[] numbers = new int[n];
		int[] sorted = new int[n];
		for(int i = 0; i < numbers.length; i++) {
			int num = readInt("Enter number: ");
			numbers[i] = num;
			sorted[i] = num;
		}
		Arrays.sort(sorted);
		
		if (Arrays.equals(numbers, sorted)) {
			println("sorted");
		} else {
			println("not sorted");
		}
	}
}
