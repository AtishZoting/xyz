package mathsprograms;

public class ArmStrongNumber {

	public static void main(String[] args) {

		int x=153;
		int copy=x;
		int sum=0;
		
		while(x>0) {
			int rem=x%10;
			sum=sum+rem*rem*rem;
			x=x/10;
		}
		
		if(copy==sum) {
			System.out.println("armstrong");
		}else
			System.out.println("not armstrong");
	}

}
