package unit2.Exercise1;

import java.util.Scanner;

public class Question11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);

		System.out.print("Enter a five digit number: ");
		int number = input.nextInt();

		int first = number / 10000;
		int second = number / 1000 % 10;
		int forth = number / 10 % 10;
		int last = number % 100 % 10;

		if (first==last && second==forth) {
			System.out.println("The number " + number + " is a palindrome.");
		}
		else {
			System.out.println("The number " + number + " is not a palindrome. Please enter a new value");
		}

		input.close();
	}
}
