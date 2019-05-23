package firstApplication;

import java.util.Scanner;

public class Park_Concession {

	public static void main(String[] args) {
		int boxlunch1;
		int boxlunch2;
		int boxlunch3;
		Scanner input = new Scanner(System.in);
		
		System.out.println("MENU");
		System.out.println("Box Lunch 1: $5.50");
		System.out.println("Box Lunch 2: $7.50");
		System.out.println("Box Lunch 3: $10.00");
		System.out.println();
		
		System.out.print("How many BoxLunch1s do you want: ");
		boxlunch1 = input.nextInt();
		System.out.print("How many BoxLunch2s do you want: ");
		boxlunch2 = input.nextInt();
		System.out.print("How many BoxLunch3s do you want: ");
		boxlunch3 = input.nextInt();
		
		System.out.println();
		System.out.println("Your total with tax is: $" + total(boxlunch1, boxlunch2, boxlunch3));

	}
	public static double total(int a, int b, int c) {
		double boxlunch1 = 5.50;
		double boxlunch2 = 7.50;
		double boxlunch3 = 10;
		double total = 0;
		double tax;
		
		if (a != 0) {
			boxlunch1 = boxlunch1 * a;
			total = total + boxlunch1;
		}
		if (b != 0) {
			boxlunch2 = boxlunch2 * b;
			total = total + boxlunch2;
		}
		if (c != 0) {
			boxlunch3 = boxlunch3 * c;
			total = total + boxlunch3;
		}
		tax = total * .06;
		total = total + tax;
		return total;
	}

}