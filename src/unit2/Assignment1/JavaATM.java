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
		int opn = input.nextInt();

		int o = 1;

		do {

			System.out.print("Operation " + o + " (0 = Withdrawl, 1 = Deposit): ");
			int op = input.nextInt();

			int hrem = 0; int frem = 0; int twrem = 0; int trem = 0; int firem = 0;
			

			if (op == 0) {
				System.out.print("Withdrawl amount: ");
				int withamt = input.nextInt();

				if (withamt % 100 == 0) {
                    hrem = hundred - (withamt / 100);
                }
                else if (withamt % 50 == 0 && withamt / 100 > fifty) {
                    frem = fifty - (withamt / 50);
                }
                else if (withamt % 20 == 0) {
                    twrem = twenty - (withamt / 20);
                }
                else if (withamt % 10 == 0) {
                    trem = ten - (withamt / 10);
                }
                else if (withamt % 5 == 0) {
                    firem = five - (withamt / 5);
                }

				int withbal = (hrem * 100) + (frem * 50) + (twrem * 20) + (trem * 10) + (firem * 5);
				System.out.println("Current Status: " + hrem + " " + frem + " " + twrem + " " + trem + " " + firem + ". Balance: " + withbal);



			}
			else if (op == 1) {
				System.out.println("Deposit");
			}
			else {
				System.out.println("Incorrect Input. Enter (0 = Withdrawl, 1 = Deposit)");
			}

			o++;	
		} while (opn >= o);


	}

}
