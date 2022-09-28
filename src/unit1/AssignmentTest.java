package unit1;

import java.util.Scanner;

public class AssignmentTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		System.out.print("Input your number to double: ");
		int digit = input.nextInt();
		
		digit += digit;
		
		System.out.println("Your number doubled is: " + digit);
	}

}
