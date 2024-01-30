import java.util.ArrayList;
import java.util.HashMap;

import acm.program.ConsoleProgram;

//64. 63-ე ამოცანის გაგრძელება, დაბეჭდეთ თითოეული შეყვანილი სახელი და მის გასწვრივ
//მძიმით გამოყოფილი მეგობრების სია.

public class Problem64 extends ConsoleProgram {
	private static final String SENTINEL = "";

	public void run() {
		HashMap<String, ArrayList<String>> friendsMap = new HashMap<String, ArrayList<String>>();

		while (true) {
			String friend = readLine("Friend: ");
			String person = readLine("Person: ");
			if (friend.equals(SENTINEL) || person.equals(SENTINEL)) {
				break;
			}

			if (!friendsMap.containsKey(person)) {
				friendsMap.put(person, new ArrayList<String>());
			}

			ArrayList<String> currFriends = friendsMap.get(person);
			if (!currFriends.contains(friend)) {
				currFriends.add(friend);
			}

			friendsMap.put(person, currFriends);
		}
		
		println("");
		println("Here is the list:");
		for (String person: friendsMap.keySet()) {
			println(person + ": " + friendsMap.get(person));
		}
	}
}
