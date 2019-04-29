package Chapter_7;

public class MethodOverloading_Example {

	public static void drawBar(int length) {
		for (int i = 1; 1 <= length; i++) {
			System.out.print("*");
		}
		System.out.println();
	}
	
	public static void drawBar(int length, String mark) {
		for (int i = 1; 1 <= length; i++) {
			System.out.print(mark);
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		drawBar(10);
		drawBar(5, "0");

	}

}
