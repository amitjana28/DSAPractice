package javaBasics;

import java.io.*;

public class BufferedReaderInput {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("Enter an integer : ");
		int i = Integer.parseInt(br.readLine());
				
		System.out.print("Enter a string : ");
		String s = br.readLine();
				
		System.out.print("Enter a complete sentence : ");
		String s1 = br.readLine();
				
		System.out.print("Enter a floating digit : ");
		float f = Float.parseFloat(br.readLine());	
				
		System.out.println("You have entered "+i+ " as a integer, "+ f+ " as a floating digit, "
		+ s+ " as a single word and your complete sentence is "+ s1);	

	}

}
