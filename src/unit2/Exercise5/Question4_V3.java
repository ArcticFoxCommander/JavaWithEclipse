package unit2.Exercise5;

public class Question4_V3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum = 0, number = 0;

		while (number <= 20) {

			if (!(number == 10 || number == 11)) {
				sum += number;
			}
				number++;
		}

		System.out.println("The sum is " + sum);
	}

}
