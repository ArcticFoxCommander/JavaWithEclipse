package unit1.Exercise5;

import java.util.Scanner;

public class Question7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		
		System.out.print("Input 2 numbers: ");
		int a = input.nextInt();
		int b = input.nextInt();
		
		if(a % b == 0)
			System.out.println(a + " is multiple of " + b);
		else
			System.out.println("No.");
		
		input.close();
	}

}
