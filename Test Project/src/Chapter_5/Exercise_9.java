package Chapter_5;

import java.util.Scanner;
import java.util.Random;

public class Exercise_9 {

	private static Scanner input;

	public static void main(String[] args) {
		int number;
		int guess1;
		int guess2;
		int error1 = 0;
		int error2 = 0;
		input = new Scanner(System.in);
		Random rand = new Random();
		
		number = rand.nextInt(20) + 1;
		//System.out.println(number);
		
		System.out.print("Player 1, Enter a number between 1 and 20: ");
		guess1 = input.nextInt();
		System.out.print("Player 2, Enter a number between 1 and 20: ");
		guess2 = input.nextInt();
		if (guess1 > 20) {
			error1 = 1;
		}
		if (guess1 < 1) {
			error1 = 2;
		}
		if (guess2 > 20) {
			error2 = 1;
		}
		if (guess2 < 1) {
			error2 = 2;
		}
		
		for (int i = 0; i < 50; ++i) System.out.println();
		
		System.out.println("Computer's Number: " + number);
		System.out.println("Player 1's Number: " + guess1);
		System.out.println("Player 2's Number: " + guess2);
		
		if (number == guess1) {
			System.out.println("Great Job Player 1! You Guessed Correctly!");
			}else {System.out.println("Player 1: Better luck next time");
			
		}
		if (number == guess2) {
			System.out.println("Great Job Player 2! You Guessed Correctly!");
			for (int i = 0; i < 6; ++i) System.out.println();
			}else {System.out.println("Player 2: Better luck next time");
			for (int i = 0; i < 6; ++i) System.out.println();
		}
		if (error1 == 1) {
			for (int i = 0; i < 50; ++i) System.out.println();
			System.out.println("Error! Player 1 Guess too big!");
			for (int i = 0; i < 10; ++i) System.out.println();
		}
		if (error1 == 2) {
			for (int i = 0; i < 50; ++i) System.out.println();
			System.out.println("Error! Player 1 Guess too small!");
			for (int i = 0; i < 10; ++i) System.out.println();
		}
		if (error2 == 1) {
			for (int i = 0; i < 50; ++i) System.out.println();
			System.out.println("Error! Player 2 Guess too big!");
			for (int i = 0; i < 10; ++i) System.out.println();
		}
		if (error2 == 2) {
			for (int i = 0; i < 50; ++i) System.out.println();
			System.out.println("Error! Player 2 Guess too small!");
			for (int i = 0; i < 10; ++i) System.out.println();
		}


	}

}


// to debug this program and make sure it worked I made it print the correct number before it asked me for a number
// I just commented out that print statement