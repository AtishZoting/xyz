package arrayprograms;

import java.util.ArrayList;

public class PairsOfAdditionInFirst {

	public static void main(String[] args) {
		int []x={8,9,3,4,3,2,0,6,5,1,10,11};
	    int sum=6;
	    ArrayList<Integer>al= new ArrayList<>();
	      ArrayList<Integer>bl= new ArrayList<>();
	    for(int i=0;i<x.length;i++){
	        for(int j=i+1;j<x.length;j++){
	                if(x[i]+x[j]==sum){
	                    al.add(x[i]);
	                    i++;
	                    al.add(x[j]);
	                    
	    }
	    

	    }
	}
	for(int x1:x){
	    bl.add(x1);
	}
	        bl.removeAll(al);
	        System.out.println(bl);
	        al.addAll(bl);
	        System.out.println(al);
	}

}
