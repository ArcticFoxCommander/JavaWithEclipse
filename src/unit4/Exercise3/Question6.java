package unit4.Exercise3;

import java.util.Scanner;

public class Question6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		System.out.print("Input numbers for list 1: ");
		int numlist = input.nextInt();
		
		int[] list1 = new int[numlist];
        for (int i = 0; i < numlist; i++) 
        list1[i] = input.nextInt();
		
		System.out.print("Input numbers for list 2: ");
		numlist = input.nextInt();
       
        int[] list2 = new int[numlist];
        for (int i = 0; i < numlist; i++) 
        list2[i] = input.nextInt();
        
        if (equals(list1, list2)) {
        	System.out.println("The two lists are identical.");
        }
        else {
        System.out.println("The two lists are not indentical");
        }
        		
        input.close();
        
	}

    public static boolean equals(int[] list1, int[] list2) {

        if (list1.length != list2.length)
        	return false;


        for (int i = 0; i < list1.length; i++) {
            if (list1[i] != list2[i]) 
            	return false;
        }

        return true;
    }
}