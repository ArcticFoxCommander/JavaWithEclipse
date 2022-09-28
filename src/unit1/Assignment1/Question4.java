package unit1.Assignment1;

import java.util.Scanner;

public class Question4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		
		System.out.print("Balance: ");
		double bal = input.nextDouble();
		
		System.out.print("AIR: ");
		double air = input.nextDouble();
		
		double interest;
		
		interest = bal * (air/1200);
		
		System.out.println(interest);
		
	}

}
