package Chapter_7;

import java.util.Scanner;
import java.util.Random;

public class Exercise_10 {

	public static void hint(int guess, int number) {
		
		if (guess < 1) {
			System.out.println("Error: Invalid Input, Input too low!\n");
		} else if (guess == number){
			System.out.print("Your Correct! The number was " + number + ".");
			System.exit(0);
		} else if (guess > number) {
			System.out.println("Hint: Guess too HIGH!\n");
		} else if (guess < number) {
			System.out.println("Hint: Guess too LOW!\n");
		}
		
		
			
	}
	
	public static void main (String [] args) {
		Random randomNumber = new Random();
		int number = randomNumber.nextInt(20);
		int counter = 0;
		int guess = 0;
		
		Scanner input = new Scanner(System.in);
		
		while (counter == 0) {
			System.out.print("Enter a number between 1 and 20: ");
			guess = input.nextInt();
			
			hint(guess, number);
		}
		
	}

}