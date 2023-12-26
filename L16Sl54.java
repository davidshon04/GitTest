import java.util.Arrays;

import acm.program.ConsoleProgram;

// Reverse Array Program

public class L16Sl54 extends ConsoleProgram {
	public void run() {
		int n = readInt("Enter number of Elements: ");
		int[] arr = createArray(n);
		println("Forward: " + Arrays.toString(arr));
		
		reverseArray(arr);
		println("Reversed: " + Arrays.toString(arr));
	}

	private int[] reverseArray(int[] arr) {
		for(int i = 0; i < arr.length / 2; i++) {
			swapValues(arr, i, arr.length - i - 1);
		}
		return arr;
	}

	private void swapValues(int[] arr, int i, int j) {
		int temp = i;
		arr[i] = j;
		arr[j] = temp;
	}

	private int[] createArray(int n) {
		int[] array = new int[n];
		for (int i = 0; i < array.length; i++) {
			array[i] = i;
		}
		return array;
	}
}
