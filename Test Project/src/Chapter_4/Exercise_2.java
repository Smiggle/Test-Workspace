package Chapter_4;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Exercise_2 {
	
	private static Scanner input;

	public static void main(String[] args) {
		
		//adds decimal formating
		DecimalFormat df = new DecimalFormat("0.00");
		
		double labor;
		double rent;
		double diameter;
		double materials;
		double total;
		
		//main scanner statement
		input = new Scanner(System.in);
		
		//input diameter
		System.out.print("Enter the diameter of the pizza in inches: ");
		diameter = input.nextInt();
		
		//Quickmaths
		labor = .75;
		rent = 1;
		materials = .05 * diameter * diameter;
		total = labor + rent + materials;
		
		//Main Print statement
		for (int i = 0; i < 50; ++i) System.out.println();
		for (int i = 0; i < 36; ++i) System.out.print("=");
		System.out.println();
		System.out.print("| ");
		System.out.print("Your total comes out to be $");
		System.out.print(df.format(total));
		System.out.println(" |");
		for (int i = 0; i < 36; ++i) System.out.print("=");
		for (int i = 0; i < 8; ++i) System.out.println();;	
		
	}

}
