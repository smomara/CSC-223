package Ship;

public class Ship {
	private String name;
	private String year;
	
	public Ship() {
		name = "";
		year = "";
	}
	public Ship(String a, String b) {
		name = a;
		year = b;
	}

	public void setName(String a) {
		name = a;
	}
	
	public void setYear(String b) {
		year = b;
	}
	
	public String getName() {
		return name;
	}
	
	public String getYear() {
		return year;
	}
	
	public String toString() {
		return "Name: " + name +
			 "\nYear: " + year;
	}
}
