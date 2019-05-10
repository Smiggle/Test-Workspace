package Chapter_7;

import java.util.Scanner;

public class fahrenheitToCelsius_Example {

	public static void fahrenheitToCelsius() {
		double fTemp, cTemp;
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter a Fahrenheit temperature: ");
		fTemp = input.nextDouble();
		input.close();
		
		cTemp = (double)5/(double)9*(fTemp - 32);
		System.out.println("The Celsius temperature is " + cTemp);

	}
	

}
