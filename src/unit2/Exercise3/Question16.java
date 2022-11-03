package unit2.Exercise3;

public class Question16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try (java.util.Scanner input = new java.util.Scanner(System.in)) {

			System.out.print("Enter a number: ");
			int num = input.nextInt();  /* Given number*/

			int aux, reverso;   /* Keep the part of the number that remains to be inverted */// keep the number backwards

			reverso = 0;

			for (aux = num; aux != 0; aux = aux /10) {
				reverso = reverso * 10 + aux % 10;  /* Add one more digit to the right */
													/* Throw away that digit */
			}
				if (reverso == num)
					System.out.printf("%d is palindrome\n", num);
				else
					System.out.printf("%d is not palindrome\n", num);
			
		}
	}
}