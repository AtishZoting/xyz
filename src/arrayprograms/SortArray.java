package arrayprograms;

import java.util.Arrays;

public class SortArray {

	public static void arraySortInBildMethod(int[] x) {

		Arrays.sort(x);
		for (int i = 0; i < x.length; i++) {
			System.out.print(x[i]);
		}
	}

	public static void usingForLoopSortArray(char[] ch) {

		for (int i = 0; i < ch.length; i++) {
			for (int j = i + 1; j < ch.length; j++) {
				if (ch[i] > ch[j]) {
					char temp = ch[i];
					ch[i] = ch[j];
					ch[j] = temp;
				}
			}
		}

		for (char c : ch) {
			System.out.print(c + " ");
		}

	}

	public static void main(String[] args) {
		char[] ch = { 'b', 'a', 'd', 'c', 'f', 'e' };
		int []a= {2,8,9,1,3,5,4};
		SortArray.arraySortInBildMethod(a);
		SortArray.usingForLoopSortArray(ch);
		
	
	}

}
