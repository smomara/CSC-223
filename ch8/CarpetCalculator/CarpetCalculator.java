package CarpetCalculator;

import java.util.Scanner;

public class CarpetCalculator {
	public static void main(String[] args) {
		double len, w, cost;
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Please enter the information for the desired carpeting");
		
		System.out.print("Length: ");
		len = keyboard.nextDouble();
		
		System.out.print("Width: ");
		w = keyboard.nextDouble();
		
		RoomDimension room = new RoomDimension(len, w);
		
		System.out.print("Price per square foot: $");
		cost = keyboard.nextDouble();
		
		RoomCarpet carpet = new RoomCarpet(room, cost);
		
		System.out.println("Total cost of the desired carpet: $" + carpet.getTotalCost());
	}
}
