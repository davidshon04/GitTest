import java.util.Arrays;

import acm.program.ConsoleProgram;

//57. დაწერეთ მეთოდი, რომელსაც გადაეცემა ორი სტრინგი და აბრუნებს true-ს თუკი ეს ორის
//სტრინგი ერთმანეთის ანაგრამაა, ხოლო წინააღმდე შემთხვევაში აბრუნებს false-ს. ჩათვალეთ, 
//რომ ორივე სტრინგი მხოლოდ ლათინური ალფავიტის პატარა ასოებისგან შედგება. 
//იმპლემენტაცია გააკეთეთ მასივების გამოყენებით შემდეგი ალგორითმით: თითოეული
//სიტყვისთვის დათვალეთ თითოეული სიმბოლოს რაოდენობა(‘a’-‘z’) და შეინახეთ მასივში. 
//შემდეგ შეადარეთ ერთმანეთს მასივები

public class Problem57 extends ConsoleProgram {

	public void run() {
		println("This program checks Anagrams:");
		
		String str1 = readLine("Enter text1: ");
		String str2 = readLine("Enter text2: ");

		println(isAnagram(str1, str2));
	}

	private boolean isAnagram(String str1, String str2) {
		char[] arr1 = createAndSortArray(str1);
		char[] arr2 = createAndSortArray(str2);
		if (Arrays.equals(arr1, arr2)) {
			return true;
		}
		return false;
	}

	private char[] createAndSortArray(String str) {
		char[] arr = new char[str.length()];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = str.charAt(i);
		}
		Arrays.sort(arr);
		return arr;
	}
}
