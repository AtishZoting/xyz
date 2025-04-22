package arrayprograms;

public class CommonElementsInTwoArrays {

	public static void main(String[] args) {
		int []x= {1,3,4,9,6,8};
		int[] y= {2,4,6,10,12,15};
		
		for(int i=0;i<x.length;i++) {
			for(int j=0;j<y.length;j++) {
				if(x[i]==y[j]) {
					System.out.print(x[i]+" ");
				}
			}
		}
		
	}

}
