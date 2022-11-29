package unit3.Exercise2;

import java.util.Scanner;

public class Question4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.print("Input an integer: ");
		int i = input.nextInt();
		sumDigits(i);
		System.out.println("The sum of " + i + " is " + sumDigits(i));
		input.close();
	}

	public static int sumDigits(long n) {
		int i = 0;
		while (n != 0) {
				i += n % 10;
			n /= 10;
		}
		return i;
	}

}
