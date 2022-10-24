package unit2.Exercise2;

import java.util.Scanner;

public class Question1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Create a Scanner
		Scanner input = new Scanner(System.in);
		int pin = 0;

		do {

			System.out.print(
					"Enter your pin: ");
			pin = input.nextInt();
		} while (pin != 1234);

		System.out.println("The pin is correct");

		input.close();
	}

}
