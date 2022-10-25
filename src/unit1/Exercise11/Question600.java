package unit1.Exercise11;

import java.util.Scanner;

public class Question600 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		System.out.print("Enter employee's name");
		String name = input.next();
		System.out.print("Enter number of hours worked in a week: ");
		double hw = input.nextDouble();
		System.out.print("Enter hourly pay rate: ");
		double pr = input.nextDouble();
		System.out.print("Enter federal tax withholding rate: ");
		double ftr = input.nextDouble();
		System.out.print("Enter state tax withholding rate: ");
		double str = input.nextDouble();
		
		double gp = hw * pr;
		
		input.close();
	}

}
