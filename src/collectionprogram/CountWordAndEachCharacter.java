package collectionprogram;
import java.util.*;

public class CountWordAndEachCharacter {

	public static void main(String[] args) {
		String s="hi my name is atish";
		String[]words=s.split(" ");
		
		System.out.println("total number of word : "+words.length);
		
		LinkedHashMap<String,Integer>hm= new LinkedHashMap<String,Integer>();  //insertion order preserved
		for(String word:words) {
			hm.put(word, word.length());
		}
		
		System.out.println(hm);
		
	
	}

}
