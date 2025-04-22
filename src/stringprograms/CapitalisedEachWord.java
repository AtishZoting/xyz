package stringprograms;

public class CapitalisedEachWord {
	
	public void capitalLastLetter() {
		String s= "my name is atish";
		String[]words= s.split(" ");
		String res= "";
		
		for(int i=0;i<words.length;i++) {
			int len=words[i].length();
			String caps=words[i].substring(len-1).toUpperCase();
			String firstWords=words[i].substring(0,len-1);
			res=res+firstWords+caps+" ";
		}
		System.out.println(res);

	}
	
	
	private void capitalFirstLetter() {
		String s="my name is atish";
		String[]words= s.split(" ");
		String res="";
		
		for(int i=0;i<words.length;i++) {
			String firstWord= words[i].substring(0,1).toUpperCase();
			String remwords= words[i].substring(1);	
			res= res+firstWord+remwords+" ";
		}
		System.out.println(res);
	}
	
	
	public static void main(String[] args) {
		new CapitalisedEachWord().capitalLastLetter();
		new CapitalisedEachWord().capitalFirstLetter();
	}

}
