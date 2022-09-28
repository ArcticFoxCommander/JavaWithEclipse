package unit1;

public class SumDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum, sum2, sum22, sum3, digit; // Defined variables :D

		sum = 932; // Put your SUM here.
		
		sum2 = sum / 10 % 10;
		sum22 = sum / 10 / 10;
		sum3 = sum % 10;
		
		digit = sum2 + sum22 + sum3;
		
		System.out.println("The sum of " + sum + " is " + digit); // Your result.
	}

}
