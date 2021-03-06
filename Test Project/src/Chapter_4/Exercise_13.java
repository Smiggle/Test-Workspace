package Chapter_4;

import java.io.IOException;
import java.text.DecimalFormat;
import java.util.Scanner;

public class Exercise_13 {

	private static Scanner input;

	public static void main(String[] args) throws IOException {
		
		DecimalFormat df = new DecimalFormat("0.00");
		
		double food;
		double fp;
		double clothing;
		double cp;
		double entertainment;
		double ep;
		double rent;
		double rp;
		
		// This is the main scanner statement
		input = new Scanner(System.in);
		
		// This is where data is input
		System.out.print("How Much did you Spend on food: $");
		food = input.nextInt();
		System.out.print("How much did you spend on Clothing: $");
		clothing = input.nextInt();
		System.out.print("How much did you spend on Entertainment: $");
		entertainment = input.nextInt();
		System.out.print("How much was your rent: $");
		rent = input.nextInt();
		
		// This is the quick maths
		fp = (food / (food + clothing + entertainment + rent)) * 100;
		cp = (clothing / (food + clothing + entertainment + rent)) * 100;
		ep = (entertainment / (food + clothing + entertainment + rent)) * 100;
		rp = (rent / (food + clothing + entertainment + rent )) * 100;
		
		//This is the print statements (along with some extra goodies)
		for (int i = 0; i < 50; ++i) System.out.println();
		for (int i = 0; i < 50; ++i) System.out.print("=");
		System.out.println();
		System.out.print("|");
		// This is important
		System.out.format("%15s %12s", "Category", "Budget");
		for (int i = 0; i < 19; ++i) System.out.print(" ");
		System.out.println("|");
		System.out.print("|");
		// This is important
		System.out.format("%15s %12s %1s", "Food", df.format(fp), "%");
		for (int i = 0; i < 17; ++i) System.out.print(" ");
		System.out.println("|");
		System.out.print("|");
		// This is important
		System.out.format("%15s %12s %1s", "Clothing", df.format(cp), "%");
		for (int i = 0; i < 17; ++i) System.out.print(" ");
		System.out.println("|");
		System.out.print("|");
		// This is important
		System.out.format("%15s %12s %1s", "Entertainment", df.format(ep), "%");
		for (int i = 0; i < 17; ++i) System.out.print(" ");
		System.out.println("|");
		System.out.print("|");
		// This is important
		System.out.format("%15s %12s %1s", "Rent", df.format(rp), "%");
		for (int i = 0; i < 17; ++i) System.out.print(" ");
		System.out.println("|");
		for (int i = 0; i < 50; ++i) System.out.print("=");
		for (int i = 0; i < 4; ++i) System.out.println();;		
	}

}
