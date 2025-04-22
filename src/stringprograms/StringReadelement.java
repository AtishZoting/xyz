package stringprograms;

public class StringReadelement {

	public static void main(String[] args) {

		  String s = "testing shastra";
			String[] word = s.split(" ");
			for (int i = 0; i < word.length; i++) {
				for (int j = 0; j < word[i].length(); j++) {
	            System.out.println(j+"="+word[i].charAt(j));
	            
	    			}

	}
	}

}
