package unit2.Exercise3;

public class Question11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("Kilograms      Pounds\n");
		int pounds = 20;

		for(int kilograms = 1; kilograms <= 199; kilograms += 2) {
			System.out.printf("%4d           %5.1f\n", kilograms, kilograms * 2.2, pounds, pounds / 2.2);
			pounds += 5;
		}
	}
}