package arrayprograms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.TreeSet;

public class FindMaxElement {

	public static void main(String[] args) {

		int[] x = { 2, 5, 11, 25, 101, 35, 1001 };
		int max = x[0];
		for (int i = 0; i < x.length; i++) {
			if (x[i] > max) {
				max = x[i];
			}
		}
		System.out.println("1St way "+max);
		
		
		
		

		Arrays.sort(x);
		System.out.println("2nd way "+x[x.length-1]);
		
		TreeSet<Integer> tset= new TreeSet<Integer>();
		for(int add:x) {
			tset.add(add);
		}
		//tset.pollLast();    //second last pahije asel tar he vaparne
		System.out.println("3rd way "+tset.last());
		
		
		// 3rd way
		int[] a1 = { 2, 5, 11, 25, 101, 35, 1001 };
		int maxno = 0;
		
		for(int i=0;i<a1.length;i++) {
			for(int j=i+1;j<a1.length;j++) {
				if(a1[i]>a1[j]) {
					maxno=a1[i];
					a1[i]=a1[j];
					a1[j]=maxno;
				}
					
				}
			}
		System.out.println("4th way "+maxno);
		}
		
		
	}


