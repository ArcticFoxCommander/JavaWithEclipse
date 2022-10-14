package unit1.Exercise11;

import java.util.Scanner;

public class Question500 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		System.out.print("Enter first string: ");
		String one = input.nextLine();
		System.out.print("Enter second string: ");
		String two = input.next();
		
		if (one.indexOf(two) != -1){
		      System.out.println(two + " is a substring of " + one);}
	    else {
	      System.out.println(two + " is not a substring of " + one);}
		
		input.close();
	}

}
