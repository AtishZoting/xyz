package patternprograms;

public class AlphaPattern3 {

	public static void main(String[] args) {
		for(int i=1;i<=5;i++) {
			char c='a';
			for(int j=1;j<=i;j++) {
				System.out.print(c);
				c++;
			}
			System.out.println();
		}
	}

}
//a
//ab
//abc
//abcd
//abcde
