package unit2.Exercise3;

public class Question19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("Kilograms      Pounds |  Pounds      Kilograms\n");
		int pounds = 20;

		for(int kilograms = 1; kilograms <= 199; kilograms += 2) {
			System.out.printf("%4d           %5.1f  |    %d           %5.2f\n", kilograms, kilograms * 2.2, pounds, pounds / 2.2);
			pounds += 5;
		}
	}
}