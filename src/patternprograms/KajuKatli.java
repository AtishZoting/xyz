package patternprograms;

public class KajuKatli {

	public static void main(String[] args) {

	    int x=6;
	    
	    for(int i=1;i<=x;i++){
	        for(int j=x;j>i;j--){
	            System.out.print(" ");
	        }
	        for(int k=1;k<=i;k++){
	            System.out.print("* ");
	        }
	    
	        System.out.println();
	        
	    }
	    for(int i=1;i<=x-1;i++){
	        for(int j=1;j<i;j++){
	            System.out.print(" ");
	        }
	        for(int k=x-1;k>=i;k--){
	            System.out.print(" *");
	        }
	    
	        System.out.println();
	    }
	}

}
