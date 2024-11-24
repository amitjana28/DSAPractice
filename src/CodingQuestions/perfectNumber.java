package CodingQuestions;

public class perfectNumber {

	static boolean perfect(int n) {
		boolean per = false;
		int c=0;
		for(int i=1;i<=n/2;i++) {
			if(n%i==0) {
				c+=i;
				System.out.println(c);
			}
		}
		
		if(n==c)
			return true;
		
		return per;
	}
	public static void main(String[] args) {
		System.out.println(perfect(28));

	}

}
