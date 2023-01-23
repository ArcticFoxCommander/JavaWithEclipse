package unit4.Assignment1;

import java.util.Scanner;

public class JavaGradeBook {
	public static void main(String[] args) {
	
	}
	public static void processingData() throws Exception {
		// TODO Auto-generated method stub
		// Create a File instance
				java.io.File file = new java.io.File("marks.txt");

				// Create a Scanner for the file
				Scanner input = new Scanner(file);
				
				int count = 0;
				
				
				
				double[] quizarray = new double[3];
				double[] exercisearray = new double[4];
				
				// Read data from a file
				while (input.hasNext()) {
					
					for (int f = 0; f < e++)
					
					for (int g = 0; g <; f++)
						
					for (int h = 0; h <; h++)
					String name = input.next();
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
