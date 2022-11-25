package unit3.Exercise1;

public class Question12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		java.util.Scanner input = new java.util.Scanner(System.in);

		System.out.println("Input first number: ");
		int a = input.nextInt();
		System.out.println("Input second number: ");
		int b = input.nextInt();

		input.close();

		int major = a, minor = b;

		if (a > b) {
			minor = a;
			major = b;
		}
		else {
			major = b;
			minor = a;
		}
		
		// If b is the greater one than a, switch the two around.
		
		segment(major, minor);
	}

	public static void segment(int minor, int major) {
		int a = major, b = minor;
		boolean answer = false;

		while (major > minor) {
			if (fit(major, minor)) {
				answer = true;
				break;
			}
			major /= 10;
		}

		if (answer == true) 
			System.out.println(b + " is a segment of " + a);
		else
			System.out.println(b + " is not a segemnt of the other");
	}

	public static boolean fit(int a, int b) {
		while (b != 0 && a % 10 == b % 10) {
			// Percentage takes the last digit and checks in loop.
			// While b is 0 (empty) AND both digits match then loop = true.
			a /= 10; // Divide
			b /= 10; // Removes the last digit
		}

		if (b == 0)
			// If b is 0 then return true because the while loop ...
			// has removed all the digits because it has checked true with a.
			return true;
		else
			return false;

	}
}
