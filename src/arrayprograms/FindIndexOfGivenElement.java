package arrayprograms;
import java.util.Scanner;


public class FindIndexOfGivenElement {
	
	public static int indexOfArrElem(int []arr1,int value) {
		int indexno=-1;
		for (int i = 0; i < arr1.length; i++) {
			if(arr1[i]==value) {
				return i;
			}
		}
		return indexno;
	}

	public static void main(String[] args) {
		int[] x = {12,25,36,987};
//		int []y= new int[5];
		int number;
		Scanner sc=new Scanner(System.in);
		System.out.print("{");
		for (int i = 0; i < x.length; i++) {
			System.out.print(x[i]+",");
		}
		System.out.print("}");
		System.out.println();
		System.out.println("Enter a Value to find its indexNo :-");
		number=sc.nextInt();
		System.out.println("Index of "+number+" is = "+FindIndexOfGivenElement.indexOfArrElem(x, number));

	}
}
