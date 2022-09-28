package unit1.Exercise2;

public class Question16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum, sum2, sum22, sum3, digit; // Defined variables :D

		sum = 932;
		
		sum2 = sum / 10 % 10;
		sum22 = sum / 10 / 10;
		sum3 = sum % 10;
		
		digit = sum2 + sum22 + sum3;
		
		System.out.println("The sum of " + sum + " is " + digit); // Your result.
	}

}
