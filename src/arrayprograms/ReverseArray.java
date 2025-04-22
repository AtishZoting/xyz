package arrayprograms;

public class ReverseArray {

	public static void main(String[] args) {

		int []x= {1,2,3,4,5,6,7,8,9};
		
		int []y= new int[x.length];
		
		int index=0;
		
		for(int i=x.length-1;i>=0;i--) {
			y[index]=x[i];
			index++;
		}
		
		for(int i=0;i<y.length;i++) {
			System.out.print(y[i]+" " );
		}
	}

}
