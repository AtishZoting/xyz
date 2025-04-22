package collectionprogram;

import java.util.ArrayList;

public class FirstLetterCapital {

	public static void main(String[] args) {
		String s="my name is atish";
		String[]sp=s.split(" ");
		String res="";
		
		ArrayList<String>al= new ArrayList<>();
		for(String d:sp) {
			al.add(d);
			
		}
		for(String l:al) {
			String word=l.charAt(0)+"";
			res=res+word.toUpperCase()+l.substring(1)+" ";
		}
		
		System.out.println(res);
		
		
		//2nd way
		
		String res2="";
		for(int i=0;i<sp.length;i++) {
			String w=sp[i].substring(0,1).toUpperCase()+sp[i].substring(1)+" ";
			res2=res2+w;
		}
		System.out.println(res2);
	}

}
