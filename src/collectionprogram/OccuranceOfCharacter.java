package collectionprogram;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class OccuranceOfCharacter {

	public static void main(String[] args) {
		String s="testingshastra";
		char[]ch=s.toCharArray();
		
		HashMap<Character, Integer> map= new HashMap<Character,Integer>();
		
		for(char c:ch) {
			if(map.containsKey(c)) {
				map.put(c, map.get(c)+1);
			}else {
				map.put(c, 1);
			}
		}
		
//		for(char c1:map.keySet()) {
//			System.out.println(c1+":"+map.get(c1));
//		}
		
	//	System.out.println(map);  // direct ase pan geu shakto 

	//	map.forEach((k,v)->System.out.println(k+":"+v)); 
		
		for(Map.Entry<Character, Integer> entry:map.entrySet()) {
			if(entry.getValue()>=1) {
				System.out.println(entry.getKey()+" "+entry.getValue());
			}
		}
	}

}
