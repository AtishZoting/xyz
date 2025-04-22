package arrayprograms;

public class AdditionOfEachDigit {

	public static void main(String[] args) {

		int []x= {12,25,36,98};

		for(int i=0;i<x.length;i++) {
			int rem;
			int copy=x[i];
			int result=0;
			while(x[i]>0) {
				rem=x[i]%10;//1
				result=result+rem;//0+,1+4
				x[i]=x[i]/10;//4
			}
			System.out.println(copy+"="+result);
			
		}
		
	}

}
