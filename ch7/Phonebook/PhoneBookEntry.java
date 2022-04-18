package PhoneBook;

public class PhoneBookEntry {
	private String name;
	private String number;
	
	public PhoneBookEntry(String str, String num) {
		name = str;
		number = num;
	}
	
	public void changeName(String str) {
		name = str;
	}
	
	public void changeNumber(String num) {
		number = num;
	}
	
	public String getName() {
		return name;
	}
	
	public String getNumber() {
		return number;
	}
}
