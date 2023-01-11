package unit4.Exercise2;

public class Question8 {

	public static void main(String[] args) {
		java.util.Scanner in = new java.util.Scanner(System.in);
		double[] vals = new double[10];
		System.out.print("Please enter two double values: ");
		for (int i = 0; i < 10; i++) 
			vals[i] = in.nextDouble();

		System.out.printf("The average is: %.2f", average(vals));
	}



	public static int average(int[] array) {
		int sum = 0;
		for (int val : array)
			sum += val;
		return sum / array.length;
	}



	public static double average(double[] array) {
		double sum = 0.0;
		for (double val : array) 
			sum += val;
		return sum / array.length;
	}
}