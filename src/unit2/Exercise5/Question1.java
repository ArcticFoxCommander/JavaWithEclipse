package unit2.Exercise5;

public class Question1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int balance = 10;
		
		while (true) {
			if (balance < 9)
				break; // With continue will not work.
			balance = balance - 9;
		}
		
		System.out.println("Balance is: " + balance);
	}

}
