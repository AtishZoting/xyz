package mathsprograms;

public class CountEvenAndOddDigit {

	public static void main(String[] args) {
		int x=1546984;
		
		int count_odd=0;
		int count_even=0;                        //check karto odd no kiti ani even number kiti
		
		while(x>0) {
			int rem=x%10;
			if(rem%2==0) {
				count_even++;
			}else {
				count_odd++;
			}
			x=x/10;
		}
		
		System.out.println("count_odd "+count_odd);
		System.out.println("count_even "+count_even);
	}

}
