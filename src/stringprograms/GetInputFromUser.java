package stringprograms;

import java.util.*;
public class GetInputFromUser {

	public static void main(String[] args) {

		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter your Name");
		String name=sc.next();
		System.out.println(name);    //next madhi space nantar che get nahi
		
		System.out.println("Enter your age year & month");
		float age=sc.nextFloat();
		System.out.println(age);
		
		System.out.println("Enter your mobile Number");
		 long mno= sc.nextLong();
		 System.out.println(mno);
		 
		 System.out.println("Enter your Full Name");
		 String fname=sc.nextLine();
		 System.out.println(fname);
	
		 System.out.println("Enter Character");
		 char s=sc.next().charAt(0);
		 System.out.println(s);
		 
		 sc.close();
	
	}

}
