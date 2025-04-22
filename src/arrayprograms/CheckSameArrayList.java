package arrayprograms;

import java.util.Arrays;

public class CheckSameArrayList {
	
	   public static void main(String[] args) {
		    int[]x={1,2,3,4,5,6};
		    int []y={6,5,4,3,2,1};

		    Arrays.sort(x);
		    
		    for(int x1:x) {
		    	System.out.print(x1+" ");
		    }
		    
		    System.out.println();
		    Arrays.sort(y);
		    
		    for(int y1:y) {
		    	System.out.print(y1+" ");
		    }
		    
		    System.out.println();

		    if(Arrays.equals(x, y)) {
		    	System.out.println("both elements are same");
		    }else
		    	System.out.println("both elements are not same");
		    
		    
		    // 2nd way
		    
//		    int[]x={1,2,3,4,5};
//		    int []y={5,4,3,2,1};
//		    int count=0;
//		    
//		    for(int i=0;i<x.length;i++){
//		        for(int j=0;j<y.length;j++){
//		            if(x[i]==y[j]){
//		                count++;
//		                break;
//		            }
//		        }
//		    }
//		    if(count==x.length){
//		        System.out.println("both are same");
//		    }else
//		    System.out.println("both are  not same");
}
}

