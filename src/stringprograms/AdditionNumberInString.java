package stringprograms;

public class AdditionNumberInString {

	public static void main(String[] args) {

		String s="my1name2is3atish4"; //1 2 3 4 this is number get addition of this number
		int sum=0;
		
		for(int i=0;i<s.length();i++) {
			if(Character.isDigit(s.charAt(i))) {
				int x= Integer.parseInt(s.charAt(i)+"");
				sum=sum+x;
			}
		}
		System.out.println(sum);
	}

}
