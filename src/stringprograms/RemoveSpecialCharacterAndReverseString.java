package stringprograms;

public class RemoveSpecialCharacterAndReverseString {

	public static void main(String[] args) {

		String s="S im && t A";
		s=s.toLowerCase();
		String res="";
		
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i)>='a' && s.charAt(i)<='z') {
				res= s.charAt(i)+res;
			}
		}
		
		
		System.out.println(res);
	}

}
