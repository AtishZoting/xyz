package arrayprograms;

public class OddNumberOccurance {

	public static void main(String[] args) {
		int[] x = { 1, 2, 2, 3, 4, 5, 6, 3, 1, 5, 1, 9 };

		for (int i = 0; i < x.length; i++) {
			if (x[i] % 2 != 0) {
				if (x[i] == 0) {
					continue;
				}

				int count = 1;
				for (int j = i + 1; j < x.length; j++) {
					if (x[i] == x[j]) {
						count++;
						x[j] = 0;
					}
				}

				if (count >= 1) {
					System.out.println(x[i] + "=" + count);
				}
			}
		}
	}

}
