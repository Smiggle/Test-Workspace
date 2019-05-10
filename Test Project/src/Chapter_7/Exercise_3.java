package Chapter_7;

import java.util.Scanner;

public class Exercise_3 {

	public static void isPrime(int n) {
	    
	    if (n%2==0) {
	    	System.out.println("Your number is NOT prime");
	    	System.exit(0);
	    }
	   
	    for(int i=3;i*i<=n;i+=2) {
	        if(n%i==0) {
	        	System.out.println("Your number is NOT prime");
	        	System.exit(0);
	        }
	    }
	    System.out.println("Your number IS prime");
	    System.exit(0);
	}
	
	public static void main(String[] args) {
		int n;
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Input a number to check if it is prime: ");
		n = input.nextInt();
		input.close();
		isPrime(n);
		

	}

}