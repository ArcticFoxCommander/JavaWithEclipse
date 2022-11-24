package unit3.Exercise1;

public class Question12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public static boolean fit(int a, int b) {
		while (b != 0 && a % 10 == b % 10) {
			// Percentage takes the last digit and checks in loop.
			// While b is 0 (empty) AND both digits match then loop = true.
			a /= 10; // Divide
			b /= 10; // Removes the last digit
			}
		
		if (b == 0)
			// If b is 0 then return true because the while loop 
			// has removed all the digits because it has checked true with a.
			return true;
		else
			return false;
		
	}
}
