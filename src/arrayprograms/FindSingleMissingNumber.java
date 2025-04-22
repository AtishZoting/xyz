package arrayprograms;

public class FindSingleMissingNumber {

	public static void main(String[] args) {

		int[]x= {1,2,4,5,6,7,8};
		int sum1=0;
		int sum2=0;
		 
		for(int i=0;i<x.length;i++) {
			sum1=sum1+x[i];
		}
		System.out.println("Addition of Element "+sum1);
	
		for(int i=x[0];i<=x[x.length-1];i++) {
			sum2=sum2+i;
		}
		System.out.println("Total count of range "+sum2);
		
		System.out.println("missing no is "+(sum2-sum1));
	}
	

}
