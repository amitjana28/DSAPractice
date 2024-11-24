package StringPractice;

public class reverseString {

	public static void main(String[] args) {
		String str = "HelloAmit";
		String revStr = "";
		
		for(int i=str.length()-1; i>-1; i--) {
			char ch = str.charAt(i);
			revStr+=ch;
		}
		
		System.out.println(revStr);

	}

}
