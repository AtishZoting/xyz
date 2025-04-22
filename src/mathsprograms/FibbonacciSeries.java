package mathsprograms;

public class FibbonacciSeries {

	public static void main(String[] args) {
		int a=0;
		int b=1;
		
		for(int i=1;i<=10;i++) {
			//System.out.print(a+" "); //0 1 1 2 3 5 8 13 21 34 
			int c=a+b;
			a=b;
			b=c;
			System.out.print(c+" ");  //1 2 3 5 8 13 21 34 55 89
		}
	}

}
