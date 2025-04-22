package patternprograms;

public class SquarePattern {

	public static void main(String[] args) {
		for(int line=1;line<=5;line++) {
			if(line==1|| line==5) {
				for(int ast=1;ast<=5;ast++ ) {
					System.out.print("*");
				}
			}
			else {
				for(int ast=1;ast<=5;ast++) {
					if(ast==1||ast==5) {
						System.out.print("*");
					}else {
						System.out.print(" ");
					}
				}
			}
			System.out.println();
		}
	}

}

//*****
//*   *
//*   *
//*   *
//*****
