package Chapter_7;

import java.util.Scanner;
import java.text.DecimalFormat;

public class Exercise_5 {
	
	public static void main(String[] args) {
		double tot = 0;
		
		System.out.println("Input your total coinage: ");
		System.out.println();
		
		getDollarAmount(tot);

	}
	
	public static void getDollarAmount(double tot) {
		DecimalFormat df = new DecimalFormat("0.00");
		
		int quar;
		int dime;
		int nick;
		int pen;
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Quarters: ");
		quar = input.nextInt();
		System.out.print("Dimes: ");
		dime = input.nextInt();
		System.out.print("Nickles: ");
		nick = input.nextInt();
		System.out.print("Pennies: ");
		pen = input.nextInt();
		
		tot = (quar * .25) + (dime * .1) + (nick * .05) + (pen * .01);
		System.out.println("Total: $" +df.format(tot));
	}

}
