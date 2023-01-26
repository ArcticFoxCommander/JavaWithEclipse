package unit4.Assignment1;

import java.util.Scanner;

public class JavaGradeBook {
	public static void main(String[] args) {
		System.out.println("w");
	}
	public static void processingData() throws Exception {
		// TODO Auto-generated method stub
		// Create a File instance
				java.io.File file = new java.io.File("marks.txt");

				// Create a Scanner for the file
				Scanner input = new Scanner(file);
				
				int count = 0;
				
				double[] garray = new double[3];
				double[] harray = new double[4];
				double[] quizarray = new double[3];
				double[] exercisearray = new double[4];
				
				// Read data from a file
				while (input.hasNext()) {
					
					double n = input.nextDouble();
					double p = input.nextDouble();
					double m = input.nextDouble();
					System.out.println(n + " " + p + " " + m);
					
					for (int g = 0; g < garray.length; g++)
						garray[g] = input.nextDouble();
					
					for (int h = 0; h < harray.length; h++)
						harray[h] = input.nextDouble();
					
					for (int s = 0; s < sd.length; s++)
						String student = input.next();
					
						sd[s] = student();
					
					for (int i = 0; i < quizarray.length; i++)
					quizarray[i] = input.nextDouble();
					for (int j = 0; j < exercisearray.length; j++)
					exercisearray[j] = input.nextDouble();
					
					for (int k = 0; k < quizarray.length && k < exercisearray.length; k++)
						System.out.println(quizarray[k] + " " + exercisearray[k]);
				}
				
				

				// Close the file
				input.close();
	}

}
