package unit3.Assignment1;

import java.util.Scanner;

public class Question1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);

		while (true) {

			System.out.print("PLEASE MAKE A SELECTION (0 = FAHRENHEIT TO CELSIUS | 1 = CELSIUS TO FAHRENHEIT | 2 = EXIT): ");
			int num = input.nextInt();

			if (num == 0) {
				System.out.print("Please input a temperature in F to convert to C: ");
				double f = input.nextDouble();
				celsius(f);
				System.out.println(f + "F = " + celsius(f) + "C");
				continue;
			}

			if (num == 1) {
				System.out.print("Please input a temperature in C to convert to F: ");
				double c = input.nextDouble();
				fahrenheit(c);
				System.out.println(c + "C = " + fahrenheit(c) + "F");
				continue;
			}

			if (num == 2) {

				input.close();
				System.exit(0);
				break;
			}

		}
	}

	public static double celsius(double f) {
		return 5.0 / 9.0 * (f - 32);

	}

	public static double fahrenheit(double c) {
		return 9.0 / 5.0 * c + 32;
	}

}
