import acm.program.ConsoleProgram;

//61. კონსოლიდან შეგვყავს რიცხვი m და n, შემდეგ n ცალი რიცხვი. პროგრამამ უნდა იპოვოს
//შეყვანილი რიცხვებიდან წყვილი რომელთა ჯამი არის m.

public class Problem61 extends ConsoleProgram {

	public void run() {
		int m = readInt("Enter m: ");
		int n = readInt("Enter n: ");
		int[] nums = new int[n];
		for (int i = 0; i < n; i++) {
			int numbers = readInt("Enter numbers: ");
			nums[i] = numbers;
		}

		for (int i = 0; i < n; i++) {
			for (int j = i + 1; j < n; j++) {
				if (nums[i] + nums[j] == m) {
					println(nums[i] + " + " + nums[j] + " = " + m);
				}
			}
		}
	}

}
