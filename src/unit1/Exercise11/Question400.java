package unit1.Exercise11;

public class Question400 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		java.util.Scanner input = new java.util.Scanner(System.in);
		System.out.print("Type your Social Securiy Number: ");
		String text = input.next();
		
		if ((text.length() == 3))
				System.out.println("True");
		else
			System.out.println("False");
		
	}

}
