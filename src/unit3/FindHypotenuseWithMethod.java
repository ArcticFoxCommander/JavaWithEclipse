package unit3;

import java.util.Scanner;

public class FindHypotenuseWithMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double z;
		Scanner input = new Scanner(System.in);
		System.out.println("enter side x: ");
		double x = input.nextDouble();
		System.out.println("enter side y: ");
		double y = input.nextDouble();
		z = Math.sqrt((x*x)+(y*y));
		System.out.println("the hypotenuse is: "+z);
		input.close();
	}

}

