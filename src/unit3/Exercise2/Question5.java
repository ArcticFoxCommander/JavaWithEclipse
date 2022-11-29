package unit3.Exercise2;

import java.util.Scanner;

public class Question5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.print("Input a number: ");
		int i = input.nextInt();
		reverse(i);
		
		isPalindrome(i);
		
		System.out.println("The number is a palindrome.");
		
	}
	
	public static int reverse(int number) {
		int a, b, s = 0;
		a = number;
		b = 0;
		do {
			b = b * 10 + a % 10;
			a = a / 10;                    
		} while (a != 0);
		if (b == number)
			s = number;
		else
			System.out.println("This number is not a palindrome, try again.");
			System.exit(0);
		return s;
	}
	
	public static boolean isPalindrome(int number) {
		return true;
	}

}
