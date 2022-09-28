package unit1;

import java.util.Scanner;

public class IncrementTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Input your number: ");
		int num = input.nextInt();
		
		num++;
		
		System.out.println("Original Number + 1 = " + num);
		
		input.close();
	}

}
