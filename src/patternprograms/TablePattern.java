package patternprograms;

public class TablePattern {

	public static void main(String[] args) {
		for(int i=1;i<=5;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print(i*j);
			}
			System.out.println();
		}
	}

}
