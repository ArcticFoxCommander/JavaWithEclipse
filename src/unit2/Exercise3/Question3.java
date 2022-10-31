package unit2.Exercise3;

import java.util.Scanner;

public class Question3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		int number, sum = 0, count;
		
		for (count = 0; count < 5; count++) {
			System.out.print("Input number: ");
			number = input.nextInt();
			sum += number;
			
		}
		
		input.close();
		System.out.println("Sum is " + sum);
		System.out.println("Count is " + count);
	}

}
 