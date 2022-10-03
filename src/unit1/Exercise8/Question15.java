package unit1.Exercise8;

import java.util.Scanner;

public class Question15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter an integer: ");
		int numb = input.nextInt();
		
		System.out.println("Is " + numb + " divisible by 5 and 6? " + 
				((numb % 6 == 0) && (numb % 5 == 0)));
		
		System.out.println("Is " + numb + " divisible by 5 or 6? " + 
				((numb % 6 == 0) || (numb % 5 == 0)));
		
		System.out.println("Is " + numb + " divisible by 5 or 6? But not both! " + 
				((numb % 6 == 0) ^ (numb % 5 == 0)));
		
		input.close();
		
	}

}
