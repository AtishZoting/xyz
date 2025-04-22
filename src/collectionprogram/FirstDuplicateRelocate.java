package collectionprogram;

import java.util.HashSet;

public class FirstDuplicateRelocate {

	public static void main(String[] args) {

		String s="tesseting";
		char[]ch=s.toCharArray();
		
		HashSet<Character> hs= new HashSet<>();
		for(char c:ch) {
			if(hs.add(c)==false) {
				System.out.println(c);
				break;
			}
		}
		
	}

}
