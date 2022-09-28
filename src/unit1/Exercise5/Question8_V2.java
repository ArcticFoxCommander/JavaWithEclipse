package unit1.Exercise5;

import java.util.Scanner;

public class Question8_V2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		System.out.print("Input a number: ");
		int a = input.nextInt();
		
		if (a >= 0)
			System.out.println(a + " is positive " );
		else
			System.out.println(a + " is negative " );
		
		input.close();
	}

}
