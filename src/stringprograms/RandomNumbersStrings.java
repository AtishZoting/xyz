package stringprograms;

import java.util.Random;

public class RandomNumbersStrings {

	public static void main(String[] args) {
		Random rand= new Random();
	int ranNo=	rand.nextInt(10);   // between 0 to 9 random number (100 = between 0 to 99)
		System.out.println(ranNo);
	}

}
