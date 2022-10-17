package unit2.Exercise1;

import java.util.Scanner;

public class Question4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.print("Input numbers");
		
		int number, max;
		number = input.nextInt();
		max = number;
		
		while (number != 0) {
			number = input.nextInt();
			if (number > max)
				max = number;
		}
		
		System.out.println("Max is " + max);
		System.out.println("Number is " + number);
		
		input.close();
	}

}
