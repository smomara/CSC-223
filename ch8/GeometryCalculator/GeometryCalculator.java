package GeometryCalculator;

import java.util.Scanner;

public class GeometryCalculator {
	public static void main(String[] args) {
		int menuChoice;
		double a, b;
		
		Scanner keyboard = new Scanner(System.in);
		
		do {
			System.out.println("Geometry Calculator");
			System.out.println("1. Calculate the Area of a Circle");
			System.out.println("2. Calculate the Area of a Rectangle");
			System.out.println("3. Calculate the Area of a Triangle");
			System.out.println("4. Quit");
			System.out.println();
			System.out.print("Enter your choice (1-4): ");
			menuChoice = keyboard.nextInt();
			
			if (menuChoice < 1 || menuChoice > 4) {
				System.out.println("\nInvalid choice");
			}
			else if (menuChoice == 1) {
				System.out.println("\nCircle Calculator");
				
				System.out.print("Radius: ");
				
				System.out.println("Area: " + Geometry.areaCircle(keyboard.nextDouble()));
			}
			else if (menuChoice == 2) {
				System.out.println("\nRectangle Calculator");
				
				System.out.print("Length: ");
				a = keyboard.nextDouble();
				
				System.out.print("Width: ");
				b = keyboard.nextDouble();
				
				System.out.println("Area: " + Geometry.areaRectangle(a, b));
			}
			else if (menuChoice == 3) {
				System.out.println("\nTriangle Calculator");
				
				System.out.print("Length of base: ");
				a = keyboard.nextDouble();
				
				System.out.print("Height: ");
				b = keyboard.nextDouble();
				
				System.out.println("Area: " + Geometry.areaTriangle(a, b));
			}
			
			System.out.println();
		}
		while (!(menuChoice == 4));
	}
}
