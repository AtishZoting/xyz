package stringprograms;

public class SwapStringWithoutUsingThridVariable {

	public static void main(String[] args) {
			
		String a="abcvgvv";
		String b="xyzbhbhb";
		
		a=a+b;  //abcxyz
		b=a.substring(0, a.length()-b.length());//xyz
		a=a.substring(b.length());//abc
		
		System.out.println("a="+a);
		System.out.println("b="+b);
		
		String x="abcbhbh";
		String y="xyzbhbhb";
		
		String s=x;
		x=y;
		y=s;
		System.out.println("x="+x);
		System.out.println("y="+y);
		}

}
