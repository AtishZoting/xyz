package stringprograms;

import java.util.Arrays;

public class SortString {
	
	public static void main(String[] args) {
		String s="badc";
		char []ch=s.toCharArray();
		Arrays.sort(ch);
		for(int i=0;i<ch.length;i++) {
			System.out.print(ch[i]+" ");
		}
	}

}
