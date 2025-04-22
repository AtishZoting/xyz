package stringprograms;


public class VowelsAndConstantCount {

	public static void main(String[] args) {
		
		String s="aatishzoting";
		int vovelCount=0;
		int consoCount=0;
		
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i)=='a'||s.charAt(i)=='e'||s.charAt(i)=='i'||s.charAt(i)=='o'||s.charAt(i)=='u'){
					vovelCount++;
			}else
				consoCount++;
		
		}
		System.out.println("count of vowels "+vovelCount);
		System.out.println("count of consonant "+consoCount);
	}
	}
