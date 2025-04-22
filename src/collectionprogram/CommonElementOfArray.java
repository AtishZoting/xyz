package collectionprogram;

import java.util.ArrayList;

public class CommonElementOfArray {

	public static void main(String[] args) {

		int[]x= {15,26,25,18,30,45};
		int[]y= {10,1,5,15,30,26,27,29};
		
		ArrayList<Integer>al= new ArrayList<>();
		for(int i:x) {
			al.add(i);
		}
		
		ArrayList<Integer>ay= new ArrayList<>();
		for(int i:y) {
			ay.add(i);
		}
		
		al.retainAll(ay);  //common element bet tat
		System.out.println(al);
		
	}

}
