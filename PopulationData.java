package PopulationData;

import java.util.Scanner;
import java.io.*;

public class PopulationData {
	public static void main(String[] args) throws IOException {
		File file = new File("USPopulation.txt");
		Scanner inputFile = new Scanner(file);
		
		int[] populations = new int[41];
		
		for (int i = 0; i < populations.length; i++) {
			populations[i] = inputFile.nextInt();
		}
		
		System.out.println("Average annual change in population: " + averageChange(populations));
		System.out.println("Year with the greatest increase in population: " + yearGreatestIncrease(populations));
		System.out.println("Year with the least increase in population: " + yearLeastIncrease(populations));
		
		inputFile.close();
	}
	
	public static double averageChange(int[] arr) {
		int totalChange = 0;
		
		for (int i = 0; i < (arr.length - 1); i++) {
			int j = i + 1;
			totalChange += java.lang.Math.abs(arr[j] - arr[i]);
		}
		
		return totalChange / arr.length;
	}
	
	public static int yearGreatestIncrease(int[] populations) {
		int greatestIndex = 0, greatestIncrease = populations[0] - populations[1];
		
		for (int i = 1; i < (populations.length - 1); i++) {
			int j = i + 1;
			
			if (populations[j] - populations[i] > greatestIncrease) {
				greatestIncrease = populations[j] - populations[i];
				greatestIndex = j;
			}
		}
		
		return 1950 + greatestIndex;
	}
	
	public static int yearLeastIncrease(int[] populations) {
		int leastIndex = 0, leastIncrease = populations[1] - populations[2];
		
		for (int i = 1; i < (populations.length - 1); i++) {
			int j = i + 1;
			
			if (populations[j] - populations[i] < leastIncrease) {
				leastIncrease = populations[j] - populations[i];
				leastIndex = j;
			}
		}
		
		return 1950 + leastIndex;
	}
}
