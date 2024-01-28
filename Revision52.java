import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import acm.program.ConsoleProgram;

//52. დაწერეთ პროგრამა რომელიც წაიკითხავს თავის თავს ფაილიდან და დაბეჭდავს კონსოლში

public class Revision52 extends ConsoleProgram {

	private static final String FILE_NAME = "Revision52.java";
	
	public void run() {
		try {
			BufferedReader rd = new BufferedReader(new FileReader(FILE_NAME));
			while (true) {
				String line = rd.readLine();
				if (line == null) {
					break;
				}
				println(line);
			}
			rd.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			println("gagebaga");
		}
	}
}
