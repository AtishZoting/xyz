package stringprograms;

public class StringReverse2 {

	public static void main(String[] args) {
		String s = "testing shastra communi";
		String[] word = s.split(" ");
		String output = ""; //""+
		String firstword="";      //he jar first word tasach teun dusre rev karayche asel tar
		for (int i = 1; i < word.length; i++) {
			 firstword=word[0];
			String rev = "";
			for (int j = 0; j < word[i].length(); j++) {  // eithe condition false hoil 6<6 nahi mang to rev chi valur output madhi store karel
				rev = word[i].charAt(j) + rev;
			}
			output=output+rev+" ";// gnitset+ artsahs    ase sagle chalel
		}

		System.out.println(firstword+" "+output);
	}
}
