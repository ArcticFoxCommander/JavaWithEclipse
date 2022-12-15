package unit3.Assignment2;

import java.util.Scanner;

public class CreditCardValidator {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub


		Scanner inputnum = new Scanner(System.in);
		
			System.out.print("CREDIT CARD VALIDATOR (0 = IMPORT A FILE | 1 = MANUAL INPUT | 2 = EXIT): ");
			i = inputnum.nextInt();

			if (i == 0) {
				// Input the creditcardnumbers text file.
				java.io.File file = new java.io.File("creditcardnumbers.txt");

				Scanner input = new Scanner(file);

				// While each line has a string, check if the validator returns true for valid or false for invalid credit card number.
				while (input.hasNext()) { 
					long num = input.nextLong();

					System.out.println(isValid(num) ? num + " is a valid credit card number." : num + " is an invalid credit card number.");
				}
				input.close();
			}
			else if (i == 1) {
				readCreditCardNumber();
				inputnum.close();
			}
			else if (i == 2) {
				System.exit(0);
			}


			long num = 4388576018402626L;

		}

	}

	public static void readCreditCardNumber() {
		Scanner input = new Scanner(System.in);
		System.out.print("Input a credit card number: ");
		long num = input.nextLong();
		System.out.println(isValid(num) ? num + " is a valid credit card number." : num + " is an invalid credit card number.");
	}

	// Checks all the rules of Luhn if all methods return true then it will be a valid credit card number.
	public static boolean isValid(long number) {
		if ((getSize(number) >= 13 && getSize(number) <= 16) && (prefixMatched(number, 4 ) || prefixMatched(number, 5) || prefixMatched(number, 6) || prefixMatched(number, 37))) {
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

	public static boolean prefixMatched(long number, int d) {

		return (getPrefix(number, getSize(d))) == d;
	}

	public static long getPrefix(long number, int k) {
		if (getSize(number) > k) {
			String num = Long.toString(k);
			return num.substring(k);
		}
	}

	public static int getDigit (int number) {

	}

	public static int getDigitFromIndex(long number, int index) {

	}

	public static int sumOfDoubleEvenPlace(long number) {
		int i = 0;
		while (i  * 8 == 8) {

		}
	}

	public static int sumOfOddPlace (long number) {

	}



	public static void headerAssignment() {

	}

}
