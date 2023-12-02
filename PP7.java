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
	
	public void run() {
		int totalCashBalance = 20;
		for (int i = 0; i < NUM_FLIPS; i++) {
			boolean gerbi = rgen.nextBoolean();
			if(gerbi) {
				totalCashBalance += 1;
			} else {
				totalCashBalance -= 2;
				if (totalCashBalance == 0) {
					break;
				}
			}
		}
		println(totalCashBalance);
	}
}
