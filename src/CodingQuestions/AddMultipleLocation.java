package CodingQuestions;

public class AddMultipleLocation {
	
	static String addChar(String str, int[] arr) {
		String s = "";
		int j = 0;
		for(int i=0; i<str.length();i++) {
			if(j<arr.length && i==arr[j]) {
				s+='*';
				j++;
			}
			s+=str.charAt(i);
		}
		return s;
	}

	static String removeChars(String str, char ch) {
		StringBuilder sb = new StringBuilder(str);
		for(int i=0;i<sb.length();i++) {
			if(sb.charAt(i)==ch) {
				sb.deleteCharAt(i);
				i--;
			}
		}
		return sb.toString();
	}
	public static void main(String[] args) {
		String str = "Geeksforgeeks";
		int[] arr = {1,5,6,8};
		
		System.out.println(removeChars(str,'e'));
	}

}
