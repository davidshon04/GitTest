import java.util.HashMap;

import acm.program.ConsoleProgram;

//62. კონსოლიდან შეგვყავს სახელები, მანამ სანამ არ შევიყვანთ ცარიელ სტრინგს. დაბეჭდეთ
//სახელი და მის გასწვრივ რაოდენობა რამდენჯერ შევიყვანეთ ეს სახელი.

public class Problem62 extends ConsoleProgram {

	private static final String SENTINEL = "";
	
	public void run() {
		HashMap<String, Integer> namesMap = new HashMap<String, Integer>();
		
		while (true) {
			String name = readLine("Enter name: ");
			if (name.equals(SENTINEL)) {
				break;
			}
			if (!namesMap.containsKey(name)) {
				namesMap.put(name, 1);
			} else {
				namesMap.replace(name, namesMap.get(name), namesMap.get(name) + 1);
			}
		}
		
		println(namesMap);
	}
}
