package arrayprograms;

public class CopyOneToAnotherArrayInReverse {

	public static void main(String[] args) {

		int[] x = { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		int[] y = new int[x.length];

		int j=0;
		for(int i=x.length-1;i>=0;i--) {
			y[j]=x[i];
			j++;
		}
		
		
		for (int i : y) {
			System.out.print(i + " ");
		}
	}
}
