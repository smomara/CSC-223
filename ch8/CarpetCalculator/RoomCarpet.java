package CarpetCalculator;

public class RoomCarpet {
	private RoomDimension size;
	private double carpetCost;
	
	public RoomCarpet(RoomDimension dim, double cost) {
		size = dim;
		carpetCost = cost;
	}
	
	public double getTotalCost() {
		return size.getArea() * carpetCost;
	}
	
	public String toString() {
		String str = size.toString() +
					"\nCost: $" + carpetCost +"per square foot";
		
		return str;
	}
}
