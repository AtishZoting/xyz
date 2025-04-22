package patternprograms;

public class DecreasingTraingle {

	public static void main(String[] args) {
		for(int i=1;i<=5;i++) {
			for(int j=5;j>=i;j--) {//for(int j=i;i<=5;j++) ase pan karta yeil
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
