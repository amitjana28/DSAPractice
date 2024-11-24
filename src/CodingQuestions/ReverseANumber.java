package CodingQuestions;
import java.io.*;

public class ReverseANumber {

	static int ans =0;
	static int reverse(int n) {
		if(n==0)
			return ans;
		if(n>0) {
			int rem = n%10;
			ans = ans*10+rem;
			reverse(n/10);
		}
		return ans;
	}
	
	static String reverse(String str) {
		String newString="";
		for(int i=str.length()-1; i>=0; i--) {
			newString+=str.charAt(i);
		}
		return newString;
	}
	
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println(reverse(452));
		System.out.println(reverse("Hello"));

	}

}
