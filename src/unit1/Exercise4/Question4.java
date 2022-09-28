package unit1.Exercise4;

import java.util.Scanner;

public class Question4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Input a temperature in Celcius: ");
		double c = input.nextDouble();
		double f;
		
		f = c * 1.8 + 32;
		
		System.out.println("The temperature in Fahrenheit is: " + f);
		
		input.close();
	}

}
