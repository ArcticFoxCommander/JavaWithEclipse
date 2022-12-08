package unit3.Exercise3;

import java.util.Scanner;

public class Question8_V2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);

		for (int i = 1; i != 0;) {
			System.out.print("Input a number (0 TO EXIT): ");
			i = input.nextInt();

			if (i == 0) {
				System.exit(0);
				input.close();
			}
			System.out.println((isEven(i)) ? "Even" : "Odd");
		}
	}


	public static boolean isEven(int i) {
		return i % 2 == 0;
	}

}
