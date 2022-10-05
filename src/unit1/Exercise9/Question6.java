package unit1.Exercise9;

public class Question6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double tax, income = 10000;

		if (income > 10000) {
			tax = income * 0.2;}
		else {
			tax = income * 0.17 + 1000;}
		
		System.out.println(tax);
	}
}