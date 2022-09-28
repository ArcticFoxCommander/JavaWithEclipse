package unit1.Exercise5;

import java.util.Scanner;

public class Question9_V2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);

		System.out.print("Input 3 numbers: ");
		double a = input.nextDouble();
		double b = input.nextDouble();
		double c = input.nextDouble();

		double d = (b * b) - (4 * a * c);

		if(d < 0) {
			System.out.println("The equation has no real roots !!!");
		}
		else {
			if(d == 0) {
				System.out.println("The equation has one root !!!" + (-1 * b)/(2 * a));
			}
			else {
				double r1 = ((-1 * b) + Math.pow(d, 0.5)) / (2 * a);
				double r2 = ((-1 * b) - Math.pow(d, 0.5)) / (2 * a);
				System.out.printf("The equation has two roots %.2f and %.2f", r1, r2);

				input.close();
			}
		}
	}
}
