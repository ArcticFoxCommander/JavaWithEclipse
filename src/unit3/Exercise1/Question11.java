package unit3.Exercise1;

import java.util.Scanner;

public class Question11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.print("Input a permutation: ");
		int a = input.nextInt();
		System.out.println("Input a second permutation: ");
		int b = input.nextInt();
		
		int p = 1;
		
		for (int d = 1; d <= 9; d++) {
		if (count(a, d) = count (b, a)) {
			p = 0;
			break;
		}}
		}

	public static int count(int n, int d) {
		int count = 0; 
		while (n != 0) {
			if (n % 10 == d)
				count++;
			n = n / 10;
		}
		return count;
	}
	
}
