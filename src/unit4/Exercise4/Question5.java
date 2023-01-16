package unit4.Exercise4;

import java.util.Scanner;

public class Question5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter number of values: ");
		int number = input.nextInt();
		
		int[] values = new int[number];
		
		System.out.print("Enter the vaules: ");
		for (int i = 0; i < values.length; i++)
			values[i] = input.nextInt();        
        
        if (isConsecutiveFour(values))
        		System.out.println("The list has consecutive fours.");
        else
        	System.out.println("The list has no consecutive fours.");
		
	}
	
	public static boolean isConsecutiveFour(int[] values) {
		int e = 1;
		
		for (int i = 0; i < values.length - 1; i++) {
			
			if (values[i] == values [i + 1])
				e++;
			
			if (values[i] != values [i + 1])
				e = 1;
			
			if (e >= 4)
				return true;
			
			
		}
		
		return false;
		
		
	}

}
