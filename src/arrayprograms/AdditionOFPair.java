package arrayprograms;

public class AdditionOFPair {

	//ashi kontya pair ahe jyachi addition 6 yeil ani kontya position war ahe
	public static void main(String[] args) {
		 int []x={1,2,5,4,3,7,3,4};
		int sum=6;
	    for(int i=0;i<x.length;i++){
	        for(int j=i+1;j<x.length;j++){
	            if(x[i]+x[j]==sum){
	                System.out.println("value "+x[i] +""+x[j]+" index of"+i+" "+j);

	            }
	        }
	    }

	}

}
