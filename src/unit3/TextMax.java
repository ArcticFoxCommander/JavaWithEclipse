package unit3;

import java.util.Scanner;

public class TextMax {

	/** Main method */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);

		System.out.print("Enter first number: ");
		int i = input.nextInt();
		System.out.print("Enter second number: ");
		int j = input.nextInt();
		System.out.println("The maximum between " + i +
				" and " + j + " is " + max(i, j));

		input.close();
	}

	/** Return the max between two numbers */
	public static int max(int num1, int num2) {
		return num1 > num2 ? num1 : num2;
	}
}
