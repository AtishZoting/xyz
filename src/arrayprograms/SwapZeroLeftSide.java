package arrayprograms;

public class SwapZeroLeftSide {

	public static void main(String[] args) {
		int[] x={1,0,2,3,0,5,0,16,7,0};
		for(int i=x.length-1;i>=0;i--) {
			for(int j=i-1;j>=0;j--) {
				if(x[i]==0) {
					int temp=x[i];
					x[i]=x[j];
					x[j]=temp;
				}
			}
		}
		//0
		for(int i=0;i<x.length;i++) {
			System.out.print(x[i]+" ");
		}
	}

}
