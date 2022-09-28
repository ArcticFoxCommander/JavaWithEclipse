package unit1.Exercise3;

import java.util.Scanner;

public class Question16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Input your subtotal and gratuity: ");
		double subtotal = input.nextDouble();
		double grat = input.nextDouble();
		
		grat = subtotal * (grat / 100);
		
		double total;
		
		total = grat + subtotal;
		
		System.out.println("$" + total);
		
		input.close();
	}

}
