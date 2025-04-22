package mathsprograms;

public class ReverseNumber {

	public static void main(String[] args) {
	/*	int num=54321;
		int rev=0;//1
		
		while(num>0) {
			int rem=num%10;//1  2 3
			rev=rev*10+rem;//0*10+1=1   1*10+2=12 12*10+3=123
			num=num/10;//5432  543
		}
		
		System.out.println(rev);
		*/
		
		// 2nd logic
		
		int num=123456;
		
		StringBuffer sb= new StringBuffer(String.valueOf(num));
		//System.out.println(sb.reverse());
		 
		StringBuffer rev=sb.reverse();
		System.out.println(rev);
		
	}

}
