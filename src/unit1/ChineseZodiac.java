package unit1;

import java.util.Scanner;

public class ChineseZodiac {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter a year: ");
		int year = input.nextInt();
		
		switch (year % 12) {
		case 0: System.out.println("Monkey"); break;
		case 1: System.out.println("Rooster"); break;
		case 2: System.out.println("Dog"); break;
		case 3: System.out.println("Pig:"); break;
		case 4: System.out.println("Rat"); break;
		case 5: System.out.println("Ox"); break;
		case 6: System.out.println("Tiger"); break;
		case 7: System.out.println("Rabbit"); break;
		case 8: System.out.println("Dragon"); break;
		case 9: System.out.println("Snake"); break;
		case 10: System.out.println("Horse"); break;
		case 11: System.out.println("Sheep");
		
		input.close();
		
		}
		
		
	}

}
