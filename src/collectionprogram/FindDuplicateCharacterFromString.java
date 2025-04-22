package collectionprogram;

import java.util.HashSet;

public class FindDuplicateCharacterFromString {

	public static void main(String[] args) {
			String s="poooojaa";
			char[]ch=s.toCharArray();
			String s1="";
			
			HashSet<Character> hs= new HashSet<>();
			HashSet<Character> hs1= new HashSet<>();
			
			for(char c:ch) {
				if(hs.add(c)==false){
					hs1.add(c);

					//s1=s1+c+"";
				}
			}
	
			System.out.println(hs1);
	}

}
