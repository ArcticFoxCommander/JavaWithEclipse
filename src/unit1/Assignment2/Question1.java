package unit1.Assignment2;

import java.util.Scanner;

public class Question1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the weight or the package: ");
		double weight = input.nextDouble();
		
		if (weight > 50) {
			System.out.println("Sorry, this package cannot be shipped");}
		else { 
			
			double cost;
			
			if (weight > 0 && weight <=1)
				cost = 3.5;
			else if (weight <= 3)
				cost = 5.5;
			else if (weight <= 10)
				cost = 8.5;
			else 
				cost = 10.5;
			System.out.println("The shipping cost for the package is $" + cost * weight);
			
			input.close();
			
		}
		
	}

}
