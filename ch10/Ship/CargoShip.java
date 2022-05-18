package Ship;

public class CargoShip extends Ship{
	private int maxTonnage;
	
	public CargoShip(String a, String b, int cap) {
		super(a, b);
		maxTonnage = cap;
	}
	
	public void setMaxTonnage(int cap) {
		maxTonnage = cap;
	}
	
	public int getMaxTonnage() {
		return maxTonnage;
	}
	
	public String toString() {
		return "Name: " + getName() +
			 "\nCargo Capacity: " + maxTonnage;
	}
}
