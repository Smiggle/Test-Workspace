package Chapter_4;

import java.util.Scanner;

/**
 * Calculates and displays the area of a rectangle
 * based on the width and length entered by the user
 * @author corey
 *
 */

public class Input_variable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int length;	//longer side of rectangle
		int width;	//shorter side of rectangle
		int area;	//calculated area of rectangle
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the length: ");
		length = input.nextInt();
		System.out.print("Enter the width: ");
		width = input.nextInt();
		input.close();
		
		area = length * width;
		System.out.println("Area of rectangle: " + area);

	}

}
