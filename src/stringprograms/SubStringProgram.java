package stringprograms;

public class SubStringProgram {

	public static void main(String[] args) {
		String s = "AtishZoting";
		System.out.println(s.substring(5)); // Zoting     5 pan including asan 
		System.out.println(s.substring(0, 5));// Atish    0 pasun start hoil ani 4 paryant print karan 5 exclude aste
		System.out.println(s.substring(2, 3));// i

		System.out.println(s.substring(s.length()-1));//g Print hoil
		
		String s1 = "aTISH";
		String firstLetter = s1.substring(0, 1).toUpperCase(); //A
		String remLetters = s1.substring(1).toLowerCase();     //tish
		System.out.print(firstLetter + remLetters);

	}

}
