package patternprograms;

public class AlphaPattern1 {

	public static void main(String[] args) {
		char c='a';
		for(int i=1;i<=5;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print(c);
				c++;
			}
			System.out.println();
		}
	}

}
//a
//bc
//def
//ghij
//klmno