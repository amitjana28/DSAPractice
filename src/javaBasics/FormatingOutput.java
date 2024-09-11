package javaBasics;

public class FormatingOutput {

	public static void main(String[] args) {
		// We use %d for integer, %f for floating, %b for booleans, %s for strings, %c for characters, 
		double d = 45.62542353;
		System.out.println(d);
		
		// "%f" is used as a place holder for floating numbers and \n is used for next line. 
		System.out.printf("%f\n", d);
		
		// %5.3f stands for 5 as total digit should be 5 and .3 as 3 digits after decimal point
		System.out.printf("%5.3f\n",d);
		
		System.out.printf("%8.2f\n",d);
//		System.out.printf(d);
	}

}
