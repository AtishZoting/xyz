package collectionprogram;

import java.util.LinkedHashSet;

public class DuplicateWordFind {

	public static void main(String[] args) {
		String s1="i am atish i am from pune";
		String[]sp1=s1.split(" ");
		String out="";
		
		LinkedHashSet<String> lh= new LinkedHashSet<>();
		for(String c1:sp1) {
			if(lh.add(c1)==false) {
				out=out+c1+" ";
			}
		}
		System.out.println(out);
	
	}

}
