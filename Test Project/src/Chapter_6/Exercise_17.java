package Chapter_6;

import java.util.Scanner;

public class Exercise_17 {

	public static void main(String[] args) {
		String password = "correct";
		String guess = "guess";
		int counter = 0;
		int tries = 0;
		int correct = 0;
		
		Scanner input = new Scanner(System.in);
		
		
		while (tries != 4) {
			tries += 1;
			if (guess.equals(password)) {
				correct = 1;
			}
			if (correct == 1) {
				System.out.println("Password Correct!");
				for (int i = 0; i < 50; ++i) System.out.println();
				System.out.println("Welcome!");
				for (int i = 0; i < 10; ++i) System.out.println();
				System.exit(0);
			}
			if (counter != 0) {
				if (correct == 0) {
					System.out.println("Incorrect!");
					System.out.println();
				}
				if (counter == 3) {
					System.out.println("Tries Maxed Out!");
					for (int i = 0; i < 50; ++i) System.out.println();
					System.out.println("Access Denied!");
					for (int i = 0; i < 10; ++i) System.out.println();
					System.exit(0);
				}
			}
			counter += 1;
			System.out.print("Enter the password:  ");
			guess = input.nextLine();
			
		}
		
	}

}