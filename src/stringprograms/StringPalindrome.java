package stringprograms;

public class StringPalindrome {

	public static void main(String[] args) {

		String s="madams";
		String rev="";
		
		for(int i=0;i<s.length();i++) {
			rev=s.charAt(i)+rev;
		}
		System.out.println(rev);
		if(s.equals(rev)) {
			System.out.println("palindrome");
		}else
			System.out.println("not palindrome");
	}

}
