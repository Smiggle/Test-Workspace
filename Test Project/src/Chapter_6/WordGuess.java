package Chapter_6;

import java.util.Scanner;

public class WordGuess {

	public static void main(String[] args) {
		final String SECRET_WORD = "COREY";
		final String FLAG = "!";
		String wordSoFar = "", updatedWord = "";
		String letterGuess, wordGuess = "";
		int numGuesses = 0;
		Scanner input = new Scanner(System.in);
		
		System.out.println("WordGuess game.\n");
		for (int i = 0; i < SECRET_WORD.length(); i++) {
			wordSoFar += "-";
		}
		System.out.println(wordSoFar + "\n");
		do {
			System.out.print("Enter a letter (" + FLAG + " to guess entire word): ");
			letterGuess = input.nextLine();
			letterGuess = letterGuess.toUpperCase();
		
			numGuesses += 1;
		
			if (SECRET_WORD.indexOf(letterGuess) >= 0) {
				updatedWord = wordSoFar.substring(0, SECRET_WORD.indexOf(letterGuess));
				updatedWord += letterGuess;
				updatedWord += wordSoFar.substring(SECRET_WORD.indexOf(letterGuess)+1,
						wordSoFar.length());
				wordSoFar = updatedWord;
			}
			System.out.println(wordSoFar + "\n");
		} while (!letterGuess.equals(FLAG) && !wordSoFar.equals(SECRET_WORD));
		
		if (letterGuess.equals(FLAG)) {
			System.out.println("What is your guess? ");
			wordGuess = input.nextLine();
			wordGuess = wordGuess.toUpperCase();
		}
		if (wordGuess.equals(SECRET_WORD) || wordSoFar.equals(SECRET_WORD)) {
			System.out.println("YOU WON!");
		} else {
			System.out.println("Sorry. You lose.");
		}
		System.out.println("The secret word is " + SECRET_WORD);
		System.out.println("You made " + numGuesses + " Guesses.");

	}

}
