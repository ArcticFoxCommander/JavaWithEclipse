package unit4.Exercise1;

public class Question15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		java.util.Scanner input = new java.util.Scanner(System.in);

		int[] array = new int[101];

		System.out.print("Enter integers between 1 and 100 (REMEMBER TO PUT A 0 AT THE END): ");
		int counter = input.nextInt();
		while (counter != 0) {
			array[counter]++;
			counter = input.nextInt();
		}
		for(int index = 0; index < array.length; index++)
			if (array[index] > 1)
				System.out.printf("%3d occurs %d times.\n", index, array[index]);
			else
				if (array[index] == 1)
					System.out.printf("%3d occurs %d time.\n", index, array[index]);
		
		input.close();
	}
}


