package stringprograms;

public class Punctuations {

	public static void main(String[] args) {
		// this are punctuations  (! , . / ? ; : ' " =) 
		
		String s= "test:ng";
		
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i)==';'||s.charAt(i)==':'||s.charAt(i)=='?') { //etc etc
				System.out.println("punctuatuins present in string index "+i);
			}
		}
		
		
	}

}
