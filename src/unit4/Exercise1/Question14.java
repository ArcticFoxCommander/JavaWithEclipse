package unit4.Exercise1;

public class Question14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		java.util.Scanner input = new java.util.Scanner(System.in);
		int[] number = new int[10];
		System.out.print("Enter 10 numbers: ");
		for (int index = 0; index < number.length; index++)
			number[index] =  input.nextInt();

		System.out.println("The numbers in reverse order:");


		for (int index=number.length-1; index >= 0; index--)
			System.out.printf("%8d", number[index]);

	}
}
