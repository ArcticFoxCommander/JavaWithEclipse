package unit2.Exercise5;

public class Question2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum = 0;
		for (int i = 0; i < 4; i++) {
			if (i % 3 == 0) continue;
			sum += i;
		}

		/*
		 int i = 0, sum = 0;
		    while (i < 4) {

			if (i % 3 == 0) continue;
			sum += i;

			i++;

		}
		 */

		System.out.println(sum);
	}

}
