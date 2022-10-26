package unit2.Exercise2;

public class Question8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		java.util.Scanner input = new java.util.Scanner(System.in);

		System.out.print("Enter a number: ");
		int num = input.nextInt();  /* Given number  */

		int aux,   /* Keep the part of the number that remains to be inverted */
		reverso;   // keep the number backwards

		aux = num;
		reverso = 0;

		do {
			reverso = reverso * 10 + aux % 10;  /* Add one more digit to the right */
			aux = aux / 10;                     /* Throw away that digit */
		} while (aux != 0);

		if (reverso == num)
			System.out.printf("%d is palindrome\n", num);
		else
			System.out.printf("%d is not palindrome\n", num);
		
		input.close();
		
	}

}
