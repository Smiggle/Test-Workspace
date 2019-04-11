package Chapter_6;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Exercise_3 {

	public static void main(String[] args) {
		
		DecimalFormat df = new DecimalFormat("0.00");
		
		double invest;
		double goal;
		double interest;
		int count = 0;
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("How Much do you want to invest:  $");
		invest = input.nextDouble();
		System.out.print("What is your goal:  $");
		goal = input.nextDouble();
		System.out.print("What is the interest rate:  ");
		interest = input.nextDouble();
		
		while (invest < goal) {
			count += 1;
			invest = invest + (invest*interest*.01);
			//System.out.println("Invest = " + df.format(invest) + "    count = " + count);
		}
		
		System.out.println("It will take " + count + " years until you reach your investment goal.");
		System.out.println("You will end up with $" + df.format(invest));

	}

}