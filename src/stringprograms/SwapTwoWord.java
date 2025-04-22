package stringprograms;

public class SwapTwoWord {

	public static void main(String[] args) {

		// i am atish zoting
		//am i zoting atish
		
		String s="i am atish zoting";
		String[]sp=s.split(" ");
		
		for(int i=0;i<sp.length;i+=2) {
			String temp=sp[i];
			sp[i]=sp[i+1];
			sp[i+1]=temp;
		}
		
		for(int i=0;i<sp.length;i++) {
			System.out.print(sp[i]+" ");
		}
		
	}

}
