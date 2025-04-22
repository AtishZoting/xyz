package arrayprograms;

import java.util.Arrays;
import java.util.TreeSet;

public class FindSecondMax {
	
		
	
	public static void main(String[] args) {
	
		int[] x = { 2, 5, 11, 25, 101, 35, 1001 };

		Arrays.sort(x);
		System.out.println(x[x.length-2]);
		
		TreeSet<Integer> tset= new TreeSet<Integer>();
		for(int add:x) {
			tset.add(add);
		}
		tset.pollLast();
		System.out.println(tset.last());

	}
	
	
}




