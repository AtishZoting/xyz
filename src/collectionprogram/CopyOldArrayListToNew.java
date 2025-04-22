package collectionprogram;

import java.util.ArrayList;
import java.util.HashSet;

public class CopyOldArrayListToNew {

	public static void main(String[] args) {

		ArrayList<String> al= new ArrayList<>();
		al.add("apple");
		al.add("bananna");
		//System.out.print(al);
		
		ArrayList<String> ag= new ArrayList<>();
		ag.addAll(al);
		System.out.print(ag);
		
		
		
	}

}
