package unit4.Exercise1;

public class Question15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		java.util.Scanner input = new java.util.Scanner(System.in);
		
		int[] arr = new int[100];
		
		System.out.print("Enter the integers between 1 and 100: ");
		for (int index = 0; index < arr.length; index++)
		arr[index] = input.nextInt();
		
		for (int index = arr.length-1; index >= 0; index--)
		System.out.println(arr[index]);
	}

}
