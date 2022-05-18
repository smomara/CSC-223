package Ship;

public class CruiseShip extends Ship {
	private int maxCapacity;
	
	public CruiseShip(String a, String b, int cap) {
		super(a, b);
		maxCapacity = cap;
	}
	
	public void setMaxCapacity(int cap) {
		maxCapacity = cap;
	}
	
	public int getMaxCapacity() {
		return maxCapacity;
	}
	
	public String toString() {
		return "Name: " + getName() +
			 "\nMax Capacity: " + maxCapacity;
	}
}
