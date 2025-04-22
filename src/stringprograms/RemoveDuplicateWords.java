package stringprograms;

import java.util.LinkedHashSet;

public class RemoveDuplicateWords {

	public static void main(String[] args) {
		String s="i am atish i am from pune";
		String[]sp=s.split(" ");
		
		for(int i=0;i<sp.length;i++) {
			if(sp[i]=="") {
				continue;
			}
			int count=1;
			for(int j=i+1;j<sp.length;j++) {
				if(sp[i].equals(sp[j])) {
					count++;
					sp[j]="";
				}
			}
			if(count>=1) {
				System.out.print(sp[i]+" ");
			}
		}
		System.out.println();
	
	//2nd apporach
		String s1="i am atish i am from pune";
		String[]sp1=s.split(" ");
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
