package LoShuMagicSquare;

import java.util.Random;

public class LoShuMagicSquare {
	public static void main(String[] args) {
		Random generator = new Random();
		
		 // Generate a random square
		int[][] square = { { generator.nextInt(8) + 1, generator.nextInt(8) + 1, generator.nextInt(8) + 1 },
				           { generator.nextInt(8) + 1, generator.nextInt(8) + 1, generator.nextInt(8) + 1 },
				           { generator.nextInt(8) + 1, generator.nextInt(8) + 1, generator.nextInt(8) + 1 } };
		
		// Display the random square
		System.out.println(square[0][0] + " " + square[0][1] + " " + square[0][2]);
		System.out.println(square[1][0] + " " + square[1][1] + " " + square[1][2]);
		System.out.println(square[2][0] + " " + square[2][1] + " " + square[2][2]);
		
		if (magic(square)) System.out.println("This is a Lo Shu Magic Square");
		else System.out.println("This is not a Lo Shu Magic Square");
	}
	
	public static boolean magic(int[][] square) {
		for (int i = 0; i < 3; i ++) {
			int sumHorizontal = 0;
			int sumVertical = 0;
			
			for (int j = 0; j < 3; j++) {
				square[i][j] += sumHorizontal;
				square[j][i] += sumVertical;
			}
			
			if (sumHorizontal != 15) return false;
			if (sumVertical != 15) return false;
		}
		
		return true;
	}
}