package mathsprograms;

public class Swap1 {

	public static void main(String[] args) {
		int x=20;
		int y=22;
		
		System.out.println("before swapping x= "+x);
		System.out.println("before swapping y= "+y);
	/*	
		x=x+y;
		y=x-y;
		x=x-y;
		
		System.out.println("After swapping x= "+x);
		System.out.println("After swapping y= "+y);
	*/	
		//2nd logic
		//without using third variable but in a or b value should not be zero;
		
	/*	x=x*y;    //	20*22=440;
		y=x/y;      //440/22=20;
		x=x/y;        //440/20=22
		System.out.println("After swapping x= "+x);
		System.out.println("After swapping y= "+y);*/
		
		//3rd logic
		//bitwise XOR(^)
		
		x=x^y;
		y=x^y;
		x=x^y;
		
		System.out.println("After swapping x= "+x);
		System.out.println("After swapping y= "+y);
	
	}

}
