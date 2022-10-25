package unit2.Exercise2;

import java.util.Scanner;

public class Question6 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int values, number;
		int i = 1;
		int smallest = 0;
		System.out.println("Enter a integer for the number of values: ");
		values = input.nextInt();
		do {
			System.out.println("Enter an integer for value " + i + ":");
			number = input.nextInt();
			if (i == 1) {
				smallest = number;
			} else if (number < smallest)
				smallest = number;
			i++;
		} while (i <= values);
		System.out.println("The smallest integer is " + smallest);
		input.close();
	}
}