package Unit3.Assignment2;

import java.util.Scanner;

public class JavaCreditCardValidator {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		// Display header.
		headerAssignment(); 

		// Input the creditcardnumbers text file. 
		java.io.File file = new java.io.File("creditcardnumbers.txt");

		Scanner input = new Scanner(file);

		// While each line has a string, check if the validator returns true for valid or false for invalid credit card number. 
		while (input.hasNext()) { 
			long num = input.nextLong();

			System.out.println(isValid(num) ? num + " is a valid credit card number." : num + " is an invalid credit card number."); 
		} 
		input.close();
		// Remove the comment below and comment the above if you want to use a singular credit card number instead of the file.
		//** readCreditCardNumber(); **//
	}
	// Read a singluar credit card number.
	public static void readCreditCardNumber() {
		long num = 4388576018410707L;
		System.out.println(isValid(num) ? num + " is a valid credit card number." : num + " is an invalid credit card number.");
	}

	// Checks all the rules of Luhn if all methods return true then it will be a valid credit card number.
	public static boolean isValid(long number) {

		if ((getSize(number) >= 13 && getSize(number) <= 16)&& (prefixMatched(number, 4 ) || prefixMatched(number, 5) || prefixMatched(number, 6) || prefixMatched(number, 37)) && ((sumOfDoubleEvenPlace(number) + sumOfOddPlace(number)) % 10 == 0)) {
			return true;
		}
		else {
			return false;
		}
	}

	// Convert d into a string to get the length of d.
	public static int getSize(long d) {
		String num = Long.toString(d);
		return num.length();
	}

	// Check if this matches the isValid statement.
	public static boolean prefixMatched(long number, int d) {

		return getPrefix(number, getSize(d)) == d;
	}

	// Get the prefix (0-1 Space of the string). 
	public static long getPrefix(long number, int k) {
		if (getSize(number) > k) {
			String num = Long.toString(number);
			String numf = num.substring(0, k);
			long i = Long.valueOf(numf);

			return i;
		}
		return number;
	}

	// Get a digit.
	public static int getDigit (int number) {
		int i = number / 10;
		int j = number % 10;

		if (i == 0) {
			return number;
		}

		else {
			return i+j;
		}
	}

	// From right to left. Take digit off one by one and return.
	public static int getDigitFromIndex(long number, int index) {
		int i = 0;
		while (number > 0 && index > 0) {
			i = (int) (number % 10);
			number = number / 10;
			index--;
		}

		return i;
	}

	// Double every other digit and sum.
	public static int sumOfDoubleEvenPlace(long number) {
		int i = 0;
		int length = getSize(number);
		for (int k = 2; k <= length; k += 2) {
			i += getDigit(2 * (getDigitFromIndex(number, k)));
		}
		return i;
	}

	// Sum every other digit.
	public static int sumOfOddPlace (long number) {
		int i = 0;
		int length = getSize(number);
		for (int k = 1; k <= length; k += 2) {
			i += getDigitFromIndex(number, k);
		}
		return i;
	}

	// Print header.
	public static void headerAssignment() {
		System.out.println("************************************************************");
		System.out.println("***                                                      ***");
		System.out.println("***William & Toby LOL                                    ***");
		System.out.println("***Programming Exercise: 03            December 16th 2022***");
		System.out.println("***Course: Computer Programming 11               Block: A***");
		System.out.println("***Grade: 11                                             ***");
		System.out.println("***Computer: Dell                    IDE: Eclipse 2022-09***");
		System.out.println("***                                                      ***");
		System.out.println("***  Welcome to the Java Credit Card Number Valiadtion.  ***");
		System.out.println("***  ==================================================  ***");
		System.out.println("************************************************************");
	}

}
