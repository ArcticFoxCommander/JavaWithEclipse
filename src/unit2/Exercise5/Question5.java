package unit2.Exercise5;

import java.util.Scanner;

public class Question5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);

		int i = 0;

		do {

			System.out.print("Enter the first string: ");
			String first = input.next();
			System.out.print("Enter the second string: ");
			String second = input.next();

			if (first.indexOf(second) != -1) {
				System.out.println("The common prefix is: " + second);
				i++;
			}
			else {
				System.out.println(first + " and " + second + " have no common prefix.\nTry again.");
				continue;
			}
		} while (i == 0);

		input.close();
	}

}

