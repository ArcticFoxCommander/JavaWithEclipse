package unit1.Exercise3;

import java.util.Scanner;

public class Question14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Input your kg and height: ");
		double kg = input.nextDouble();
		double m = input.nextDouble();
		
		double bmi;	
	
		bmi = kg / (m *2);
		
		System.out.println("Your BMi is: " + bmi);
		System.out.println("Or just go to: https://www.nhlbi.nih.gov/health/educational/lose_wt/BMI/bmi-m.htm");
		
		input.close();
	}

}
