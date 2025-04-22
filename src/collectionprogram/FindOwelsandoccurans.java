package collectionprogram;

import java.util.HashMap;
import java.util.Map;

public class FindOwelsandoccurans {

	public static void main(String[] args) {

		String s="my name is atish zotinug";
	    String s1="aeiou";
	    char[]ch=s.toCharArray();
	    char[]ch1=s1.toCharArray();
	    
	    HashMap<Character, Integer> map= new HashMap<>();
	    for(Character c:ch1) {
	    	map.put(c, 0);
	    }
	
	    for(Character c1:ch) {
	    	if(map.containsKey(c1)) {
	    		map.put(c1, map.get(c1)+1);
	    	}
	    }
	    
	    for(Map.Entry<Character, Integer>entry:map.entrySet()) {
	    	if(entry.getValue()>=1) {
	    		System.out.println(entry.getKey()+" "+entry.getValue());
	    	}
	    
	    
	    
	    
	    }
	
	
	}
	

}
