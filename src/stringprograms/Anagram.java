package stringprograms;

import java.util.Arrays;

public class Anagram {

	// in boolean meyhod logic
	public static boolean areAnagram(String s, String s1) {
		if (s.length() != s1.length()) {
			return false;
		}
		char[] ch = s.toCharArray();
		char[] ch1 = s1.toCharArray();

		Arrays.sort(ch);
		Arrays.sort(ch1);

		return Arrays.equals(ch, ch1);

	}

	public static void main(String[] args) {
		/*
		 * String s="cat"; String s1="act";
		 * 
		 * char[]ch=s.toCharArray(); char[]ch1=s1.toCharArray(); Arrays.sort(ch);
		 * Arrays.sort(ch1);
		 * 
		 * if(Arrays.equals(ch, ch1)) { System.out.println("given Strings are anagram");
		 * }else System.out.println("given Strings are not anaram");
		 */
		
		
		boolean res = Anagram.areAnagram("cat", "act");
		if(res==true) {
			System.out.println("both are same");
		}else
			System.out.println("both are not same");
	}

}
// 2nd way

//String s="heart";  //heart
//String s1="eahth"; //earth
//
//char[]ch=s.toCharArray();
//char []ch1=s1.toCharArray();
//
//
//int count=0;
//for(int i=0;i<ch.length;i++){
//    for(int j=0;j<ch1.length;j++){
//        if(ch[i]==ch1[j]){
//            count++;
//            break;
//        }
//    }
//}
//if(count==ch.length){
//    System.out.println("given Strings are anagram");
//}else
//System.out.println("given Strings are not anagram");