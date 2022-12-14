package unit3.Assignment2;

import java.util.Scanner;

public class CreditCardValidator {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		java.io.File file = new java.io.File("creditcardnumbers.txt");

		Scanner input = new Scanner(file);

		while (input.hasNext()) { 
			long num = input.nextLong();

			if (isValid(num)) {
				System.out.println("True");
			}
			else {
				System.out.println("False");
			}
		} 
		input.close();


		long num = 4388576018402626L;

	}

	public static boolean isValid(long number) {
		String num = Long.toString(number);
		if (getSize(number) >= 13 && getSize(number) <= 16) {
			return true;
		}
		else {
			return false;
		}

	}

	public static int getSize(long d) {
		String num = Long.toString(d);
		return num.length();
	}

	public static long getPrefix(long number, int k) {
	}

	public static boolean prefixMatched(long number, int d) {

		String num = Long.toString(number);
		String s = k + "";
		return num.startsWith(s);
	}

	public static int getDigit (int number) {

	}

	public static int getDigitFromIndex(long number, int index) {

	}

	public static int sumOfDoubleEvenPlace(long number) {

	}

	public static int sumOfOddPlace (long number) {

	}

	public static long readCreditCardNumber() {

	}
	
	public static void headerAssignment() {
		
	}

}
