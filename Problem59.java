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

	private static final int N = 3;
	private static final int M = 4;
	private int[][] matrix = new int[N][M];
	private RandomGenerator rgen = RandomGenerator.getInstance();
	
	public void run() {
		fillMatrix(matrix);
		println(matrix.toString());
	}

	private void fillMatrix(int[][] matrix2) {
		for (int i = 0; i < matrix2.length; i++) {
			for (int j = 0; j < matrix2[0].length; j++) {
				matrix2[i][j] = rgen.nextInt(0, 1);
			}
		}
	}
}
