	package mathsprograms;

public class MaxNumber {

	public static void main(String[] args) {
		int x=1234879543;
		int max=0;
		
		while(x>0) {
			int rem=x%100;             //1 digit pahije asel 10, don pahije asel tar 100
			if(rem>max) {
				max=rem;
			}
			x=x/10;
		}
		System.out.println(max);
	}

}
