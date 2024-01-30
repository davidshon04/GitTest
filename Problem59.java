import acm.program.ConsoleProgram;
import acm.util.RandomGenerator;

//(2018 წლის გამოცდის ამოცანა)
//გადმოგეცემათ nxm-ზე მატრიცა რომელშიც მხოლოდ 0-ები და 1-ები წერია. მეთოდმა
//უნდა დააბრუნოს ამ მატრიცის ყველაზე დიდი ქვემართკუთხედის
//ზომა(ელემენტების რაოდენობა) რომელიც მხოლოდ 1-ებისგან შედგება.
//მაგალითად:
//01100100
//01111100
//00111100
//00111100
//ამ მატრიცაში ყველაზე დიდი შიდა მართკუთხედი, რომელიც სულ ერთიანებისგან
//შედგება არის 12 ზომის:
//01100100
//01111100
//00111100
//00111100
//შესაბამისად ამ მატრიცაზე მეთოდმა უნდა დააბრუნოს 12. ჩათვალეთ რომ
//გადმოცემულ მატრიცაში ერთი უჯრა მაინც იქნება რომელშიც წერია 1.

public class Problem59 extends ConsoleProgram {
	
	public void run() {
		int[][] matrix = new int[][] {
			{0,1,1,1,0,0,0},
			{1,1,0,1,1,1,0},
			{1,1,0,1,1,1,1},
			{0,0,1,1,1,1,0},
			{1,1,0,1,1,0,1}
		};
		
		println(checkRects(matrix));
	}

	private int checkRects(int[][] matrix2) {
		int maxRectSize = 0;
		//i and j are the starting points
		for (int i = 0; i < matrix2.length; i++) {
			for (int j = 0; j < matrix2[0].length; j++) {
				//i0 and j0 are the ending points
				for (int i0 = i; i0 < matrix2.length; i0++) {
					for (int j0 = j; j0 < matrix2[0].length; j0++) {
						if (rectWithOnes(matrix2, i, j, i0, j0)) {
							int currRectSize = (i0 - i + 1) * (j0 - j + 1);
							maxRectSize = Math.max(currRectSize, maxRectSize);
						}
					}
				}
			}
		}
		return maxRectSize;
	}

	private boolean rectWithOnes(int[][] matrix2, int i, int j, int i0, int j0) {
		for (int m = i; m <= i0; m++) {
			for (int n = j; n <= j0; n++) {
				if (matrix2[m][n] != 1) {
					return false;
				}
			}
		}
		return true;
	}
}
