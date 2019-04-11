package Chapter_6;

import java.util.Random;
import java.util.Scanner;

public class Exercise_8 {

	public static void main(String[] args) {
		int number;
		int guess = 0;
		int error = 0;
		Scanner input = new Scanner(System.in);
		Random rand = new Random();
		
		number = rand.nextInt(20) + 1;
		//System.out.println(number);
		
		while (guess != number) {
			if (guess != 0) {
				if (guess > number) {
					System.out.println("Guess too high! Try Again!");
				} else if (guess < number) {
					System.out.println("Guess too low! Try Again!");
				}
				System.out.println();
			}
			System.out.print("Enter a number between 1 and 20: ");
			guess = input.nextInt();
			if (guess > 20) {
				error = 1;
			}
			if (guess < 1) {
				error = 2;
			}
		}
		input.close();
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


