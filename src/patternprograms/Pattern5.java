package patternprograms;

public class Pattern5 {

	public static void main(String[] args) {
		for(int i=1;i<=5;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print(j);
			}
			for(int k=i-1;k>=1;k--) {   //k=i-1 ka getla? i barobar chal la pahije manun fakt i getla tar repeat element karto manun i-1 getla
				System.out.print(k);
			}
			System.out.println();
		}
	}

}

//1
//121
//12321
//1234321
//123454321