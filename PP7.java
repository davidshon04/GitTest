import acm.program.ConsoleProgram;
import acm.util.RandomGenerator;

//7.გაქვს 20 ლარი და თამაშობ მონეტის აგდებას, ყოველ ჯერზე დებს გერბზე 2 ლარს, წაგების შემთხვევაში კარგავს ამ 2 ლარს, 
//ხოლო მოგების შემთხვევაში იბრუნებს დადებულ ფსონს და დამატებით 1 ლარს იგებს.  საშუალოდ რა თანხა გექნება 100 აგდების შემდეგ
//(თუ თანხა გაგითავდა, ვთქვთ მე–20 აგდებაზე შენი ექსპერიმენტი რჩება და 21-ედ ვეღარ ააგდებ. ასეთი ექსპერიმენტი შედეგებში ჩვეულებრივ უნდა გაითვალისწინო)  ? 
//საშუალოს გამოსათვლელად ჩაატარეთ 100 ჯერ(ან ნაკლებჯერ, თუ გაკოტრდი) აგდების ექსპერიმენტი 10000 ჯერ. (Practice07)
//Tags: RandomGenerator, Simulations/Experiments , AverageResult, Coin

public class PP7 extends ConsoleProgram {
	
	private RandomGenerator rgen = RandomGenerator.getInstance();
	private static final int NUM_FLIPS = 100;
	private static final int NUM_EXPERIMENT = 10000;
	
	public void run() {
		int startingBalance = 20;
		int totalBalance = 0;
		for (int i = 0; i < NUM_EXPERIMENT; i++) {
			int perExperimentBalance = holdExperiment(startingBalance);
			totalBalance += perExperimentBalance;
		}
		double averageBalance = (double) (totalBalance / NUM_EXPERIMENT);
		println(averageBalance);
	}

	private int holdExperiment(int startingBalance) {
		for (int i = 0; i < NUM_FLIPS; i++) {
			boolean gerbi = rgen.nextBoolean(0.75);
			if(gerbi) {
				startingBalance += 1;
			} else {
				startingBalance -= 2;
				if (startingBalance <= 0) {
					break;
				}
			}
		}
		return startingBalance;
	}
}
