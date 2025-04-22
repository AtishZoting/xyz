package patternprograms;

public class PatternUsingAlpha {

	public static void main(String[] args) {
		char c='a';
		for(int line=1;line<=5;line++) {
			for(int pri=1;pri<=line;pri++) {
				System.out.print(c+" ");
				c++;
			}
			System.out.println();
		}
	}

}
//a 
//b c 
//d e f 
//g h i j 
//k l m n o 
