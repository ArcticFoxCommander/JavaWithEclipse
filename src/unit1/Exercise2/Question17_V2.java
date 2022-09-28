package unit1.Exercise2;

public class Question17_V2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double subtotal = 10;
		double grat = 15;
		
		grat = subtotal * (grat / 100);
		subtotal = subtotal + grat;
		
		System.out.println(grat);
		System.out.println(subtotal);
	}

}
