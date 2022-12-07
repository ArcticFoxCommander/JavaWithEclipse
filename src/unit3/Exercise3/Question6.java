package unit3.Exercise3;

import java.util.Scanner;

public class Question6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		System.out.print("Input three numbers: ");
		double a = input.nextDouble();
		double b = input.nextDouble();
		double c = input.nextDouble();
		
		displaySortedNumbers(a, b, c);
		input.close();
	}
	
	public static void displaySortedNumbers(double num1, double num2, double num3) {
		
		if (num3 > num2) {
			double temp = num2;
			num2 = num3;
			num3 = temp;
		}
		if (num2 > num1) {
			double temp = num1;
			num1 = num2;
			num2 = temp;
		}
		if (num3 > num2) {
			double temp = num2;
			num2 = num3;
			num3 = temp;
		}
		
		System.out.println("The numbers in order are: " + num3 + " " + num2 + " " + num1);

		}
	
	}
	
