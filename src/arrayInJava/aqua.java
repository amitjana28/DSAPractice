package ArrayInJava;

import java.util.HashSet;

public class aqua {

	static String firstRepeatingChar(String str) {
		for(int i=0; i<str.length(); i++) {
			for(int j=0; j<i; j++) {
				if(str.charAt(i)==str.charAt(j)) {
					return Character.toString(str.charAt(i));
				}
			}
		}
		return "-1";
	}
	
	static String hashFirstRepChar(String str) {
		HashSet<Character> hp = new HashSet<>();
		
		for(int i=0; i<str.length(); i++) {
			if(hp.contains(str.charAt(i))) {
				return Character.toString(str.charAt(i));
			}
			
			hp.add(str.charAt(i));
		}
		
		return "-1";
	}
	
	public static void main(String[] args) {
		String str = "geeksforgeeks";
		System.out.println(hashFirstRepChar(str));
	}

}
