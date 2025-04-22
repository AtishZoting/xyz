package stringprograms;

public class FindMaxWord {
	public static void main(String[] args) {
		String s = "my name is atish zoting";
		String[] sp = s.split(" ");
		int max=0;
		String res="";
		
		for(int i=0;i<sp.length;i++) {
			if(sp[i].length()>max) {
				max=sp[i].length();
				res=sp[i];
			}
		}
		System.out.println(res);
		
		
		
		String w="find maximum word in the sentence";
		String[]split= w.split(" ");
		String maxWord="";
		
		for(int i=0;i<split.length;i++) {
			if(split[i].length()>maxWord.length()) {
				maxWord=split[i];
			}
		}
		System.out.println(maxWord);
		
		
	}

}

