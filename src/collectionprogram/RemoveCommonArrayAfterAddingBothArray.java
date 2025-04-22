package collectionprogram;

import java.util.ArrayList;

public class RemoveCommonArrayAfterAddingBothArray {

	public static void main(String[] args) {

		int[]x={2,3,55};
	    int[]y={11,2,3,44,55};
	    
	    ArrayList<Integer>a1= new ArrayList<>();
	    ArrayList<Integer>mix=new ArrayList<>();
	    
	    for(Integer i:x) {
	    	a1.add(i);
	    	mix.add(i);
	    }
	    
	    ArrayList<Integer>a2= new ArrayList<>();
	    for(Integer i:y) {
	    	a2.add(i);
	    	mix.add(i);
	    }
	    
	    a1.containsAll(a2);
	    System.out.println(a1);

	  //  a1.retainAll(a2);  //commom betle
	   // mix.removeAll(a1); //uncommon betle
	    //System.out.println(mix);
	    
	}

}
