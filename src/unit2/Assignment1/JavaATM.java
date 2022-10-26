package unit2.Assignment1;

public class JavaATM {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		java.util.Scanner input = new java.util.Scanner(System.in);
		
		System.out.print("Enter the initial quantity of $100: ");
		int hundred = input.nextInt();
		System.out.print("Enter the initial quantity of $50: ");
		int fifty = input.nextInt();
		System.out.print("Enter the initial quantity of $20: ");
		int twenty = input.nextInt();
		System.out.print("Enter the initial quantity of $10: ");
		int ten = input.nextInt();
		System.out.print("Enter the initial quantity of $5: ");
		int five = input.nextInt();
		
		int balance = (hundred * 100) + (fifty * 50) + (twenty * 20) + (ten * 10) + (five * 5);
		
		System.out.println("Current Status: " + hundred + " " + fifty + " " + twenty + " " + ten + " " + five + ". Balance: " + balance);
		
		System.out.print("Enter the number of operations: ");
		int op = input.nextInt();
		
		do {
			
			System.out.println("Hi");
			
		} while (op <= op);
		
		
	}

}
