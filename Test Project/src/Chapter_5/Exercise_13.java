package Chapter_5;

import java.util.Scanner;
import java.lang.Math;
import java.text.NumberFormat;

public class Exercise_13 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		double principal; 
		double rate;
		double numberOfMonths;
		double payment;
		
		System.out.print("Principal: ");
		principal = input.nextDouble();
		System.out.print("Interest Rate: ");
		rate = input.nextDouble();
		System.out.print("Number of monthly payments: ");
		numberOfMonths = input.nextDouble();
		input.close();
		
		payment = principal * rate/12 / (1 - Math.pow(1 + rate/12, -numberOfMonths));
		
		NumberFormat money =NumberFormat.getCurrencyInstance();
		System.out.println("The monthly payment is: " + (money.format(payment)));

	}

}
