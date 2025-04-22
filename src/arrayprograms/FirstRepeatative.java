package arrayprograms;

public class FirstRepeatative {

	public static void main(String[] args) {
		int[] x = { 1, 5, 15,5, 2, 8, 6, 8, 15, 3 };

		for (int i = 0; i < x.length; i++) {
			int count=0;
			for (int j = 0; j < i; j++) {
				
				if (x[i] == x[j]) {
					//System.out.println(x[i]);
					//return;   //exit karto ani value return karto
					count++;	    
				}
				
			}
			if(count==1){
				System.out.println(x[i]);
				break;
			}
			
			 {
				
			}
		}
	}

}
