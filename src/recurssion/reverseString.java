package recurssion;

public class reverseString {
	
	static String revStr = "";
	
	static String revString(String s, int n) {
		if(n<=0)
			return "";
		return revStr+s.charAt(n-1)+revString(s,n-1);
	}

	public static void main(String[] args) {
		String str = "hello AMit";
		System.out.println(revString(str, str.length()));

	}

}
