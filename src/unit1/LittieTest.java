package unit1;

public class LittieTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		java.util.Scanner input = new java.util.Scanner(System.in);
		
		System.out.println("What is Litie's discriminator number?: ");
		int a = input.nextInt();
		
		if(a == 2979)
			System.out.println("You know Littie! :D <3");
		else
			System.out.println("You don't know Littie...");
		
		input.close();
	}

}
