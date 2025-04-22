package stringprograms;

public class UshaCapg {

	public static void main(String[] args) {
		String s = "demo";
		char[] ch = s.toCharArray();

		for (int i = 0; i < ch.length; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print(ch[i]);
			}
		}
	}

}
