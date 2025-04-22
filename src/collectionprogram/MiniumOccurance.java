package collectionprogram;

import java.util.HashMap;
import java.util.Map;

public class MiniumOccurance {

	public static void main(String[] args) {
		String s="aaabbbbcddddeeeeeeff";
		char[]ch=s.toCharArray();
		int min=s.length();
		char minChar=' ';
		
		HashMap<Character,Integer>map= new HashMap<>();
		for(char c:ch) {
			if(map.containsKey(c)) {
				map.put(c, map.get(c)+1);
			}else
				map.put(c, 1);
		}
		
		for(Map.Entry<Character, Integer>entry:map.entrySet()) {
			if(entry.getValue()<min) {
				min= entry.getValue();
				minChar=entry.getKey();
			}
		}
		
		System.out.println(minChar+"="+min);
	}

}
