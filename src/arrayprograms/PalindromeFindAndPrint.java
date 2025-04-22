package arrayprograms;

public class PalindromeFindAndPrint {

	public static void main(String[] args) {
		int[]x= {121,456,897,787,1001,159};
		
		for(int i=0;i<x.length;i++) {
			int rev=0;
			int copy=x[i];
			while(x[i]!=0) {
				int digit=x[i]%10;
				x[i]=x[i]/10;
				rev=rev*10+digit;
				
			}
			if(copy==rev) {
				System.out.println("number is palindrome "+rev);
			}else {
				System.out.println("number is not palindrome "+rev);
			}
			}
		}
	}


