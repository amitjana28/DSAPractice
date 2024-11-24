package CodingQuestions;

public class GCD {

	static int GCD(int a, int b) {
		if(a==0)
			return b;
		return GCD(b%a,a);
	}
	public static void main(String[] args) {
		System.out.println(GCD(20,28));

	}

}
