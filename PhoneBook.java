package PhoneBook;

import java.util.ArrayList;

public class PhoneBook {
	public static void main(String[] args) {
		PhoneBookEntry sean = new PhoneBookEntry("Sean", "732-658-9384");
		PhoneBookEntry jack = new PhoneBookEntry("Jack", "732-566-4378");
		PhoneBookEntry joe = new PhoneBookEntry("Joseph", "732-956-1846");
		PhoneBookEntry danny = new PhoneBookEntry("Daniel", "732-436-4636");
		PhoneBookEntry jmac = new PhoneBookEntry("Justin", "732-545-9187");
		
		ArrayList<PhoneBookEntry> phoneBook = new ArrayList<>();
		phoneBook.add(sean);
		phoneBook.add(jack);
		phoneBook.add(joe);
		phoneBook.add(danny);
		phoneBook.add(jmac);
		
		for (int i = 0; i < phoneBook.size(); i++) {
			PhoneBookEntry person = phoneBook.get(i);
			
			System.out.println("Name: " + person.getName()
							+ "\nNumber: " + person.getNumber() + "\n");
		}
	}
}
