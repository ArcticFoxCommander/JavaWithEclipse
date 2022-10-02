package unit1.Assignment2;

import java.util.Scanner;

public class Question3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the excahnge rate for USD to RMB: ");
		double exrt = input.nextDouble();
		
		System.out.print("Enter 0 for USD to RMB or 1 for RMB to USD: ");
		double mode = input.nextDouble();
		
		System.out.print("Enter the amount you want to convert: ");
		double amt = input.nextDouble();
		
		double USD, RMB;
		
		if (mode == 0) {
			RMB = amt * exrt;
			System.out.printf("$ %.2f USD is %.2f RMB", amt, RMB);}
		else if (mode == 1) {
			USD = amt / exrt;
			System.out.printf("$ %.2f RMB is %.2f USD", amt, USD);}
		else {
			System.out.println("You made an error. Please enter 0 for USD to RMB and 1 for RMB to USD.");}
		
		input.close();
	}
}
