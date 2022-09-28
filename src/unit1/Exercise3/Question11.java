package unit1.Exercise3;

import java.util.Scanner;

public class Question11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum, prod, diff, quo;
		
		
		try (Scanner input = new Scanner(System.in)) {
			System.out.print("Input the first number: ");
			int n1 = input.nextInt();
			
			System.out.print("Input the second number: ");
			int n2 = input.nextInt();
			
			sum = n1 + n2;
			prod = n1 * n2;
			diff = n1 - n2;
			quo = n1 / n2;
		}
				
		System.out.println("Sum:" + sum);
		System.out.println("Product:" + prod);
		System.out.println("Difference:" + diff);
		System.out.println("Quotient:" + quo);
		}

}