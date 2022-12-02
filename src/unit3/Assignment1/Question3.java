package unit3.Assignment1;

import java.util.Scanner;

public class Question3 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in); System.out.print("How many times?: ");
		int p = input.nextInt();
		primenumber(p);
	}

	public static void primenumber(int numofprimes) {
		// TODO Auto-generated method stub
		final int lines = 10;
		int count = 0;
		int number = 2;

		while (count < numofprimes) {
			if (prime(number)) {
				count++;

				if (count % lines == 0) {
					System.out.printf("%-10s\n", number);
				}
				else
					System.out.printf("%-10s", number);
			}
			number++;
			

		}
	}

	public static boolean prime(int num) {
		for (int div = 2; div <= num / 2; div++) {
			if (num % div == 0) {
				return false;
			}
		}
		return true;
	}
}


