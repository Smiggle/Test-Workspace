package Chapter_6;

import java.util.Scanner;

public class Exercise_19 {

	public static void main(String[] args) {
		
		//String Statements
		String sentence;
		String word;
		String newString;
		
		//Scanner Statement
		Scanner input = new Scanner(System.in);
		
		//Input Statements
		System.out.print("Enter a Sentence: ");
		sentence = input.nextLine();
		System.out.print("Enter a String: ");
		word = input.nextLine();
		input.close();
		
		//The Actual Replacing of Words
		newString = sentence.replaceAll(word, "");
		
		//Clear Screen / Print Statement
		for (int i = 0; i < 50; ++i) System.out.println();
		System.out.println(newString);
		for (int i = 0; i < 10; ++i) System.out.println();

	}

}
