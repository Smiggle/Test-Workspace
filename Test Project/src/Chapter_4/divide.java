package Chapter_4;

public class divide {

	public static void main(String[] args) {
		int num1 = 5;
		int num2 = 3;
		int result;
		double doubleNum1 = 5;
		double doubleNum2 = 3;
		double doubleResult;
		
		result = num1 / num2;
		System.out.format("%-10s %2s", "num1 / num2:", result + "\n");
		
		doubleResult = doubleNum1 / doubleNum2;
		System.out.format("%-10s %2s", "doubleNum1 / doubleNum2: ", doubleResult + "\n");
		
		doubleResult = num1 / doubleNum2;
		System.out.format("%-10s %2s", "num1 / doubleNum2: ", doubleResult + "\n");
		
		result = num1 % num2;
		System.out.format("%-10s %2s", "num1 % num2: ", result + "\n");
		
		doubleResult = doubleNum1 % doubleNum2;
		System.out.format("%-10s %2s", "doubleNum1 % doubleNum2: ", doubleResult);
	}

}