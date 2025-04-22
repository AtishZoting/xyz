package arrayprograms;

public class OccuranceOfVowels {

	public static void main(String[] args) {
		String s="java is programming langauage";
	    char[]ch=s.toCharArray();
	    
	    String s1="aeoiu";
	    char[]ch1=s1.toCharArray();
	    
	    for(int i=0;i<ch1.length;i++){
	        if(ch1[i]==' '){
	            continue;
	        }
	        int count=0;
	        for(int j=0;j<ch.length;j++){
	            if(ch[j]==ch1[i]){
	                count++;
	                ch[j]=' ';
	            }
	        }
	        if(count>=1){
	            System.out.println(ch1[i]+" "+count);
	        }
	    }

	}

}
