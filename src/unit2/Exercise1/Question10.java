package unit2.Exercise1;

public class Question10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 100, lines = 0;

		while (i <= 200) {
			if (i % 5 == 0 ^ i % 6 == 0) {
				System.out.print(i + " ");
				++lines;
				if (lines % 10 == 0) {
					System.out.println(i);      
				}

			}
			++i;
		}

	}
}


