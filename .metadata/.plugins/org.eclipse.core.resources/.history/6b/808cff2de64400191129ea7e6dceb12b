package Chapter_5;

import java.util.Scanner;
public class Exercise_11 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double a;
		double b;
		double c;
		double result;
		double r1;
		double r2;
		
		
		System.out.print("Input a: ");
		a = input.nextDouble();
		System.out.print("Input b: ");
		b = input.nextDouble();
		System.out.print("Input c: ");
		c = input.nextDouble();
		
		result = b * b - 4.0 * a * c;
		
		if (result > 0.0) {
			r1 = (-b + Math.pow(result,  0.5)) / (2.0 * a);
			r2 = (-b - Math.pow(result,  0.5)) / (2.0 * a);
			System.out.println("The roots are " + r1 + " and " + r2);
		} else if (result == 0.0) {
			r1 = -b / (2.0 * a);
			System.out.println("The root is " + r1);
		}

	}

}
