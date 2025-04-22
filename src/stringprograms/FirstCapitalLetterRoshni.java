package stringprograms;

public class FirstCapitalLetterRoshni {

	public static void main(String[] args) {
		String s="hello world";
		String[]sp=s.split(" ");
		String res="";
		
		for(int i=0;i<sp.length;i++) {
				res=res+Character.toUpperCase(sp[i].charAt(0))+sp[i].substring(1)+" ";
		}
		
		System.out.println(res);
	}

}
