package unit1.Exercise8;

import java.util.Scanner;

public class Question12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
				
		System.out.print("Enter a three digit number: ");
		int number = input.nextInt();
		
		int first = number / 100;
		int last = number % 100 % 10;
		
		if (first == last) {
		System.out.println("The number " + number + " is a palindrome.");}
		else {
			System.out.println("The number " + number + " is not a palindrome.");}
		
		input.close();
	}

}
