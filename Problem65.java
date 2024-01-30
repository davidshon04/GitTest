import java.util.ArrayList;
import java.util.HashMap;

import acm.program.ConsoleProgram;

//65. 63-ე ამოცანის გაგრძელება. დაბეჭდეთ ადამიანი რომელსაც ყველაზე მეტი ადამიანი
//ემეგობრება

public class Problem65 extends ConsoleProgram {
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
		println(friendsMap);
		
		HashMap<String, Integer> friendsFrequency = new HashMap<String, Integer>();
		for (String person: friendsMap.keySet()) {
			ArrayList<String> friendList = friendsMap.get(person);
			for (int i = 0; i < friendList.size(); i++) {
				if (!friendsFrequency.containsKey(friendList.get(i))) {
					friendsFrequency.put(friendList.get(i), 1);
				} else {
					friendsFrequency.replace(friendList.get(i), friendsFrequency.get(friendList.get(i)), friendsFrequency.get(friendList.get(i))+1);
				}
			}
		}
		println(friendsFrequency);
		println("The most friendly person is: " + getMostFriendlyPerson(friendsFrequency));
	}

	private String getMostFriendlyPerson(HashMap<String, Integer> friendsFrequency) {
		String friendlyPerson = "";
		int frequency = 0;
		for (String person: friendsFrequency.keySet()) {
			if (friendsFrequency.get(person) > frequency) {
				frequency = friendsFrequency.get(person);
				friendlyPerson = person;
			}
		}
		return friendlyPerson;
	}
}
