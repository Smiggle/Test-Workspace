package Chapter_7;

import java.util.Scanner;

public class Exercise_2 {

	public static void main(String[] args) {
		int select;
		double number;
		double conversion;
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter a Number: ");
		number = input.nextDouble();
		
		System.out.println();
		System.out.println("Convert:");
		System.out.println("1. Inches to Centimeters");
		System.out.println("2. Feet to Centimeters");
		System.out.println("3. Yards to Meters");
		System.out.println("4. Miles to Kilometers");
		System.out.println("5. Centimeters to Inches");
		System.out.println("6. Centimeters to Feet");
		System.out.println("7. Meters to Yards");
		System.out.println("8. Kilometers t0 Miles");
		System.out.println();
		
		System.out.print("Enter your choice: ");
		select = input.nextInt();
		System.out.println();
		
		if (select == 1) {
			conversion = number * 2.54;
			System.out.println(number + " Inches equals " + conversion + " centimeters");
			System.exit(0);
		}
		
		if (select == 2) {
			conversion = number * 30;
			System.out.println(number + " Feet equals " + conversion + " centimeters");
			System.exit(0);
		}
		
		if (select == 3) {
			conversion = number * 0.91;
			System.out.println(number + " Yards equals " + conversion + " meters");
			System.exit(0);
		}
		
		if (select == 4) {
			conversion = number * 1.6;
			System.out.println(number + " Miles equals " + conversion + " kilometers");
			System.exit(0);
		}
		
		if (select == 5) {
			conversion = number / 2.54;
			System.out.println(number + " Centimeters equals " + conversion + " inches");
			System.exit(0);
		}
		
		if (select == 6) {
			conversion = number / 30;
			System.out.println(number + " Centimeters equals " + conversion + " feet");
			System.exit(0);
		}
		
		if (select == 7) {
			conversion = number / 0.91;
			System.out.println(number + " Meters equals " + conversion + " yards");
			System.exit(0);
		}
		
		if (select == 8) {
			conversion = number / 1.6;
			System.out.println(number + " Kilometers equals " + conversion + " miles");
			System.exit(0);
		}
		
		for (int i = 0; i < 50; ++i) System.out.println();
		System.out.println("ERROR!");
		System.out.println("Incorrect Choice!");

	}

}