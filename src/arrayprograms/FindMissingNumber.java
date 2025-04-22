package arrayprograms;

import java.util.ArrayList;

public class FindMissingNumber {

	public static void main(String[] args) {

		int[]x= {0,2,4,5,8,10,12,15,17,20};  //asending or desending order compulsary
		ArrayList<Integer> al= new ArrayList<Integer>();
		ArrayList<Integer> ax= new ArrayList<Integer>();
		int min=x[0];
		int max=x[x.length-1];
		
		for(int i=min;i<=max;i++) {
			al.add(i);
		}
		System.out.println(al);
		
		for(int j=0;j<x.length;j++) {
			ax.add(x[j]);
			}
		System.out.println(ax);
		
		al.removeAll(ax);   //get uncommon element
		System.out.println(al);
		
		//2 nd apporach
		
		
		
		
		
		
		
		
	}

}
