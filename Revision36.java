import acm.program.ConsoleProgram;
import acm.util.RandomGenerator;

//	36. თქვენი ამოცანაა გააკეთოთ მონეტის აგდების სიმულაციები და დათვალოთ საშუალოდ
//	რამდენჯერ უნდა ავაგდოთ მონეტა რათა 3-ჯერ ზედიზედ ამოვიდეს ბორჯღალო.

public class Revision36 extends ConsoleProgram {
	private static final int NUMBER_OF_TRIALS = 10000;
	private RandomGenerator rgen = RandomGenerator.getInstance();

	public void run() {
		int sumFlips = 0;
		for (int i = 0; i < NUMBER_OF_TRIALS; i++) {
			int numFlipsPerTrial = flipsPerTrial();
			sumFlips += numFlipsPerTrial;
		}
		double averageFlips = (double) sumFlips / NUMBER_OF_TRIALS;
		println(averageFlips);
	}

	private int flipsPerTrial() {
		int numFlips = 0;
		while (true) {
			numFlips++;
			int numBorjgali = 0;
			int borjgali = rgen.nextInt(0, 1);
			if (borjgali == 1) {
				numBorjgali++;
			} else {
				numBorjgali = 0;
			}
			if (numBorjgali == 3) {
				break;
			}
		}
		return numFlips;
	}
}
