package Chapter_6;

import java.util.Scanner;

public class Middle_three {

	public static void main(String[] args) {
		String phrase, threeLetters;
		int phraseLength;
		int mid;
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter text that contains at least three characters:  ");
		phrase = input.nextLine();
		input.close();
		
		phraseLength = phrase.length();
		mid = phraseLength / 2;
		
		threeLetters = phrase.substring(mid - 1, mid + 2);
		System.out.println("Middle three characters are: " + threeLetters);

	}

}
