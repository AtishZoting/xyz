package stringprograms;

public class CountNumberOfWordsAndNumbersOfCharacters {

	public static void main(String[] args) {
		String s="hi my name is atish";
		String[]words=s.split(" ");
		
		System.out.println("Total Number of Counts : "+words.length);
		
		System.out.println("Total count of each word");
		for(int i=0;i<words.length;i++) {
			System.out.println(words[i]+" : "+words[i].length());
		}
	}

}
