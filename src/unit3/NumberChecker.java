package unit3;

import java.util.Scanner;

public class NumberChecker {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("How many times would you like to check if a number is even?: ");
		int y = input.nextInt();
		int z = 0;
		while (z < y) {
		System.out.print("Input a number: ");
		int x = input.nextInt();
		if (number(x) % 2 == 0)
		System.out.println(number(x) + " is even");
		else
		System.out.println(number(x) + " is odd");
		z++;
		}
		input.close();
	}
	public static int number(int x) {
		return x;
		// return x % 2 == 0 ? true : false;
	}
}
