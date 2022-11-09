package unit2.Exercise4;

public class Question14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum;
		// Declare i from 1 - 10000.
		for (int i = 1; i < 10000; i++) {
			sum = 0;
			// Declare k from 1 - 10000.
			for (int k = 1; k < i; k++) {
				// Checks if it can be divided between i and k.
				if (i % k == 0)
					// Add assign to sum.
					sum += k;
			}
			// If 1 - 10000 equals to the checker "sum += k"
			if (i == sum)
				System.out.printf("%d\n", i);
		}
	}
}