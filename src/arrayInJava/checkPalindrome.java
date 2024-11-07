package arrayInJava;

import java.io.*;

public class checkPalindrome {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		System.out.println(isPalindrome(str.toLowerCase()));
	}

	private static int isPalindrome(String string) {
		int isPalindrome = 1;
		int low = 0;
		int high = string.length()-1;
		
		while(low<high) {
			if(string.charAt(low)!=string.charAt(high)) {
				return 0;
			}
			low++;
			high--;
		}
		return isPalindrome;
	}

}
