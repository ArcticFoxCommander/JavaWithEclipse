package unit1.Exercise3;

import java.util.Scanner;

public class Question12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try (Scanner input = new Scanner(System.in)) {
			System.out.print("Input Driving Distance:");
			double dd = input.nextDouble();
			
			System.out.print("Input Miles Per Gallon: ");
			double mpg = input.nextDouble();
			
			System.out.print("Input Price Per Gallon: ");
			double ppg = input.nextDouble();
			
			double cost;
			
			cost = (dd / mpg) * ppg;
			
			System.out.println("The cost of driving is $" + cost);
		}
	}
}
