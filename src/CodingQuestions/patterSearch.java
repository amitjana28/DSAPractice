package CodingQuestions;

public class patterSearch {

	static void patternMatcher(String s, String p) {
		for(int i=0; i<=s.length()-p.length(); i++) { 
			if(s.substring(i,i+p.length()).equals(p)) {
				System.out.println("patter Match at "+ i);
			}
		}
	}
	
	static boolean subSeq(String s, String p) {
		int n = s.length(), m = p.length();
		int i=0, j=0;
		while(i<n && j<m) {
			if(s.charAt(i)== p.charAt(j)) {
				j++;
			}
			i++;
		}
		return j==m;
	}
	public static void main(String[] args) {
		String str = "kjhasfuihfew";
		String pattern = "jwf";
		
		System.out.println(subSeq(str,pattern));

	}

}
