package unit3.Exercise1;

public class Question11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		java.util.Scanner input = new java.util.Scanner(System.in);
		System.out.print("Input a permutation: ");
		int a = input.nextInt();
		System.out.println("Input a second permutation: ");
		int b = input.nextInt();

		int p = 1;

		for (int d = 1; d <= 9; d++) 
			if (count(a, d) != count(b, d)) {
				p = 0;
				break;
			}
			
			if (p == 1)
				System.out.printf("%d is a permutation of %d\n" , a, b);
			else
				System.out.printf("%d is not a permutation of %d\n" , a, b);
			input.close();
		
	}

	public static int count(int n, int d) {
		int count = 0; 
		while (n > 0) {
			if (n % 10 == d)
				count++;
			n /= 10;
		}
		return count;
	}

}
