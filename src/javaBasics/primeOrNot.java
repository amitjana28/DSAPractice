package javaBasics;

import java.util.Scanner;

public class primeOrNot {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		boolean isPrime = true;
		if(n<2)
			isPrime = false;
		else {
			for(int i=2;i<=Math.sqrt(n);i++) {
				if(n%i==0) {
					isPrime = false;
					break;
				}
				i++;
			}
		}
		System.out.print(isPrime);
	}

}
