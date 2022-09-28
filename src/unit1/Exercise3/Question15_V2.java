package unit1.Exercise3;

import java.util.Scanner;

public class Question15_V2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int b, c, d, digit; // Defined variables :D
		
		try (Scanner input = new Scanner(System.in)) {
			System.out.print("Input a number: ");
			int a1 = input.nextInt();
			
			b = a1 / 10 % 10;
			c = a1 / 100;
			d = a1 % 10;
			
			digit = b + c + d;
			
			System.out.println("The sum of " + a1 + " is " + digit); // Your result.
		}
	}

}