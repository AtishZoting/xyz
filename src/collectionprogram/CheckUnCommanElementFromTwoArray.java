package collectionprogram;

import java.util.ArrayList;

public class CheckUnCommanElementFromTwoArray {

	public static void main(String[] args) {
		
		int[]x= {10,1,5,15,30,26,27,29};
		int[]y= {15,26,25,18,30,45};
		
		
		ArrayList<Integer>al= new ArrayList<>();
		for(int i:x) {
			al.add(i);
		}
		
		ArrayList<Integer>ay= new ArrayList<>();
		for(int i:y) {
			ay.add(i);
		}
		
		al.removeAll(ay);// uncommon element bet tat
		System.out.println("uncommon element "+al);
	}

}
