package unit4.Exercise1;

public class Question16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		java.util.Scanner input = new java.util.Scanner(System.in);

		int[] scores = new int [100];

		int sum = 0, counter = 0;

		System.out.print("Enter scores: ");
		int number = input.nextInt();
		while (number > 0) {
			scores[counter] = number;
			sum += number;
			number = input.nextInt();
			counter++;
		}

		int maxscore = counter, above = 0, below = 0, average = sum / maxscore;

		for (int count = 0; count < maxscore; count++)
			if (scores[count] < average)
				below++;
			else
				above++;
		
		System.out.println(above + " " + below + " " + average);
	}

}
