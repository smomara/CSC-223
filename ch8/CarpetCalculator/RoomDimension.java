package CarpetCalculator;

public class RoomDimension {
	private double length;
	private double width;
	
	public RoomDimension(double len, double w) {
		length = len;
		width = w;
	}
	
	public double getArea() {
		return length * width;
	}
	
	public String toString() {
		String str = "Length: " + length + " ft" +
					"\nWidth: " + width + " ft";
		
		return str;
	}
}
