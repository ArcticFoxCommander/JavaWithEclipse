package unit2;

import java.util.Scanner;

public class PinAndPasswordChecker {

	public static void main(String[] args) {
		// Create a Scanner
		Scanner input = new Scanner(System.in);
		int pin = 0;
		// Keep reading data until the input is 0
		do {
			// Read the next data
			System.out.print(
					"Enter your pin: ");
			pin = input.nextInt();
		} while (pin != 2979);

		System.out.println("The pin is correct");

		System.out.print(
				"Enter your password: ");
		String pw = input.next();

		switch (pw) {

		case "Littie":
			System.out.println("The password is correct");
			break;
		default:
			System.out.println("Incorrect. Try again");

			input.close();

		}
	}
}

