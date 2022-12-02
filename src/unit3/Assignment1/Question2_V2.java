package unit3.Assignment1;

import java.util.Scanner;

public class Question2_V2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in); System.out.print("Input a year: ");
		int year = input.nextInt();


		// for (int year = 2000; year <= 2020; year++) {

			numberOfDaysInAYear(year);

			if (leap(year) == false)
				System.out.println("The year " + year + " has " + numberOfDaysInAYear(year) + " days. It is not a leap year.");
			else
				System.out.println("The year " + year + " has " + numberOfDaysInAYear(year) + " days. It is a leap year.");
		}
	// }

	public static boolean leap(int year) {
		return (year % 4 == 0 && year % 100 != 0) || year % 400 == 0;
	}

	public static int numberOfDaysInAYear(int year) {
		if (leap(year) == true) 
			return 366;
		else
			return 365;
	}

}
