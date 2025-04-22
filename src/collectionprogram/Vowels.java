package collectionprogram;

import java.util.HashMap;

public class Vowels {

	public static void main(String[] args) {
		String s="atishzoting";
		char[]ch=s.toCharArray();
		
		String s1="aeoiu";
		char[]ch1=s1.toCharArray();
		
		HashMap<Character, Integer>map=new HashMap<>();
		for(char c:ch1) {
			map.put(c, 1);
		}
		for(char c1:ch) {
			if(map.containsKey(c1)) {
				map.put(c1,map.get(c1)+1);
			}
		}
		
		map.forEach((k,v)-> System.out.println(k+" "+v));
	}

}
