package stringprograms;

public class StringInfosys {

	public static void main(String[] args) {

		String s="i am atish";
		String[]sp=s.split(" ");
		String output="";
		
		for(int i=0;i<sp.length;i++) {
			String rev="";
			for(int j=0;j<sp[i].length();j++) {
				if(i%2!=0) {
					rev=sp[i].charAt(j)+rev;
				}else
					rev=rev+sp[i].charAt(j);
			}
			output=rev+" "+output;
	}
		System.out.println(output);

	
	
	}
}
