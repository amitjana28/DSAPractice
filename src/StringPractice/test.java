package StringPractice;

import java.text.*;

public class test {

	public static void main(String[] args) {
		String str = "HI";
		str.concat(" Amit");
		
		String st = new String("bye");
		st = "Bye-Bye";
		
		System.out.println(st);
		System.out.println(str);
		
		for(int i=0; i<str.length(); i++) {
			System.out.print(str.charAt(i)+" ");
		}
		System.out.println();
		
		CharacterIterator itr = new StringCharacterIterator(st);
		while(itr.current()!= CharacterIterator.DONE) {
			System.out.print(itr.current()+" ");
			itr.next();		
		}
		
	}

}
