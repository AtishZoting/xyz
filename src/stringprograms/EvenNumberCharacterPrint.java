package stringprograms;


public class EvenNumberCharacterPrint {
	public static void main(String[] args) {
		String s="atish";
		
		for(int i=0;i<s.length();i++) {
			if(i%2!=0) {
				System.out.print(s.charAt(i)+" ");
			}
		}
		}
	}

