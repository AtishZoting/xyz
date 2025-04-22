package arrayprograms;

import java.util.Arrays;

public class DeleteElementFromArray {

	public static void main(String[] args) {
		int []x= {15,25,1,97,785,2005,41};
		int deletElement=97;
		
		int[]y= new int[x.length-1];
		int index=0;
		
		System.out.println("Original array : "+Arrays.toString(x));
		
		for(int i=0;i<x.length;i++) {
			if(x[i]!=deletElement) { 
				y[index]=x[i];
				index++;
			}
		}
		System.out.println("given element after removing array is : "+Arrays.toString(y));
	}

}
