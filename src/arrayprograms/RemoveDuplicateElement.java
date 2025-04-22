package arrayprograms;

public class RemoveDuplicateElement {

	public static void main(String[] args) {
		int []x={1,2,3,4,5,20,3,2};
		
		for(int i=0;i<x.length;i++) {
			if(x[i]==0) {
				continue;
			}
			int count=0;
			for(int j=i+1;j<x.length;j++) {
				if(x[i]==x[j]) {
					x[j]=0;
					count++;
				}
			}
			if(count==0) {  //0 chi unquie > ni fakt dulpcate vale  >= unquie ani duplicate che pahile
				System.out.println(x[i]);
			}
		}
	}

}
