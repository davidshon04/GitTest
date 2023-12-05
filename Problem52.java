import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import acm.program.ConsoleProgram;

public class Problem52 extends ConsoleProgram{
	
	private static final String FILE_NAME = "Problem52.java";
	
	public void run() {
		try {
			BufferedReader reader = new BufferedReader(new FileReader(FILE_NAME));
			
			println("opened reader");
			while(true) {
				String newLine = reader.readLine();
				if (newLine == null) {
					break;
				}
				println(newLine);
			}
			reader.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			println("შეცდომა მოხდა, ფაილი ვერ მოიძებნა");

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			println("სხვა შეცდომა მოხდა");

		}
	}
}
