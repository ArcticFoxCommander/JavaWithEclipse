package unit2.Exercise3;

public class Question17 {

	public static void main(String[] args) {
		long factorial = 0;
		for (int i = 1; i <= 20; i++) {
			factorial = 1;
			for (int j = 1; j <= i; j++) {
				factorial *=j;
			}
			System.out.println(i + " = " + factorial);
		}
	}
}
