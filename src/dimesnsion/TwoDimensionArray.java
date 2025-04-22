package dimesnsion;

public class TwoDimensionArray {

	public static void readAllElementOfAnArray(int[][] a) {
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[0].length; j++) {
				System.out.print(a[i][j] + " ");
			}
			System.out.println();
		}

	}
	
	public static void readOnlyRows(int [][]a, int rowNumber) {
			for(int i=0;i<a[rowNumber].length;i++) {
				System.out.print(a[rowNumber][i]+" ");
			}
			System.out.println();
		}
		
			
	public static void readOnlyColoum(int [][]a,int colounNumber) {
		for(int i=0;i<a.length;i++) {
			System.out.println(a[i][colounNumber]+" ");
		}
	}
	
	public static void readPerticularElementFromRow(int[][]a,int rNumber,int cNumber) {
		System.out.print(a[rNumber][cNumber]);
	}
	
		
	

	public static void main(String[] args) {
		int[][] a = { { 1, 2 }, { 3, 4 }, { 5, 6 } };
		//readAllElementOfAnArray(a);
		//readOnlyColoum(a, 1);
		readOnlyRows(a, 2);
		//readPerticularElementFromRow(a, 1, 0);
	
		
	for (int i = 0; i < a.length; i++) {	
		for (int j = 0; j < a[1].length; j++) {
			System.out.print(a[i][j]+" ");
		}
		System.out.println();
		
	}
	
	}
	
}


/*
 * int [][]a= new int[][];
 * int [][]a={{1,2},{3,4},{5,6}};
  *  0 1 
 * 0 1 2
 * 1 3 4
 * 2 5 6
 * 
 * 
 * 
 * 
 * 
 */






