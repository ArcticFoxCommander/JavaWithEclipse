package unit2;

public class KGtoP {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("Kilograms      Pounds |  Pounds      Kilograms\n");
		int kilograms = 1;
		int pounds = 20;

		while(kilograms <= 199) {
			System.out.printf("%4d           %5.1f  |    %d           %5.2f\n", kilograms, kilograms * 2.2, pounds, pounds / 2.2);
			kilograms += 2;
			pounds += 5;
		}
	}
}
