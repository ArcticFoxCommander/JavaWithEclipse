package unit3;

import java.util.Scanner;

public class AlfieChecker {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);

		System.out.print("Is Alfie home? (0 = NO | 1 = YES): ");
		int i = input.nextInt();

		if (i == 0) 
			System.out.println("Congratulations! You can relax!"); 
			System.exit(0);
			
		if (i == 1) 
			System.out.print("What day is it? (0 = FRIDAY - SATURDAY | 1 = SUNDAY - THURSDAY): ");
		int j = input.nextInt();
		
		if (i < 0 || i > 1)
			System.out.println("Incorrect Input! Try again!");
			System.exit(0);

		if (j == 0) {
			System.out.println("Sorry! Alfie is home! Please run this checker tomorrow to see if you can relax!");
			System.exit(0);
		}
		else
			System.out.print("Whereabouts is Alfie? (0 = Outside | 1 = Kitchen | 2 = Living Room | 3 = Bathroom | 4 = Bedroom): ");
			int k = input.nextInt();

		if (k == 0) {
			System.out.println("You can relax!");
			System.exit(0);
		}
		else if (k == 1) {
			System.out.println("You may relax! Just hope Alfie isn't helping in tonight's dinner!");
			System.exit(0);
		}
		else if (k == 2) {
			System.out.println("Sorry! Your discord calls may have a child in the background!");
			System.exit(0);
		}
		else if (k == 3) {
			System.out.println("You have limited time to relax! Unless Alfie is doing a #.");
			System.exit(0);
		}
		else
			System.out.println("You're basically screwed. Have fun getting some sleep or getting Alfie to sleep.");
			System.exit(0);


		input.close();			
	}
}


