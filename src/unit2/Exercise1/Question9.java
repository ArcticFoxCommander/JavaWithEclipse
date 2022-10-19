package unit2.Exercise1;

import java.util.Scanner;

public class Question9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		System.out.print("Input a number: ");
		int a1 = input.nextInt();
		
		int num = a1;
		int sum = 0;
		
		while(num > 0) {
			sum = sum + num % 10;
			num = num / 10;
		}

		System.out.println("The sum of " + a1 + " is " + sum); // Your result.

		input.close();


	}
}

