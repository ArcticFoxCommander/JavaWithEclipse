package unit4.Exercise6;

import java.util.Scanner;

public class Question9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		String[][] parray = province();
		int count = 0;
		
		for (int i = 0; i < parray.length; i++) {
			System.out.println("What is the capital of " + parray[i][0] + " ?");
			String capital = input.nextLine();
		}
		
		
	}

	public static String[][] province() {
		String[][] array = {
				{"Alberta", "Edmonton"},
				{"British Columbia", " Victoria"},
				{"Manitoba", " Winnipeg"},
				{"New Brunswick", " Fredericton"},
				{"Newfoundland and Labrador", " St. John’s"},
				{"Nova Scotia", " Halifax"},
				{"Ontario", " Toronto"},
				{"Prince Edward Island", " Charlottetown"},
				{"Quebec", " Quebec City"},
				{"Saskatchewan", " Regina"},
		};
		return array;
	}
}

