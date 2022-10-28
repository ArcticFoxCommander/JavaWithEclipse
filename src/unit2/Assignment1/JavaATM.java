package unit2.Assignment1;

public class JavaATM {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		java.util.Scanner input = new java.util.Scanner(System.in);

		System.out.print("Enter the initial quantity of $100: ");
		int ihundred = input.nextInt();
		System.out.print("Enter the initial quantity of $50: ");
		int ififty = input.nextInt();
		System.out.print("Enter the initial quantity of $20: ");
		int itwenty = input.nextInt();
		System.out.print("Enter the initial quantity of $10: ");
		int iten = input.nextInt();
		System.out.print("Enter the initial quantity of $5: ");
		int ifive = input.nextInt();

		int balance = (ihundred * 100) + (ififty * 50) + (itwenty * 20) + (iten * 10) + (ifive * 5);
		System.out.println("Current Status: " + ihundred + " " + ififty + " " + itwenty + " " + iten + " " + ifive + ". Balance: " + balance);

		System.out.print("Enter the number of operations: ");
		int opn = input.nextInt();

		int o = 1;
		int totaldep = 0;

		do {


			System.out.print("Operation " + o + " (0 = Withdrawl, 1 = Deposit): ");
			int op = input.nextInt();
			int withbal = 0;
			int dbalance = 0;
			int hrem = 0; int frem = 0; int twrem = 0; int trem = 0; int firem = 0;
			int dhundred = 0; int dfifty = 0; int dtwenty = 0; int dten = 0; int dfive = 0;
			int hundred = ihundred + dhundred; int fifty = ififty + dfifty; int twenty = itwenty + dtwenty; int ten = iten + dten; int five = ifive + dfive;
			int whundred = hundred; int wfifty = fifty; int wtwenty = twenty; int wten = ten; int wfive = five;
			
			if (op == 0) {

				System.out.print("Withdrawl amount: ");
				int withamt = input.nextInt();

				if (withamt >= 100 && withamt / 100 <= whundred) {
					int remover = (int) Math.floor(withamt / 100);
					withamt -= remover * 100;
					hrem = whundred - remover;
				}

				if (withamt >= 50 && withamt / 50 <= wfifty) {
					int remover = (int) Math.floor(withamt / 50);
					withamt -= remover * 50;
					frem = wfifty - remover;
				}

				if (withamt >= 20 && withamt / 20 <= wtwenty) {
					int remover = (int) Math.floor(withamt / 20);
					withamt -= remover * 20;
					twrem = wtwenty - remover;
				}

				if (withamt >= 10 && withamt / 10 <= wten) {
					int remover = (int) Math.floor(withamt / 10);
					withamt -= remover * 10;
					trem = wten - remover;
				}

				if (withamt >= 5 && withamt / 5 <= wfive) {
					int remover = (int) Math.floor(withamt / 5);
					withamt -= remover * 5;
					firem = wfive - remover;
				}

				if (withamt > 0) {
					System.out.println("You cant afford to withdraw this much!");


				} else {
					withbal = (hrem * 100) + (frem * 50) + (twrem * 20) + (trem * 10) + (firem * 5);
					System.out.println("Current Status: " + hrem + " " + frem + " " + twrem + " " + trem + " " + firem + ". Balance: " + withbal);
				}
			}


			else if (op == 1) {
				System.out.print("Enter the quantity of $100: ");
				dhundred = input.nextInt();
				System.out.print("Enter the quantity of $50: ");
				dfifty = input.nextInt();
				System.out.print("Enter the quantity of $20: ");
				dtwenty = input.nextInt();
				System.out.print("Enter the quantity of $10: ");
				dten = input.nextInt();
				System.out.print("Enter the quantity of $5: ");
				dfive = input.nextInt();
				
				int fhundred = dhundred + whundred; int ffifty = dfifty + wfifty; int ftwenty = dtwenty + wtwenty; int ften = dten + wten; int ffive = dfive + wfive;
			
				dbalance = (dhundred * 100) + (dfifty * 50) + (dtwenty * 20) + (dten * 10) + (dfive * 5);
				int fbal = 0; fbal = withbal + balance + fbal + dbalance;
				System.out.println("The total deposit is: " + dbalance);
				System.out.println("Current Status: " + fhundred + " " + ffifty + " " + ftwenty + " " + ften + " " + ffive + ". Balance: " + fbal);
			}
			else {
				System.out.println("Incorrect Input. Enter (0 = Withdrawl, 1 = Deposit)");
				System.exit(0);
			}

			o++;
		} while (opn >= o);

		System.out.println("Total value of deposits:                 " + totaldep);
		System.out.println("Total value of withdrawl attemps:        ");
		System.out.println("Total value of withdrawls made:          ");

		input.close();

	}

}
