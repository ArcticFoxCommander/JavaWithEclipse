package unit3;

import java.util.Scanner;

public class FindHypotenuseWithMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double z = 0;
		Scanner input = new Scanner(System.in);
		System.out.println("enter side x: ");
		double x = input.nextDouble();
		System.out.println("enter side y: ");
		double y = input.nextDouble();
		System.out.println("the hypotenuse is: " + z);
		input.close();
	}
	
	public static double hyp(double x, double y) {
		double z = 0;
		return z = Math.sqrt((x*x) + (y*y));
	}

}

