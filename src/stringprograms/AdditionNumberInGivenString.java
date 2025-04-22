package stringprograms;

public class AdditionNumberInGivenString {

	public static void main(String[] args) {
		
		String s="h3e11o te5t1g 5ha5tra";
		int res=0;
		
		for(int i=0;i<s.length();i++) {
			if(Character.isDigit(s.charAt(i))) {
				int x= Integer.parseInt(s.charAt(i)+"");
				res=res+x;
			}
		}
		System.out.print(res);
	}

}
