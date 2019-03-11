package Chapter_5;

import java.util.Scanner;
import java.util.Random;

public class Exercise_9 {

	public static void main(String[] args) {
		int number;
		int guess;
		int error = 0;
		Scanner input = new Scanner(System.in);
		Random rand = new Random();
		
		number = rand.nextInt(20) + 1;
		System.out.println(number);
		
		System.out.print("Enter a number between 1 and 20: ");
		guess = input.nextInt();
		input.close();
		if (guess > 20) {
			error = 1;
		}
		if (guess < 1) {
			error = 2;
		}
		
		for (int i = 0; i < 50; ++i) System.out.println();
		
		System.out.println("Computer's Number: " + number);
		System.out.println("Player's Number: " + guess);
		
		if (number == guess) {
			System.out.println("Great Job! You Guessed Correctly!");
			for (int i = 0; i < 8; ++i) System.out.println();
			}else {System.out.println("Better luck next time");
			for (int i = 0; i < 8; ++i) System.out.println();
		}
		if (error == 1) {
			for (int i = 0; i < 50; ++i) System.out.println();
			System.out.println("Error! Guess too big!");
			for (int i = 0; i < 10; ++i) System.out.println();
		}
		if (error == 2) {
			for (int i = 0; i < 50; ++i) System.out.println();
			System.out.println("Error! Guess too small!");
			for (int i = 0; i < 10; ++i) System.out.println();
		}


	}

}
