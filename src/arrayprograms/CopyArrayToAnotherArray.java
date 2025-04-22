package arrayprograms;

public class CopyArrayToAnotherArray {

	public static void main(String[] args) {

		int[] x = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		int[] y = new int[x.length];

		for (int i = 0; i < x.length; i++) {
			y[i]=x[i];
		
		}
		for (int i : y) {
			System.out.print(i+" ");
		}
	}

}
