package unit1.Exercise8;

import java.util.Scanner;

public class Question13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);

		System.out.print("Enter month and year:");
		int month = input.nextInt();
		int year = input.nextInt();
		int days = 31;
		String monthString;

		switch (month) {
		case 2:
			if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
				days = 29;
				break;
			}
			days = 28;
			break;

		case 4:
		case 6:
		case 9:
		case 11:
			days = 30;
		}

		switch (month) {
		case 1:
			monthString = "January";
			break;
		case 2:
			monthString = "February";
			break;
		case 3:
			monthString = "March";
			break;
		case 4:
			monthString = "April";
			break;
		case 5:
			monthString = "May";
			break;
		case 6:
			monthString = "June";
			break;
		case 7:
			monthString = "July";
			break;
		case 8:
			monthString = "August";
			break;
		case 9:
			monthString = "September";
			break;
		case 10:
			monthString = "October";	
			break;
		case 11:
			monthString = "November";
			break;
		case 12:
			monthString = "December";
			break;
		default:
			monthString = "Invalid month";
			days = 0;
			break;
		}

		System.out.println(monthString + " " + year + " has " + days + " days");
		input.close();
	}
}