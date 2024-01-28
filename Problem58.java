import java.util.Arrays;

import acm.program.ConsoleProgram;

//58. (2018 წლის გამოცდის ამოცანა)
//მატრიცას ეწოდება მაგიური თუკი ის კვადრატულია(n x n-ზე) და მასში არის ყველა
//რიცხვი 1-დან n^2-ის ჩათვლით. თქვენი მიზანია დაწეროთ magicMatrix მეთოდი
//რომელიც შეამოწმებს არის თუ არა მატრიცა მაგიური და თუკი მაგიურია მაშინ
//დააბრუნებს true-ს თუ არა მაშინ false-ს. 

public class Problem58 extends ConsoleProgram {

	private static final int N = 3;
	private int[][] matrix = new int[N][N+1];

	public void run() {
		fillMatrix(matrix);
		println(magicMatrix(matrix));
	}

	private boolean magicMatrix(int[][] matrix2) {
		if (isSquare(matrix2)) {
			if (containsAllNumbers(matrix2)) {
				return true;
			}
		}
		return false;
	}

	private boolean containsAllNumbers(int[][] matrix2) {
		int[] matrixArray = new int[(int)Math.pow((double) matrix2.length, 2.0)];
		int index = 0;
		
		for (int i = 0; i < matrix2.length; i++) {
			for (int j = 0; j < matrix2[0].length; j++) {
				matrixArray[index] = matrix2[i][j];
				index++;
			}
		}
		
		Arrays.sort(matrixArray);
		if (isTrullySorted(matrixArray)) {
			return true;
		}
		return false;
	}

	private boolean isTrullySorted(int[] matrixArray) {
		for (int i = 0; i < matrixArray.length; i++) {
			if (matrixArray[i] != (i + 1)) {
				return false;
			}
		}
		return true;
	}

	private boolean isSquare(int[][] matrix2) {
		if (matrix2.length == matrix2[0].length) {
			return true;
		}
		return false;
	}

	private void fillMatrix(int[][] matrix2) {
		for (int i = 0; i < matrix2.length; i++) {
			for (int j = 0; j < matrix2[0].length; j++) {
				int n = readInt("Enter number: ");
				matrix2[i][j] = n;
			}
		}
	}
}
