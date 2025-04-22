package arrayprograms;

import java.util.Scanner;

public class SwitchCase {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter a number (1-7) for the day of the week:");
		String day = scanner.nextLine();

		// Using switch case to determine the day
		switch (day) {
		case "chrome":
			System.out.println("Monday");
			break;
		case "fireFox":
			System.out.println("Tuesday");
			break;
//		case 3:
//			System.out.println("Wednesday");
//			break;
//		case 4:
//			System.out.println("Thursday");
//			break;
//		case 5:
//			System.out.println("Friday");
//			break;
//		case 6:
//			System.out.println("Saturday");
//			break;
//		case 7:
//			System.out.println("Sunday");
//			break;
		default:
			System.out.println("Invalid input! Please enter a number between 1 and 7.");
		}

		scanner.close();

	}

}
