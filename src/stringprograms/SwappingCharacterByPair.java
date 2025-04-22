package stringprograms;

public class SwappingCharacterByPair {

	public static void main(String[] args) {
		/*
		String s="automation";
		char[]ch=s.toCharArray();
		for(int i=0;i<ch.length;i+=2) {
			char temp=ch[i];
			ch[i]=ch[i+1];
			ch[i+1]=temp;
			
		}
		for(char c:ch) {
			System.out.print(c);
		}
		*/
		
		   String s="automation";
		    String out="";
		    char[]ch=s.toCharArray();
		    
		    for(int i=0;i<ch.length;i+=2){
		        char c=ch[i];
		        ch[i]=ch[i+1];
		        ch[i+1]=c;
		    }
		    for(int i=0;i<ch.length;i++) {
		    	out=out+ch[i]+"";
		    }	
		    System.out.println(out);
	}

}
