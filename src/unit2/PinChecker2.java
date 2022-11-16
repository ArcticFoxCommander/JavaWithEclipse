package unit2;

import java.util.Scanner;

public class PinChecker2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner blah = new Scanner(System.in);

		int pin = 0;
		int pincorrect = 0;
		do {

			System.out.print("Enter the correct pin: ");
			pin = blah.nextInt();

			if (pin == 2979) {
				System.out.println("Correct!");
				pincorrect += pin;
			} else {
				System.out.println("Wrong! Try again");
				continue;
			}

		}	while (pincorrect != 2979);

		blah.close();
	}

}
