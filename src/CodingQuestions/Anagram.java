package CodingQuestions;
import java.util.*;

public class Anagram {

	static boolean anagramCheck(String s, String p) {
		HashMap<Character,Integer> hp = new HashMap<>();
		
		for(char ch : s.toCharArray()) {
			hp.put(ch, hp.getOrDefault(ch, 0)+1);
		}
		
		for(char ch : p.toCharArray()) {
			hp.put(ch, hp.getOrDefault(ch, 0)-1);
		}
		
		for(var pair : hp.entrySet()) {
			if(pair.getValue()!=0) {
				return false;
			}
		}
		
		return true;
	}
	public static void main(String[] args) {
		System.out.println(anagramCheck("milaohtel", "helloamit"));

	}

}
