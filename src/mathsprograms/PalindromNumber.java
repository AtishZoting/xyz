package mathsprograms;

public class PalindromNumber {

	public static void main(String[] args) {

		int num=7887;
		int copy=num;
		int rev=0;
		
		while(num>0) {
			int digit=num%10;  //7 8 8 7
			rev= rev*10+digit;  //0*10+7=7 7*10+8=78 78*10+7=787 787*10+7=78
			num=num/10;   //788 78 7 0
		}
		System.out.println(copy);
		if(copy==rev) {
			System.out.println("number is palindrome "+rev);
		}else {
			System.out.println("number is not palindrome "+rev);
		}
	}

}
