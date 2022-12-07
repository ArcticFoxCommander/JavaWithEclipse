package unit3.Exercise3;

import java.util.Scanner;

public class Question7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);

		System.out.print("Input a password: ");
		String s = input.nextLine();

		if (isValid(s)) {
				System.out.println("Valid Password.");
		}
		else {
			System.out.println("Invalid Password.");
		}
		input.close();
	}

	public static boolean isValid(String s) {
		int count = 0;
		for (int i = 0; i < s.length(); i++) {
			if (!Character.isLetter(s.charAt(i)) && !Character.isDigit(s.charAt(i)))
				return false;

			if (s.length() < 8)
				return false;

			if (Character.isDigit(s.charAt(i)))
				count++;

		}

		if (count >= 2)
			return true;
		else
			return false;
	}

}
