package unit1;

import java.util.Scanner;

public class RunwayLength {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Input speed and acceleration: ");
		double v = input.nextDouble();
		double a = input.nextDouble();
		
		double mrl = (v * v) / (2 * a);
		
		System.out.printf("The minimum runway length is: %.3f\n", mrl);
		
		input.close();
		
	}

}
