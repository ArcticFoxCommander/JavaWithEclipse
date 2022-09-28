package unit1.Assignment1;

import java.util.Scanner;

public class Question1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Miles driven per day: ");
		double mpd = input.nextDouble();
		
		System.out.print("Cost per gallon of gas: ");
		double cpg = input.nextInt();

		System.out.print("Average miles per gallom: ");
		double mpg = input.nextInt();
		
		System.out.print("Parking fees per day: ");
		double pf = input.nextDouble();
		
		System.out.print("Tolls per day: ");
		double t = input.nextDouble();
		
		double gas, ddc;
		
		gas = (mpd / mpg)* cpg; // Fuel calculation.
		ddc = gas + pf + t; // Adding fuel, parking fees, and tolls together.
		
		System.out.println("The daily driving cost is: $" + ddc);
		
		input.close();
	}

}
