package unit3.Exercise1;

public class Question13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i = 1; 1 < 101; i++) {
			System.out.printf("%d", gPN(i));
			if (i % 10 == 0)
				System.out.println("\n");
		}
	}
	
	public static int gPN(int n) {
		
		return (n * (3 * n - 1)) / 2;
	}

}
