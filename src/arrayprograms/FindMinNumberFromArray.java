package arrayprograms;

public class FindMinNumberFromArray {

	public static void main(String[] args) {

		int []x= {122,5,6,7,13,100};
		int min=x[0];
		
		for(int i=0;i<x.length;i++) {
			if(x[i]<min) {
				min=x[i];
			}
		}
		System.out.println(min);
	}

}
