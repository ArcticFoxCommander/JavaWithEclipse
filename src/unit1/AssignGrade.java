package unit1;

public class AssignGrade {

	public static void main(String[] args) {
		// TODO Auto-generated method stub 
		// Create a Scanner
		java.util.Scanner input = new java.util.Scanner(System.in);
		// Enter a score for a student
		System.out.print("Enter a score for a student: "); 
		double score = input.nextDouble();
		// Process a score 
		if(score >= 90)
			System.out.println("The student's grade is A");
		else if(score >= 80)
			System.out.println("The student's grade is B");
		else if(score >= 70)
			System.out.println("The student's grade is C");
		else if(score >= 60)
			System.out.println("The student's grade is D");
		else System.out.println("The student's grade is F");

		input.close();

	}
}