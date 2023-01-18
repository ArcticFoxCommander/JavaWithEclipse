package unit4.Exercise5;

import java.util.Scanner;

public class Question8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a string: ");
		String s = input.nextLine();
		System.out.println("Sorted string: " + sort(s));
	}



	public static String sort(String s) {
		char[] chars = s.toCharArray();
		java.util.Arrays.sort(chars);
		return new String(chars);
	}
}