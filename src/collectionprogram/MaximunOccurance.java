package collectionprogram;

import java.util.HashMap;
import java.util.Map;

public class MaximunOccurance {

	public static void main(String[] args) {
		String s="aaabbbbcddddeff";
		char[]ch=s.toCharArray();
		int max=0;
		char maxChar=' ';
		
		HashMap<Character,Integer>map= new HashMap<>();
		for(char c:ch) {
			if(map.containsKey(c)) {
				map.put(c, map.get(c)+1);
			}else
				map.put(c, 1);
		}
		
		for(Map.Entry<Character, Integer>entry:map.entrySet()) {
			if(entry.getValue()>max) {
				max=entry.getValue();
				maxChar=entry.getKey();
			}
		}
		System.out.println(maxChar+"="+max);
	}

}
