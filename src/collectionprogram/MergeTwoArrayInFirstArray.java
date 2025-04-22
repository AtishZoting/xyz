package collectionprogram;

import java.util.ArrayList;

public class MergeTwoArrayInFirstArray {

	public static void main(String[] args) {
		int[]x= {1,2,3,4,5};
		int[]y= {11,22,33,44,55,87};
		
		ArrayList<Integer>al= new ArrayList<>();
		for(int i:x) {
			al.add(i);
		}
		ArrayList<Integer>ay= new ArrayList<>();
		for(int i:y) {
			ay.add(i);
		}
		
		al.addAll(ay);
		System.out.println(al);
	}

}
