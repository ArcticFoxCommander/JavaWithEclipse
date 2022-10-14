package unit1.Exercise11;

public class Question400 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		java.util.Scanner input = new java.util.Scanner(System.in);

		System.out.print("Enter a SSN: ");
		String text = input.nextLine();

		boolean isValid = 
				(text.length() == 11) && 
				(Character.isDigit(text.charAt(0))) &&
				(Character.isDigit(text.charAt(1))) &&
				(Character.isDigit(text.charAt(2))) &&
				(text.charAt(3) == '-') &&
				(Character.isDigit(text.charAt(4))) &&
				(Character.isDigit(text.charAt(5))) &&
				(Character.isDigit(text.charAt(7))) &&
				(text.charAt(6) == '-') &&
				(Character.isDigit(text.charAt(8))) &&
				(Character.isDigit(text.charAt(9))) &&
				(Character.isDigit(text.charAt(10)));

		System.out.println(text + " is " + ((isValid) ? "a valid " : "an invalid ")
				+ "social security number");

		input.close();
	}

}
