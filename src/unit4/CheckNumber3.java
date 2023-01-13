package unit4;

import java.util.Scanner;

public class CheckNumber3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);

		System.out.print("Input a number: ");
		int i = input.nextInt();

		int u = 2;

		if (i <3 && i == u)
			System.out.println("I <3 = U");
		else
			System.out.println("I != 3 U");
		input.close();
	}

}
