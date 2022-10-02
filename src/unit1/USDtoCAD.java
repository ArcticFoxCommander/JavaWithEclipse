package unit1;

import java.util.Scanner;

public class USDtoCAD {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);

		System.out.print("Enter the excahnge rate for USD to CAD: ");
		double exrt = input.nextDouble();

		System.out.print("Enter 0 for USD to CAD or 1 for CAD to USD: ");
		double mode = input.nextDouble();

		System.out.print("Enter the amount you want to convert: ");
		double amt = input.nextDouble();

		double USD, CAD;

		if (mode == 0) {
			CAD = amt / exrt;
			System.out.printf("$ %.2f USD is %.2f CAD", amt, CAD);}
		else if (mode == 1) {
			USD = amt * exrt;
			System.out.printf("$ %.2f CAD is %.2f USD", amt, USD);}
		else {
			System.out.println("You made an error. Please enter 0 for USD to CAD and 1 for CAD to USD.");}

		input.close();
	}
}


