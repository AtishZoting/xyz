package stringprograms;

public class ReverseString {
	
	public void givenStringReverse(String s) {
		String res="";
		for(int i=0;i<s.length();i++) {
			res= s.charAt(i)+res;
		}
		System.out.println(res);
	}
	public static void main(String[] args) {
		new ReverseString().givenStringReverse("atish");
	}

}

//second logic

//String s="automation";
//
//for(int i=s.length()-1;i>=0;i--){
//    System.out.print(s.charAt(i));            
//}


//3rd logic
//String s="atish";
//char[]ch=s.toCharArray();      //convert in array
//
//for(int i=ch.length-1;i>=0;i--){
//    System.out.print(ch[i]);
//}

//4th logic
//String s="atish";
//StringBuffer sb= new StringBuffer(s);
//StringBuffer rev=sb.reverse();
//System.out.println(rev);

//same as StringBuilder class