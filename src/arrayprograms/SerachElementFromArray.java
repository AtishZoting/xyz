package arrayprograms;

public class SerachElementFromArray {

	public static void main(String[] args) {
		int[]x= {10,20,30,40,50};
		int sno=30;
		int count=0;     //if serach no not found in array that why we use
		
		for(int i=0;i<x.length;i++) {
			if(sno==x[i]) {
				System.out.println("number is found in array and position is "+i);
				count++;
				break;   // sapadla tar lagech break kar pudhe jaychi garaj nai
			}
		}
		if(count==0) {
			System.out.println("number is not found in array");
		}
		
	}

}
