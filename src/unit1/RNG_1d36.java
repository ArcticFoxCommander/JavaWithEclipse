package unit1;

import java.util.Scanner;

public class RNG_1d36 {

	public static void main(String[] args) { 
		
	Scanner input = new Scanner(System.in);
		
	System.out.print("1d");
	int a = input.nextInt();
		
	int min = 1;  
	int max = a;  
	// Roll anything 1d#  
	int calc = (int)(Math.random()*(max-min+1)+min);  
	System.out.println("You rolled a " + calc);  

	input.close();
	}
}  