package unit3.Assignment1;

import java.util.Scanner;

public class Question1_V2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);

		System.out.print("PLEASE MAKE A SELECTION (0 = FAHRENHEIT TO CELSIUS | 1 = CELSIUS TO FAHRENHEIT | 2 = EXIT): ");
		int num = input.nextInt();

		switch(num) {
		case 0:
			System.out.print("Please input a temperature in F to convert to C: ");
			final double f = input.nextDouble();
			System.out.println(f + "F = " + celsius(f) + "C");
			break;

		case 1:
			System.out.print("Please input a temperature in C to convert to F: ");
			final double c = input.nextDouble();
			System.out.println(c + "C = " + fahrenheit(c) + "F");
			break;

		default:
			input.close();
			System.exit(0);


		}
	}



	public static double celsius(final double f) {
		return 5.0 / 9.0 * (f - 32);
	}

	public static double fahrenheit(final double c) {
		return 9.0 / 5.0 * c + 32;
	}

}

