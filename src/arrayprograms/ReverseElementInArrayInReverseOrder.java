package arrayprograms;

public class ReverseElementInArrayInReverseOrder {

	public static void main(String[] args) {
		int []x= {48,102,98,369,1005,1,58};
		int []y= new int[x.length];
		int index=0;
		
//		//forword direction revese  84 201 89 963 5001 1 85 
//		
//		for(int i=0;i<x.length;i++) {
//			int rev=0;
//			while(x[i]>0) {
//				int rem=x[i]%10;
//				rev=rev*10+rem;
//				x[i]=x[i]/10;
//			}
//			y[index]=rev;
//			index++;
//		}
		
//		for(int i=0;i<y.length;i++) {
//			System.out.print(y[i]+" ");
//		}
		
		//backword Direction reverse 85 1 5001 963 89 201 84 
		
		for(int i=x.length-1;i>=0;i--) {
			int rev=0;
			while(x[i]>0) {
				int rem=x[i]%10;
				rev=rev*10+rem;
				x[i]=x[i]/10;
			}
			
			y[index]=rev;
			index++;
		}
		
		for(int i=0;i<y.length;i++) {
			System.out.print(y[i]+" ");
		}
	}

}
