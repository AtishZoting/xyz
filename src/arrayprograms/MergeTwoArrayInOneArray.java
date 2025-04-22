package arrayprograms;

import java.util.Arrays;

public class MergeTwoArrayInOneArray {

	public static void main(String[] args) {
		int []x= {1,2,3,4,5};
		int []y= {6,7,8,9,10,11};
		int []z= new int[x.length+y.length];
		
		int i=0;
		for(;i<x.length;i++) {
			z[i]=x[i];
		}
		for(int j=0;j<y.length;j++) {
			z[i]=y[j];
			i++;
		}
		
		System.out.println(Arrays.toString(z));
	}

}
