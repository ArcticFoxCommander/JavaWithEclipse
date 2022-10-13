package unit1.Exercise11;

public class Question300 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		java.util.Scanner input = new java.util.Scanner(System.in);
		System.out.print("Type a word: ");
		String text = input.next();
		
		System.out.println(text + " has a length of " + text.length() + " and starts with " + text.charAt(0));
		
		input.close();
		
	}

}
