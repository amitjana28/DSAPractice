package ArrayInJava;

public class sumOfDigits {

	public static void main(String[] args) {
		System.out.println(sumDigit(687));

	}

	private static int sumDigit(int n) {
		if(n/10 == 0)
			return n;
		return n%10+sumDigit(n/10);
	}

}
