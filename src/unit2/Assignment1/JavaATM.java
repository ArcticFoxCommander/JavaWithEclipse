package unit2.Assignment1;

public class JavaATM {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		java.util.Scanner input = new java.util.Scanner(System.in);
		// Scanner to listen to inputs.

		System.out.print("Enter the initial quantity of $100 bills: ");
		int ihundred = input.nextInt();
		System.out.print("Enter the initial quantity of $50 bills: ");
		int ififty = input.nextInt();
		System.out.print("Enter the initial quantity of $20 bills: ");
		int itwenty = input.nextInt();
		System.out.print("Enter the initial quantity of $10 bills: ");
		int iten = input.nextInt();
		System.out.print("Enter the initial quantity of $5 bills: ");
		int ifive = input.nextInt();
		// Input initial quantities.
		int ibal = (ihundred * 100) + (ififty * 50) + (itwenty * 20) + (iten * 10) + (ifive * 5);
		// Calculate quantity to values.
		System.out.println("Current Status: " + ihundred + " " + ififty + " " + itwenty + " " + iten + " " + ifive + ". Balance: $" + ibal);
		// Print status & balance.
		System.out.println("======================================================");
		System.out.println("");
		System.out.print("Enter the number of operations you wish to do: ");
		int opn = input.nextInt();
		// Input amount of operations to do.
		System.out.println("");
		if (opn <= 0) { 
			System.out.println("Invalid Input. Try 1 or higher.");
			System.exit(0);
			// Operation fail message.
		}
		int o = 1;
		int totaldep = 0; int withattempt = 0; int totalwith = 0;
		// Declaring variables.
		do {
			System.out.println("======================================================");
			System.out.println("");
			int rhundred = ihundred; int rfifty = ififty; int rtwenty = itwenty; int rten = iten; int rfive = ifive;
			System.out.print("Operation " + o + " (0 = Withdrawl, 1 = Deposit): ");
			int op = input.nextInt();
			// Input which type of operation you would like to do.

			if (op == 0) {

				System.out.print("Withdrawl amount: ");
				int withamt = input.nextInt();
				// Input withdrawal amount.
				totalwith += withamt;
				
				if (withamt >= 100 && ihundred > 1) {
                    int remover = Math.min((int) Math.floor(withamt / 100), ihundred);
                    withamt -= remover * 100;
                    rhundred -= remover;
                }
				
				if (withamt >= 50 && ififty > 1) {
                    int remover = Math.min((int) Math.floor(withamt / 50), ififty);
                    withamt -= remover * 50;
                    rfifty -= remover;
                }
				
				if (withamt >= 20 && itwenty > 1) {
                    int remover = Math.min((int) Math.floor(withamt / 20), itwenty);
                    withamt -= remover * 20;
                    rtwenty -= remover;
                }
				
				if (withamt >= 10 && iten > 1) {
                    int remover = Math.min((int) Math.floor(withamt / 10), iten);
                    withamt -= remover * 10;
                    rten -= remover;
                }
				
				if (withamt >= 5 && ifive > 1) {
                    int remover = Math.min((int) Math.floor(withamt / 5), ifive);
                    withamt -= remover * 5;
                    rfive -= remover;
                }
	
				
				if (withamt > 0) {
					System.out.println("There are not enough bills to fufill this withdrawal request.");
					// Cannot withdraw fail message.
					withattempt += withamt;
					// Withdrawal fail attempt storing.

				}
				else {
					ihundred += rhundred; ififty += rfifty; itwenty += rtwenty; iten += rten; ifive += rfive;
					ibal = (rhundred * 100) + (rfifty * 50) + (rtwenty * 20) + (rten * 10) + (rfive * 5);
					System.out.println("Current Status: " + rhundred + " " + rfifty + " " + rtwenty + " " + rten + " " + rfive + ". Balance: $" + ibal);
					// Print status & balance.
				}
			}
			else if (op == 1) {
				System.out.print("Enter the quantity of $100 bills: ");
				int dhundred = input.nextInt();
				System.out.print("Enter the quantity of $50 bills: ");
				int dfifty = input.nextInt();
				System.out.print("Enter the quantity of $20 bills: ");
				int dtwenty = input.nextInt();
				System.out.print("Enter the quantity of $10 bills: ");
				int dten = input.nextInt();
				System.out.print("Enter the quantity of $5 bills: ");
				int dfive = input.nextInt();
				// Input deposit quantities.
				ihundred += dhundred; ififty += dfifty; itwenty += dtwenty; iten += dten; ifive += dfive;
				// Add initial quantities to deposit quantities.
				int fbal = (dhundred * 100) + (dfifty * 50) + (dtwenty * 20) + (dten * 10) + (dfive * 5);			
				System.out.println("The total deposited is: $" + fbal);
				ibal += fbal;
				// Complete the loop by adding initial operation status with current.
				System.out.println("Current Status: " + ihundred + " " + ififty + " " + itwenty + " " + iten + " " + ifive + ". Balance: $" + ibal);
				totaldep += fbal;
				// Total deposits made storing. 
			}
			else {
				System.out.println("Incorrect Input. Enter (0 = Withdrawl, 1 = Deposit)");
				System.exit(0);
				// Invalid operation fail message.
			}
			System.out.println("");
			o++;
		} while (opn >= o);
		// Loop finishes when operations match.
		totalwith = totalwith - withattempt;
		// Successful withdrawals minus failed withdrawals. 
		System.out.println("==================== Final Report ====================");
		System.out.println("");
		System.out.println("Total value of deposits:                   $" + totaldep);
		System.out.println("Total value of withdrawl fail attempt:     $" + withattempt);
		System.out.println("Total value of withdrawls made:            $" + totalwith);
		// Print final report.
		input.close();
		// Close scanner.

	}

}
