package GeometryCalculator;

public class Geometry {
	public static double areaCircle(double radius) {
		if (radius < 0) System.out.println("ERROR: radius must be greater than or equal to 0");
		return Math.PI * radius * radius;
	}
	
	public static double areaRectangle(double length, double width) {
		if (length < 0 || width < 0) System.out.println("ERROR: length and width must be greater than or equal to 0");
		return length * width;
	}
	
	public static double areaTriangle(double base, double height) {
		if (base < 0 || height < 0) System.out.println("ERROR: base and height must be greater than or equal to 0");
		return base * height * 0.5;
	}
}
