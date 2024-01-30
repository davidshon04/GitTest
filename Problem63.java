import java.util.ArrayList;
import java.util.HashMap;

import acm.program.ConsoleProgram;

//63. კონსოლიდან შეგვყავს წყვილ-წყვილად მეგობრების სახელები, მანამ სანამ არ შევიყვანთ
//ცარიელ სტრინგს. დაბეჭდეთ იმ ადამიანის სახელი ვისაც ჰყავს ყველაზე მეტი მეგობარი. 
//მეგობრობა შეიძლება იყოს ცალმხრივი. თუკი შევიყვანთ A-ს და B-ს, ეს ნიშნავს, რომ A არის
//B-ს მეგობარი, მაგრამ B შეიძლება არ იყოს A-ს მეგობარი.

public class Problem63 extends ConsoleProgram {

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
			println(friendsMap);
		}
	}
}
