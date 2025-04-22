package collectionprogram;

import java.util.ArrayList;
import java.util.HashSet;

public class RemoveDuplicateInSingleArray {

	public static void main(String[] args) {
		String[] s={"apple","banana","apple","mango","strawbery","mango"};
	    
	    ArrayList<String>ar= new ArrayList<>();
	    for(String friut:s){
	        ar.add(friut);
	    }
	    System.out.println(ar);
	    ArrayList<String>al= new ArrayList<>();
	    
	    for(String t:ar){
	    if(al.contains(t)==false){
	        al.add(t);
	    }    
	    
	    }
	    System.out.println(al);
	    
	    
	    HashSet<String>hs = new HashSet<>();
	    for(String ad:s) {
	    	hs.add(ad);
	    }
	    System.out.println("using has Set "+hs);
	}

}
