package Chapter_5;

import java.util.Random;

public class random_numbers {

	public static void main(String[] args) {
		Random r = new Random();
		
		System.out.println("First Number: " + r.nextInt(100));
		System.out.println("Second Number: " + r.nextInt(100));
		System.out.println("Third number: " + r.nextInt(100));
		System.out.println("Fourth number: " + r.nextInt(100));
		System.out.println("Fifth number: " + r.nextInt(100));

	}

}
