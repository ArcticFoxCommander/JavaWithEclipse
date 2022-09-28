package unit1.Exercise4;

import java.util.Scanner;

public class Question6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		
		System.out.print("Input 5 numbers: ");
		int digit = input.nextInt();
		
		int a, b, c, d, e;
		
		a = digit % 10;
		b = digit / 10 % 10;
		c = digit / 100 % 10;
		d = digit / 1000 % 10;
		e = digit / 10000 % 10;
		
		System.out.println(e + "   " + d + "   " + c + "   " + b + "   " + a + "   ");
		
		input.close();
		
	}

}
