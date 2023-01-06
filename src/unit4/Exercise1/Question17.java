package unit4.Exercise1;

public class Question17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] number = new int [10];
		int counter = 1;
		
		int digit = (int) (Math.random() * 10);
		while (counter <= 100) {
			number[digit]++;
			digit = (int) (Math.random() * 10);
			counter++;
		}

		for (int i = 0; i < 10; i++)
			System.out.printf("%2d %2d's \n", number[i], i);
	}

}
