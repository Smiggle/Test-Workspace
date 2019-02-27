package Chapter_4;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Exercise_13 {

	private static Scanner input;

	public static void main(String[] args) {
		
		DecimalFormat df = new DecimalFormat("0.00");
		
		double food;
		double fp;
		double clothing;
		double cp;
		double entertainment;
		double ep;
		double rent;
		double rp;
		
		input = new Scanner(System.in);
		
		System.out.print("How Much did you Spend on food: $");
		food = input.nextInt();
		System.out.print("How much did you spend on Clothing: $");
		clothing = input.nextInt();
		System.out.print("How much did you spend on Entertainment: $");
		entertainment = input.nextInt();
		System.out.print("How much was your rent: $");
		rent = input.nextInt();
		
		fp = (food / (food + clothing + entertainment + rent)) * 100;
		cp = (clothing / (food + clothing + entertainment + rent)) * 100;
		ep = (entertainment / (food + clothing + entertainment + rent)) * 100;
		rp = (rent / (food + clothing + entertainment + rent )) * 100;
		
		System.out.format("%15s %12s", "Category", "Budget\n");
		System.out.format("%15s %12s %1s", "Food", df.format(fp), "%\n");
		System.out.format("%15s %12s %1s", "Clothing", df.format(cp), "%\n");
		System.out.format("%15s %12s %1s", "Entertainment", df.format(ep), "%\n");
		System.out.format("%15s %12s %1s", "Rent", df.format(rp), "%\n");
				
	}

}
