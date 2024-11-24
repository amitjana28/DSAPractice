package CodingQuestions;

public class FIbbonacciSeries {

	static void fib(int n) {
		int a = 0, b = 1;
		System.out.print(a+" "+b+ " ");
		
		for(int i=0; i<n-2; i++) {
			System.out.print(a+b+" ");
			a=b;
			b=a+b;
		}
	}
	
	public static void main(String[] args) {
		fib(0);

	}

}
