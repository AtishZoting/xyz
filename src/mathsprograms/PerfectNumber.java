package mathsprograms;

public class PerfectNumber {

	public static void main(String[] args) {

		// perfect number manje jo number dila tya number pasun aadhi tyala divisible 0
		// zale pahije
		// ani tyanchi addition karun jo number dila toch ala pahije

		int number = 28;
		int sum = 0;

		for (int i = 1; i < number; i++) {
			if (number % i == 0) {
				sum = sum + i;
			}
		}
		if (sum == number) {
			System.out.println("no is perfect " + sum);
		} else
			System.out.println("no is not perfect " + sum);
	}

}
