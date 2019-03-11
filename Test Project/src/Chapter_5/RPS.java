package Chapter_5;

import java.util.Scanner;
import java.util.Random;

public class RPS {

	public static void main(String[] args) {
		final int Rock = 1, Paper = 2, Scissors = 3;
		int playerThrow, computerThrow;
		Scanner input = new Scanner(System.in);
		Random rand = new Random();
		
		System.out.print("Enter your throw (1=Rock, 2=Paper, 3=Scissors): ");
		playerThrow = input.nextInt();
		input.close();
		for (int i = 0; i < 50; ++i) System.out.println();
		
		computerThrow = rand.nextInt(3) + 1;
		
		System.out.print("Player Throws ");
		switch (playerThrow) {
			case Rock: System.out.println("Rock."); break;
			case Paper: System.out.println("Paper."); break;
			case Scissors: System.out.println("Scissors."); break;
		}
		System.out.print("Computer Throws ");
		switch (computerThrow) {
			case Rock: System.out.println("Rock."); break;
			case Paper: System.out.println("Paper."); break;
			case Scissors: System.out.println("Scissors."); break;
		}
		
		if (playerThrow == Rock && computerThrow == Rock) {
			 System.out.println("It's a draw!");
			 } else if (playerThrow == Rock && computerThrow == Paper) {
			 System.out.println("Computer wins!");
			 } else if (playerThrow == Rock && computerThrow == Scissors) {
			 System.out.println("Player wins!");
			 }

			 if (playerThrow == Paper && computerThrow == Rock) {
			 System.out.println("Player wins!");
			 } else if (playerThrow == Paper && computerThrow == Paper) {
			 System.out.println("It's a draw!");
			 } else if (playerThrow == Paper && computerThrow == Scissors) {
			 System.out.println("Computer wins!");
			 }
			 if (playerThrow == Scissors && computerThrow == Rock) {
			 System.out.println("Computer wins!");
			 } else if (playerThrow == Scissors && computerThrow == Paper) {
			 System.out.println("Player wins!");
			 } else if (playerThrow == Scissors && computerThrow == Scissors) {
			 System.out.println("It's a draw!");
			 }
			 for (int i = 0; i < 8; ++i) System.out.println();

	}

}
