package mathsprograms;

public class CountNumberLength {

	public static void main(String[] args) {
		int no = 12546789;
		int len = 0;

		while (no > 0) {
			no = no / 10;
			len++;
		}
		System.out.println(len);
	}

}
