package unit2;

public class WithoutBreakOrContinue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int factor = 2;
		int n = 10;
		while (factor <= n) {
			if (n % factor == 0)
				break;
			factor++;
		}
		
		System.out.println("The smallest factor other than 1 for " + n + " is " + factor);
	}

}
