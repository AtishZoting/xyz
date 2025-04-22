package arrayprograms;

public class SwapZeroRightSIde {

	public static void main(String[] args) {
		int[] x={1,0,2,3,0,5,0,16,7,0};
	    for(int i=0;i<x.length;i++){
	        for(int j=i+1;j<x.length;j++){
	            if(x[i]==0){
	               int  temp=x[i];
	                x[i]=x[j];
	                x[j]=temp;
	            }
	        }
	    
	    }
	    for(int i=0;i<x.length;i++){
	        System.out.print(x[i]+" ");
	    }
	}

}
