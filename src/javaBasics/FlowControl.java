package javaBasics;

import java.util.Scanner;

public class FlowControl {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter three integeres : ");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		System.out.printf("Greatest of a, b and c is %d\n", greatestInteger(a,b,c));
	}

	private static int greatestInteger(int a, int b, int c) {
		if(a>b && a>c)
			return a;
		else if(b>c)
			return b;
		else
			return c;
	}

}
