package collectionprogram;

import java.util.ArrayList;

public class FindLastCharacterOfString {
	public void m1(String[] s) {
		for (int i = 0; i < s.length; i++) {
			// System.out.println(s[i]);
			String c = s[i].substring(s[i].length() - 1);
			System.out.println(c);
		}
	}

	public static void main(String[] args) {
		FindLastCharacterOfString he = new FindLastCharacterOfString();
		String[] sp = { "java", "selenium", "testng" };
		he.m1(sp);

		// 2 nd way
		
		  //List<String> stringList = Arrays.asList("Hello", "World", "Java", "Programming");

	    ArrayList<String>al= new ArrayList<String>();
	    al.add("java");
	    al.add("selenium");
	    al.add("testng");
	    
	    for(String s:al){
	        if(s.length()>0){
	            System.out.println(s.charAt(s.length()-1));
	        }
	    }
	/*
	    
	    List<String>al= Arrays.asList("java","selenium","maven");
        for(String s:al){
            char c=s.charAt(s.length()-1);
            System.out.println(s+" ="+c);
        }
*/
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
		
	}
}
