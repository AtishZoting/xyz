package arrayprograms;

import java.util.ArrayList;

public class CollectionToArrayList {

	public static void main(String[] args) {

		ArrayList<Integer> al= new ArrayList<>();
		al.add(1);
		al.add(2);
		System.out.println(al);
		
		Object[]x= al.toArray();
		for(Object c:x) {
			System.out.print(c+" ");
		}
	}

}
