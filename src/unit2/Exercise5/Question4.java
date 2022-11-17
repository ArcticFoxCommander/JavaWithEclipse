package unit2.Exercise5;

public class Question4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum = 0, number = 0;
		
		while (number < 20 && sum <= 100) {
			number++;
			sum += number;
			
		// if (sum >= 100)
		// break;
		}
		
		System.out.println("The number is " + number);
		System.out.println("The sum is " + sum);
	}

}
