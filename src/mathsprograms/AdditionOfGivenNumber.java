package mathsprograms;

import java.util.Scanner;

public class AdditionOfGivenNumber {

	public static void main(String[] args) {
		
		System.out.println("Enter Number");
		Scanner sc= new Scanner(System.in);
		
		
		int x=sc.nextInt();
		int res=0;
		
		while(x>0) {
			int digit=x%10; //5
			res=res+digit;
			x=x/10;
			
		}
		
		System.out.println("Sum of Given number is ="+res);
		sc.close();
	}

}
