package javaBasics;

import java.io.*;

public class fibbonaci {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		fib(n);

	}

	private static void fib(int n) {
		int a=0,b=1;
		if(n==0) {
			System.out.print(a);
			return;
		}
		if(n==1) {
			System.out.print(a+" "+b);
			return;
		}
		
		System.out.print(a+" "+b+" ");
		for(int i=2;i<=n;i++) {
			int c=a+b;
			System.out.print(c+" ");
			a=b;
			b=c;
		}
		
	}

}
