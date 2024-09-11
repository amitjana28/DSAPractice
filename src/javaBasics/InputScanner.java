package javaBasics;

import java.util.Scanner;

public class InputScanner {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// For integer use nextInt()
		System.out.print("Enter an integer : ");
		int i = sc.nextInt();
		
		// For one word string use next()
		System.out.print("Enter a string : ");
		String s = sc.next();
		
		sc.nextLine();
		
		// For a complete sentence use nextLine()
		System.out.print("Enter a complete sentence : ");
		String s1 = sc.nextLine();
		
		sc.nextLine();
		
		// For a floating point use nextFloat()
		System.out.print("Enter a floating digit : ");
		float f = sc.nextFloat();
		
		
		System.out.println("You have entered "+i+ " as a integer, "+ f+ " as a floating digit, "
		+ s+ " as a single word and your complete sentence is "+ s1);
	}

}
