package unit2.Exercise3;

public class Question10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum = 0; int j = 0;

		for (int i = 0; i < 10; i++) {
			sum += i;
			
			System.out.println(sum);
			
			if (i < j)
				System.out.println(i);
			else
				System.out.println(j);
			
			while (j < 10) {
				j++;
			}
			
			do {
				j++;
			} while (j <10);
			
	}
}
}
