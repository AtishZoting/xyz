package stringprograms;

public class DuplicateElementInString {

	public static void main(String[] args) {
		String s = "atishat";
		char[] ch = s.toCharArray();

		for (int i = 0; i < ch.length; i++) {
			for (int j = i + 1; j < ch.length; j++) {
				if (ch[i] == ch[j]) {
					System.out.print(ch[i] + " ");
				}

			}
		}
		System.out.println();
		String s1 = "testinge";
		for (int i = 0; i < s1.length(); i++) {
			for (int j = i + 1; j<s1.length()  ; j++) {
				if (s1.charAt(i) == s1.charAt(j)) {
					System.out.print(s1.charAt(i) + " "+i);
				}
			}
		}

	}
}
